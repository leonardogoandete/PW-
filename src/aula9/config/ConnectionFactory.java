package aula9.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;

public class ConnectionFactory {

    public Connection getConnection() {
        String uri = "jdbc:mysql://localhost:3306/db?characterEncoding=latin1";
        String usuario = "leo";
        String senha = "leo";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(uri, usuario, senha);
        } catch (SQLTimeoutException ex) {
            System.out.println("Tempo esgotado!\n" + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Erro de conexao com o banco!\n" + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver nao encontrado!\n");
        }
        return null;
    }
}
