package br.com.fiap.tds.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Implementa o padrão Singleton, permitindo uma única instância da ConnectionManager
 * @author pedro
 *
 */

public class ConnectionManager {

	//1- Atributo estático que armazena a única instância
	private static ConnectionManager manager;
	
	//Atributo que armazena as informações de um arquivo Properties
	private static Properties prop;
	
	//2- Contrutor privado
	private ConnectionManager() {}
	
	//3- Método estático que retorna a única instância
	public static ConnectionManager getInstance() throws FileNotFoundException, IOException {
		if (manager == null) {
			manager = new ConnectionManager();
			//Ler o arquivo de propriedades
			prop = new Properties();
			prop.load(new FileInputStream("churros.properties"));
			
		}
		return manager;
	}
	
	//Método que retorna a conexão
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Obter uma conexão com o banco de dados: (string de conexão, usuário, senha)
		Connection conexao = DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("usuario"), prop.getProperty("senha"));
		
		return conexao;
	
}
	
}
