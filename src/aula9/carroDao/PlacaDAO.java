package aula9.carroDao;

import aula9.config.ConnectionFactory;
import aula9.model.CarroPojo.Carro;
import aula9.model.CarroPojo.Placa;
import aula9.sql.sqlCarro;
import aula9.sql.sqlPlaca;

import java.sql.*;
import java.util.List;

public class PlacaDAO implements GenericDAO<Placa>{
    @Override
    public int insert(Placa placa) {
        int chavePrimaria = -2;
        try (Connection connection = new ConnectionFactory().getConnection();
             PreparedStatement stmt = connection.prepareStatement(sqlPlaca.INSERT.getQuery(), Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, placa.getLetras());
            stmt.setInt(2,placa.getNumeros());
            stmt.execute();
            ResultSet rs = stmt.getGeneratedKeys();
            ResultSet chaves = stmt.getGeneratedKeys();
            if (chaves.next()) chavePrimaria= chaves.getInt(1);
        } catch (SQLException ex) {
            System.out.println("Erro na inserção de placas!\n" + ex.getMessage());
        }
        return chavePrimaria;
    }

    @Override
    public int update(Placa placa) {
        return 0;
    }

    @Override
    public int delete(Placa placa) {
        return 0;
    }

    @Override
    public List<Placa> listAll() {
        return null;
    }

    @Override
    public Placa findByID(int id) {
        String sql = sqlPlaca.FINDBYID.getQuery() + id;
        try (Connection connection = new ConnectionFactory().getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                return new Placa(
                        rs.getString("letras"),
                        rs.getInt("numeros")
                );
            }
        } catch (SQLException ex) {
            System.out.println("Erro na consulta de placas!\n" + ex.getMessage());
        }
        return null;
    }
}
