package br.com.fiap.tds.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Implementa o padr�o Singleton, permitindo uma �nica inst�ncia da ConnectionManager
 * @author pedro
 *
 */

public class ConnectionManager {

	//1- Atributo est�tico que armazena a �nica inst�ncia
	private static ConnectionManager manager;
	
	//Atributo que armazena as informa��es de um arquivo Properties
	private static Properties prop;
	
	//2- Contrutor privado
	private ConnectionManager() {}
	
	//3- M�todo est�tico que retorna a �nica inst�ncia
	public static ConnectionManager getInstance() throws FileNotFoundException, IOException {
		if (manager == null) {
			manager = new ConnectionManager();
			//Ler o arquivo de propriedades
			prop = new Properties();
			prop.load(new FileInputStream("churros.properties"));
			
		}
		return manager;
	}
	
	//M�todo que retorna a conex�o
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Obter uma conex�o com o banco de dados: (string de conex�o, usu�rio, senha)
		Connection conexao = DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("usuario"), prop.getProperty("senha"));
		
		return conexao;
	
}
	
}
