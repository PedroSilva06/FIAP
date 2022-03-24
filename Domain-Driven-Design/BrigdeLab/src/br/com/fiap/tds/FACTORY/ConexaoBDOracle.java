package br.com.fiap.tds.FACTORY;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBDOracle {
	
	public static Connection createConnBD() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@ORACLE.FIAP.COM.BR:1521:orcl", "rm87564", "020201");
			
			System.out.println("Conectando com o banco...");
			
			return conn;
				
		} catch (ClassNotFoundException | SQLException e) {
			//e.printStackTrace();
			System.out.println("Erro..." + e.getMessage());
		}
		return null;
	}
	
}
