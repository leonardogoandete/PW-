package aula9.atv;

import aula9.config.ConnectionFactory;
import aula9.model.Pessoa;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LeituraJDBC {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        String sql = "select nome,endereco FROM pessoas";
        try (Connection conexao = new ConnectionFactory().getConnection();
             Statement stmt = conexao.prepareStatement(sql);

             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                pessoas.add(new Pessoa(rs.getString("nome"),rs.getString("endereco")));
            }

        } catch (SQLException ex) {
            System.out.println("Erro de conexao " + ex.getMessage());
        }

        for (Pessoa p : pessoas) {
            System.out.println(p.toString());
        }
    }

}


