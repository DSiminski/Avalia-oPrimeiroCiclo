package br.com.avaliacaoum.agenciador.connectioFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
	    public ConnectionFactory() {
	    }

	    public static Connection getConnection() throws SQLException {
	        try {
	            Class.forName("org.postgresql.Driver");
	            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/Agenciamento", "postgres", "123");
	        } catch (ClassNotFoundException var1) {
	            throw new SQLException(var1.getMessage());
	        }
	    }
	}


