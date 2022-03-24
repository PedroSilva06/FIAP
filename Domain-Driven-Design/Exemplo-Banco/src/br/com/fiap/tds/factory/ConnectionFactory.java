package br.com.fiap.tds.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe respons�vel por obter as conex�es com o banco de dados
 * @author Thiago Yamamoto
 * @version 1.0
 */
public class ConnectionFactory {

	/**
	 * Obtem uma conex�o com o banco de dados
	 * @return Connection conex�o com o banco
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	//static -> modificador que define que o elemento � de classe e n�o de objeto
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		//Registrar o driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Obter uma conex�o com o banco de dados (string conex�o, usuario, senha)
		Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl","pf0392","fiap");
		
		return conexao;
	}
	
}