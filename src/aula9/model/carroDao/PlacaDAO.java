package aula9.model.carroDao;

import aula9.config.ConnectionFactory;
import aula9.model.CarroPojo.Placa;
import aula9.sql.sqlPlaca;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlacaDAO implements GenericDAO<Placa> {
    @Override
    public int insert(Placa placa) {
        int chavePrimaria = -1;
        try (Connection connection = new ConnectionFactory().getConnection();
             PreparedStatement stmt = connection.prepareStatement(sqlPlaca.INSERT.getQuery(), Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, placa.getLetras().toUpperCase());
            stmt.setInt(2, placa.getNumeros());
            stmt.execute();
            ResultSet rs = stmt.getGeneratedKeys();
            ResultSet chaves = stmt.getGeneratedKeys();
            if (chaves.next()) chavePrimaria = chaves.getInt(1);
        } catch (SQLException ex) {
            System.out.println("Erro na inserção de placa!\n" + ex.getMessage());
        }
        return chavePrimaria;
    }

    @Override
    public int update(Placa placa) {
        try (Connection connection = new ConnectionFactory().getConnection();
             PreparedStatement stmt = connection.prepareStatement(sqlPlaca.UPDATE.getQuery())) {
            stmt.setInt(1, placa.getNumeros());
            stmt.setString(2, placa.getLetras().toUpperCase());
            return stmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Erro ao atualizar placa!\n" + ex.getMessage());
        }
        return -1;
    }

    @Override
    public int delete(Placa placa) {
        try (Connection connection = new ConnectionFactory().getConnection();
             PreparedStatement stmt = connection.prepareStatement(sqlPlaca.DELETE.getQuery())) {
            stmt.setString(1, placa.getLetras().toUpperCase());
                return stmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Erro ao deletar placa!\n" + ex.getMessage());
        }
        return -1;
    }

    @Override
    public List<Placa> listAll() {
        List<Placa> placas = new ArrayList<>();
        try (Connection connection = new ConnectionFactory().getConnection();
             PreparedStatement stmt = connection.prepareStatement(sqlPlaca.LISTALL.getQuery())) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                placas.add(new Placa(
                        rs.getString("letras"),
                        rs.getInt("numeros")
                ));
            }
            return placas;
        } catch (SQLException ex) {
            System.out.println("Erro ao listar todas as placas!\n" + ex.getMessage());
        }
        return null;
    }

    @Override
    public Placa findByID(int id) {
        try (Connection connection = new ConnectionFactory().getConnection();
             PreparedStatement stmt = connection.prepareStatement(sqlPlaca.FINDBYID.getQuery())) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                return new Placa(
                        rs.getString("letras"),
                        rs.getInt("numeros")
                );
            }
        } catch (SQLException ex) {
            System.out.println("Erro na consulta de placa por ID!\n" + ex.getMessage());
        }
        return null;
    }
}
