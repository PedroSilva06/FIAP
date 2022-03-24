package br.com.fiap.tds.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import br.com.fiap.tds.bean.Administrador;
import br.com.fiap.tds.exception.*;


public class AdministradorDao {
	
	
	private Connection conexao;	
	/**
	 * Construtor que recebe a conexão (Injeção de dependência)
	 * @param conexao
	 */
	public AdministradorDao(Connection conexao) {
		this.conexao = conexao;	
	}

		
		
	/**
	 * Cadastra um Administrador na tabela 
	 * @param Administrador Objeto com os dados que serão cadastrados
	 * @throws SQLException
	 */
	
	public void cadastrar(Administrador administrador) throws SQLException {
		//Criar o comando SQL que recebe parâmetros
		PreparedStatement stmt = conexao.prepareStatement("INSERT INTO  t_sm_admin (cd_codigo, nm_cliente, "
				+ "ds_email, ds_senha) values (sq_tb_admin.nextval,?,?,?)");
		
		//stmt.setInt(1, Administrador.getCodigo()); //Seta a primeira ? da query com o código
		stmt.setString(1, administrador.getNome()); //Seta a segunda ? da query com o nome
		stmt.setString(2, administrador.getEmail()); 
		stmt.setString(3, administrador.getSenha());
		
		//Executar a query
		stmt.executeUpdate();
		
		//Fechar 
		stmt.close(); 
	}
		
	
	
	/**
	 * Atualiza um Administrador na tabela
	 * @param Administrador Administrador que será atualizado no banco
	 * @throws SQLException 
	 * @throws EntidadeNaoEncontradaException Administrador não encontrado para atualizar
	 */
	
	public Administrador pesquisar(int codigo) throws SQLException, EntidadeNaoEncontradaException {
		//Criar o comando SQL
		PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM t_sm_admin WHERE cd_codigo= ?");
		//Setar o código na query
		stmt.setInt(1, codigo);
		
		//Executar a query
		ResultSet resultado = stmt.executeQuery();

		//Recuperar os valores
		if (resultado.next()) {
			Administrador administrador = parse(resultado);
			//Retornar o Administrador
			return administrador;
		} else {
			throw new EntidadeNaoEncontradaException("Usuario não encontrado");
		}
	}
	
	
	
	
	/**
	 * Atualiza um Administrador na tabela
	 * @param Administrador Administrador que será atualizado no banco
	 * @throws SQLException 
	 * @throws EntidadeNaoEncontradaException Administrador não encontrado para atualizar
	 */
	
	public void atualizar(Administrador administrador) throws SQLException, EntidadeNaoEncontradaException {
		
		//Valida se o Administrador existe
		pesquisar(administrador.getCodigo());
		
		//Criar o comando SQL que recebe os parâmetros
		PreparedStatement stmt = conexao.prepareStatement("UPDATE t_sm_admin SET nm_cliente = ?, ds_email = ?,"
				+ " ds_senha = ?");
		
		//Setar os parâmetros na query
		stmt.setString(1, administrador.getNome());
		stmt.setString(2, administrador.getEmail()); 
		stmt.setString(3, administrador.getSenha());
		
		//Executar a query
		stmt.executeUpdate();
		
		stmt.close();
	}
	
	
	
	public List<Administrador> listar(){
		List<Administrador> lista = new ArrayList<Administrador>();
		
		try {
			//Criar o comando SQL
			PreparedStatement stmt = conexao.prepareStatement("SELECT * from t_sm_admin");
			//Executar a Query
			ResultSet resultado = stmt.executeQuery();
			
			while (resultado.next()) {
				//Recuperar os valores
				Administrador administrador = parse(resultado);
				//Adicionar na lista
				lista.add(administrador);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Retornar a lista
		return lista;
	}
	
	
	private Administrador parse(ResultSet resultado) throws SQLException {
		int codigo = resultado.getInt("cd_codigo");
		String nome = resultado.getString("nm_cliente");
		String email = resultado.getString("ds_email");
		String senha = resultado.getString("ds_senha");
		
		//Instanciar um Administrador
		Administrador administrador = new Administrador(codigo, nome, email, senha);
		return administrador;
	}
	
	
	
	/**
	 * Remove um Administrador do banco
	 * @param codigo PK do Administrador que será removido
	 * @throws SQLException
	 * @throws EntidadeNaoEncontradaException Administrador não foi encontrado para remoção
	 */
	public void remover(int codigo) throws SQLException, EntidadeNaoEncontradaException {
		//Validar se o Administrador existe
		pesquisar(codigo);
		//Criar o comando SQL
		PreparedStatement stmt = conexao.prepareStatement("DELETE FROM t_sm_admin WHERE cd_codigo= ?");
		//Setar o código na query
		stmt.setInt(1, codigo);
		//Executar o comando
		stmt.executeUpdate();
	}
	
	
			
}
