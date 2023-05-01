package aula9.carroDao;

import aula9.config.ConnectionFactory;
import aula9.model.CarroPojo.Carro;
import aula9.model.CarroPojo.Placa;
import aula9.sql.SQLs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class CarroDAO implements GenericDAO<Carro> {
    @Override
    public boolean insert(Carro obj) {

        return false;
    }

    @Override
    public int update(Carro obj) {
        return 0;
    }

    @Override
    public int delete(Carro obj) {
        return 0;
    }

    @Override
    public List<Carro> listAll() {
        List<Carro> lista = new LinkedList<>();
        try (Connection connection = new ConnectionFactory().getConnection();
             PreparedStatement stmt = connection.prepareStatement(SQLs.LISTALL.getQuery())) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                lista.add(new Carro(
                        rs.getInt("ano"),
                        rs.getString("modelo"),
                        rs.getString("montadora"),
                        new Placa(rs.getString("placa").substring(0, 3),
                                Integer.parseInt(rs.getString("placa").substring(4, 8)))
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
        return null;
    }
}
