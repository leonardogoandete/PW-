package aula9.carroDao;

import aula9.config.ConnectionFactory;
import aula9.model.CarroPojo.Carro;
import aula9.model.CarroPojo.Placa;
import aula9.sql.sqlCarro;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class CarroDAO implements GenericDAO<Carro> {
    @Override
    public int insert(Carro carro) {
        int chavePrimaria = -1;
        int idPlaca = new PlacaDAO().insert(carro.getPlaca());
        if (idPlaca == -1) return -1;
        try (Connection connection = new ConnectionFactory().getConnection();
             PreparedStatement stmt = connection.prepareStatement(sqlCarro.INSERT.getQuery(), Statement.RETURN_GENERATED_KEYS)) {
            stmt.setInt(1,carro.getAno());
            stmt.setString(2,carro.getModelo());
            stmt.setString(3, carro.getMontadora());
            stmt.setInt(4,idPlaca);
            stmt.execute();
            ResultSet chaves = stmt.getGeneratedKeys();
            if (chaves.next()) chavePrimaria= chaves.getInt(1);
        } catch (SQLException ex) {
            System.out.println("Erro no cadastro de carro!\n" + ex.getMessage() +"\n"+ ex.getSQLState());
        }
        return -1;
    }

    @Override
    public int update(Carro carro) {
        return 0;
    }

    @Override
    public int delete(Carro carro) {
        return 0;
    }

    @Override
    public List<Carro> listAll() {
        List<Carro> lista = new LinkedList<>();
        try (Connection connection = new ConnectionFactory().getConnection();
             PreparedStatement stmt = connection.prepareStatement(sqlCarro.LISTALL.getQuery())) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                lista.add(new Carro(
                        rs.getInt("ano"),
                        rs.getString("modelo"),
                        rs.getString("montadora"),
                        new Placa(rs.getString("letras"),
                                  rs.getInt("numeros"))
                ));
            }
            return lista;
        } catch (SQLException ex) {
            System.out.println("Erro na consulta!\n" + ex.getMessage());
        }
        return null;
    }

    @Override
    public Carro findByID(int id) {
        String sql = sqlCarro.FINDBYID.getQuery() + id;
        try (Connection connection = new ConnectionFactory().getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                return new Carro(
                        rs.getInt("ano"),
                        rs.getString("modelo"),
                        rs.getString("montadora"),
                        new Placa(rs.getString("letras"),
                                  rs.getInt("numeros"))
                );
            }
        } catch (SQLException ex) {
            System.out.println("Erro na consulta!\n" + ex.getMessage());
        }
        return null;
    }
}
