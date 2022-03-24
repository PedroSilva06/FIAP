package br.com.fiap.tds.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import br.com.fiap.tds.bean.Usuario;
import br.com.fiap.tds.exception.*;

public class UsuarioDao {
	
	
	private Connection conexao;	
	/**
	 * Construtor que recebe a conexão (Injeção de dependência)
	 * @param conexao
	 */
	public UsuarioDao(Connection conexao) {
		this.conexao = conexao;	
	}

		
		
	/**
	 * Cadastra um usuario na tabela 
	 * @param usuario Objeto com os dados que serão cadastrados
	 * @throws SQLException
	 */
	
	public void cadastrar(Usuario usuario) throws SQLException {
		//Criar o comando SQL que recebe parâmetros
		PreparedStatement stmt = conexao.prepareStatement("INSERT INTO  t_sm_usuario (cd_codigo, nm_cliente, "
				+ "ds_email, ds_senha, cd_ansiedade) values (sq_tb_usuario.nextval,?,?,?,?)");
		
		//stmt.setInt(1, usuario.getCodigo()); //Seta a primeira ? da query com o código
		stmt.setString(1, usuario.getNome()); //Seta a segunda ? da query com o nome
		stmt.setString(2, usuario.getEmail()); 
		stmt.setString(3, usuario.getSenha());
		stmt.setInt(4, usuario.getAnsiedade());
		//Executar a query
		stmt.executeUpdate();
		
		//Fechar 
		stmt.close(); 
	}
	
	/**
	 * Pesquisa um usuario na tabela
	 * @param usuario Usuario que será pesquisado no banco
	 * @throws SQLException 
	 * @throws EntidadeNaoEncontradaException Usuario não encontrado para atualizar
	 */
	
	public Usuario pesquisar(int codigo) throws SQLException, EntidadeNaoEncontradaException {
		//Criar o comando SQL
		PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM t_sm_usuario WHERE cd_codigo = ?");
		//Setar o código na query
		stmt.setInt(1, codigo);
		
		//Executar a query
		ResultSet resultado = stmt.executeQuery();

		//Recuperar os valores
		if (resultado.next()) {
			Usuario usuario = parse(resultado);
			//Retornar o usuario
			return usuario;
		} else {
			throw new EntidadeNaoEncontradaException("Usuario não encontrado");
		}
	}

		
	
	/**
	 * Atualiza um usuario na tabela
	 * @param Usuario usuario que será atualizado no banco
	 * @throws SQLException 
	 * @throws EntidadeNaoEncontradaException usuario não encontrado para atualizar
	 */
	
	public void atualizar(Usuario usuario) throws SQLException, EntidadeNaoEncontradaException {
		
		//Valida se o usuario existe
		pesquisar(usuario.getCodigo());
		
		//Criar o comando SQL que recebe os parâmetros
		PreparedStatement stmt = conexao.prepareStatement("UPDATE t_sm_usuario SET nm_cliente = ?, ds_email = ?,"
				+ " ds_senha = ?, cd_ansiedade = ?" );
		
		//Setar os parâmetros na query
		stmt.setString(1, usuario.getNome());
		stmt.setString(2, usuario.getEmail()); 
		stmt.setString(3, usuario.getSenha());
		stmt.setInt(4, usuario.getAnsiedade());
		
		//Executar a query
		stmt.executeUpdate();
		
		stmt.close();
	}
	
	
	
	public List<Usuario> listar(){
		List<Usuario> lista = new ArrayList<Usuario>();
		
		try {
			//Criar o comando SQL
			PreparedStatement stmt = conexao.prepareStatement("SELECT * from t_sm_usuario");
			//Executar a Query
			ResultSet resultado = stmt.executeQuery();
			
			while (resultado.next()) {
				//Recuperar os valores
				Usuario usuario = parse(resultado);
				//Adicionar na lista
				lista.add(usuario);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Retornar a lista
		return lista;
	}
	
	
	//LISTAR POR ANSIEDADE
	//SELECT * from t_sm_usuario WHERE cd_ansiedade == 1
	public List<Usuario> listarToc(){
		List<Usuario> listaToc = new ArrayList<Usuario>();
		
		try {
			//Criar o comando SQL
			PreparedStatement stmt = conexao.prepareStatement("SELECT * from t_sm_usuario WHERE cd_ansiedade = 1");
			//Executar a Query
			ResultSet resultado = stmt.executeQuery();
			
			while (resultado.next()) {
				//Recuperar os valores
				Usuario usuario = parse(resultado);
				//Adicionar na lista
				listaToc.add(usuario);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Retornar a lista
		return listaToc;
	}
	
	
	//SELECT * from t_sm_usuario WHERE cd_ansiedade == 2
	public List<Usuario> listarSP(){
		List<Usuario> listaSp = new ArrayList<Usuario>();
		
		try {
			//Criar o comando SQL
			PreparedStatement stmt = conexao.prepareStatement("SELECT * from t_sm_usuario WHERE cd_ansiedade = 2");
			//Executar a Query
			ResultSet resultado = stmt.executeQuery();
			
			while (resultado.next()) {
				//Recuperar os valores
				Usuario usuario = parse(resultado);
				//Adicionar na lista
				listaSp.add(usuario);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Retornar a lista
		return listaSp;
	}
	
	
	//SELECT * from t_sm_usuario WHERE cd_ansiedade == 3
	public List<Usuario> listarTAG(){
		List<Usuario> listaTag = new ArrayList<Usuario>();
		
		try {
			//Criar o comando SQL
			PreparedStatement stmt = conexao.prepareStatement("SELECT * from t_sm_usuario WHERE cd_ansiedade = 3");
			//Executar a Query
			ResultSet resultado = stmt.executeQuery();
			
			while (resultado.next()) {
				//Recuperar os valores
				Usuario usuario = parse(resultado);
				//Adicionar na lista
				listaTag.add(usuario);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Retornar a lista
		return listaTag;
	}

		
	private Usuario parse(ResultSet resultado) throws SQLException {
		int codigo = resultado.getInt("cd_codigo");
		String nome = resultado.getString("nm_cliente");
		String email = resultado.getString("ds_email");
		String senha = resultado.getString("ds_senha");
		int ansiedade = resultado.getInt("cd_ansiedade");
		
		//Instanciar um usuario
		Usuario usuario = new Usuario(codigo, nome, email, senha, ansiedade);
		return usuario;
	}
	
	/**
	 * Remove um usuario do banco
	 * @param codigo PK do usuario que será removido
	 * @throws SQLException
	 * @throws EntidadeNaoEncontradaException Usuario não foi encontrado para remoção
	 */
	public void remover(int codigo) throws SQLException, EntidadeNaoEncontradaException {
		//Validar se o usuario existe
		pesquisar(codigo);
		//Criar o comando SQL
		PreparedStatement stmt = conexao.prepareStatement("DELETE FROM t_sm_usuario WHERE cd_codigo = ?");
		//Setar o código na query
		stmt.setInt(1, codigo);
		//Executar o comando
		stmt.executeUpdate();
	}
	
	
			
}
