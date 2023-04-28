package aula9.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;

public class ConnectionFactory {

    public Connection createConnection(){
        String uri = "jdbc:mysql://localhost:1111/database";
        String usuario = "root";
        String senha = "";
        Connection conexao = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection(uri, usuario, senha);
            return  conexao;
        } catch (SQLTimeoutException ex) {
            System.out.println("Tempo esgotado" + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex){
            System.out.println("Driver nao encontrado");
        }
        return  null;
    }
}
