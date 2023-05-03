package aula9.model.carroDao;

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
            stmt.setString(2,carro.getModelo().toLowerCase());
            stmt.setString(3, carro.getMontadora().toLowerCase());
            stmt.setInt(4,idPlaca);
            stmt.execute();
            ResultSet chaves = stmt.getGeneratedKeys();
            if (chaves.next()) chavePrimaria= chaves.getInt(1);
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir carro!\n" + ex.getMessage() +"\n"+ ex.getSQLState());
        }
        return -1;
    }

    @Override
    public int update(Carro carro) {
        try (Connection connection = new ConnectionFactory().getConnection();
             PreparedStatement stmt = connection.prepareStatement(sqlCarro.UPDATE.getQuery())) {
            stmt.setString(1,carro.getMontadora().toLowerCase());
            stmt.setString(2,carro.getModelo().toLowerCase());
            return stmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar carro!\n" + ex.getMessage());
        }
        return -1;
    }

    @Override
    public int delete(Carro carro) {
        try (Connection connection = new ConnectionFactory().getConnection();
             PreparedStatement stmt = connection.prepareStatement(sqlCarro.DELETE.getQuery())) {
                stmt.setString(1,carro.getModelo().toLowerCase());
            return stmt.executeUpdate();

        }catch (SQLException ex){
            System.out.println("Erro ao deletar carro!\n"+ex.getMessage());
        }
        return -1;
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
            System.out.println("Erro ao listar todos os carros!\n" + ex.getMessage());
        }
        return null;
    }

    @Override
    public Carro findByID(int id) {
        try (Connection connection = new ConnectionFactory().getConnection();
             PreparedStatement stmt = connection.prepareStatement(sqlCarro.FINDBYID.getQuery())) {
            stmt.setInt(1,id);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                return new Carro(
                        rs.getInt("ano"),
                        rs.getString("modelo"),
                        rs.getString("montadora"),
                        new Placa(rs.getString("letras"),
                                  rs.getInt("numeros"))
                );
           }
        } catch (SQLException ex) {
            System.out.println("Erro ao buscar carro por ID!\n" + ex.getMessage());
        }
        return null;
    }
}
