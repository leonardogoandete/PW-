package aula9.atv;

import aula9.config.ConnectionFactory;
import aula9.model.Produto;

import javax.swing.*;
import java.sql.*;

public class Enunciado5 {
    public static void insereProdutos() {
        //List<Produto> produtos = new ArrayList<>();
        String sql = "INSERT INTO produto (codigo, descricao, valor) VALUES (?,?,?)";
/*
        produtos.add(new Produto(659,"Pao de batata",4.75d));
        produtos.add(new Produto(546,"Bicicleta aro 18",899.42d));
        produtos.add(new Produto(6824,"Geladeira Frost Free",4852.33d));
        produtos.add(new Produto(797,"Racao gato CatCome 20Kg",189.77d));
        produtos.add(new Produto(357,"Cebola roxa",6.37d));

 */
        for (int i = 0; i <= 4; i++) {
            Produto produto = null;
            try{
                produto = new Produto(
                        Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o codigo para o produto:")),
                        JOptionPane.showInputDialog(null, "Digite uma descricao:"),
                        Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor:"))
                );
            }catch (NumberFormatException ex){
                System.out.println("Erro ao converter numero!\n" + ex.getMessage());
            }catch (NullPointerException ex){
                System.out.println("Valor para conversão nulo\n"+ ex.getMessage());
            }
            // banco
            try (Connection conexao = new ConnectionFactory().getConnection();
                 PreparedStatement stmt = conexao.prepareStatement(sql)
            ) {

                //for (Produto produto: produtos){
                stmt.setInt(1, produto.getCodigo());
                stmt.setString(2, produto.getDescricao());
                stmt.setDouble(3, produto.getValor());
                stmt.execute();
                //}

            } catch (SQLException ex) {
                System.out.println("Erro de conexao " + ex.getMessage());
            }
        }

    }

    public static void listaProdutos() {
        StringBuilder sb = new StringBuilder();
        String sqlLoad = "select * from produto";

        try (Connection conexao = new ConnectionFactory().getConnection();
             Statement stmt = conexao.prepareStatement(sqlLoad, Statement.RETURN_GENERATED_KEYS);
             ResultSet rs = stmt.executeQuery(sqlLoad)) {

            while (rs.next()) {
                sb.append(rs.getInt("id"))
                        .append("| ")
                        .append(new Produto(rs.getInt("codigo"), rs.getString("descricao"), rs.getDouble("valor")))
                        .append("\n");
            }

        } catch (SQLException ex) {
            System.out.println("Erro de conexao " + ex.getMessage());
        }
        JOptionPane.showMessageDialog(null, sb);
    }

    public static void main(String[] args) {
        //insereProdutos();
        listaProdutos();


    }
}
