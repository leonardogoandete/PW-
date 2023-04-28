package aula9.atv;

import aula9.config.ConnectionFactory;
import aula9.model.Pessoa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LeituraJDBC {
    public static void main(String[] args) {
        List pessoas = new ArrayList<Pessoa>();


        String sql = "select nome, endereco FROM pessoas VALUES ";
        try (Connection conexao = new ConnectionFactory().createConnection();
             PreparedStatement ps = conexao.prepareStatement(sql);

             ResultSet rs = ps.executeQuery()) {


            while (rs.next()) {
                Pessoa p = new Pessoa();
                p.setNome(rs.getString("nome"));
                p.setEndereco(rs.getString("endereco"));
                pessoas.add(p);
            }

            System.out.println(pessoas);
        } catch (SQLException ex) {
            System.out.println("Erro de conexao " + ex.getMessage());
        }
    }

}


