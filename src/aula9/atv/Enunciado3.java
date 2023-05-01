package aula9.atv;

import aula9.config.ConnectionFactory;
import aula9.model.Endereco;

import javax.swing.*;
import java.sql.*;

public class Enunciado3 {
    public static void insereEndereco() {
        String sqlInsert = "INSERT INTO endereco (logradouro, complemento, uf) VALUES (?,?,?)";

        for (int i = 0; i <= 0; i++) {
            //enderecos.add(new Endereco("Rua B, 5859","Apto 2","BH"));
            //enderecos.add(new Endereco("Rua XY, 12889","Casa","ES"));
            //enderecos.add(new Endereco("Trav Jose, 129","Beco 13","RS"));
            Endereco endereco = new Endereco(
                    JOptionPane.showInputDialog(null, "Digite o logradouro"),
                    JOptionPane.showInputDialog(null, "Digite o complemento:"),
                    JOptionPane.showInputDialog(null, "Digite o estado: Ex.: SP"));
            // inserção no banco
            try (Connection conexao = new ConnectionFactory().getConnection();
                 PreparedStatement stmt = conexao.prepareStatement(sqlInsert);) {

                //for (Endereco endereco: enderecos){
                stmt.setString(1, endereco.getLogradouro());
                stmt.setString(2, endereco.getComplemento());
                stmt.setString(3, endereco.getUf());
                stmt.execute();
                //}
            } catch (SQLException ex) {
                System.out.println("Erro de conexao " + ex.getMessage());
            }
        }// fim do for
    }

    public static void listaEndereco() {
        // leitura do banco
        StringBuilder sb = new StringBuilder();
        String sqlLoad = "select * from endereco";

        try (Connection conexao = new ConnectionFactory().getConnection();
             Statement stmt = conexao.prepareStatement(sqlLoad, Statement.RETURN_GENERATED_KEYS);
             ResultSet rs = stmt.executeQuery(sqlLoad)) {

            while (rs.next()) {
                sb.append("ID:")
                        .append(rs.getInt("id"))
                        .append("| ")
                        .append(new Endereco(rs.getString("logradouro"), rs.getString("complemento"), rs.getString("uf")))
                        .append("\n");
            }

        } catch (SQLException ex) {
            System.out.println("Erro de conexao " + ex.getMessage());
        }
        JOptionPane.showMessageDialog(null, sb);
    }

    public static void main(String[] args) {
        //insereEndereco();
        listaEndereco();
    }
}
