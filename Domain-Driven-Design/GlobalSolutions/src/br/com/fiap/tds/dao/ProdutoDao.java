package br.com.fiap.tds.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.tds.bean.Produto;
import br.com.fiap.tds.exception.EntidadeNaoEncontradaException;

public class ProdutoDao {
	
	
	private Connection conexao;	
	/**
	 * Construtor que recebe a conexão (Injeção de dependência)
	 * @param conexao
	 */
	public ProdutoDao(Connection conexao) {
		this.conexao = conexao;	
	}

		
		
	/**
	 * Cadastra um produto na tabela 
	 * @param produto Objeto com os dados que serão cadastrados
	 * @throws SQLException
	 */
	
	public void cadastrar(Produto produto) throws SQLException {
		//Criar o comando SQL que recebe parâmetros
		PreparedStatement stmt = conexao.prepareStatement("INSERT INTO  t_blm_produto (nm_produto, "
				+ "dt_validade, qt_estoque, ds_in_natura, st_produto) values (?,?,?,?,?)");
		
		//stmt.setInt(1, produto.getCodigo()); //Seta a primeira ? da query com o código
		stmt.setString(1, produto.getNome()); //Seta a segunda ? da query com o nome
		stmt.setString(2, produto.getValidade()); 
		stmt.setInt(3, produto.getQtd());
		stmt.setBoolean(4, produto.isInNatura());
		stmt.setBoolean(5, produto.isStatus());
		
		//Executar a query
		stmt.executeUpdate();
		
		//Fechar 
		stmt.close(); 
	}
	
	/**
	 * Pesquisa um produto na tabela
	 * @param produto Produto que será pesquisado no banco
	 * @throws SQLException 
	 * @throws EntidadeNaoEncontradaException Produto não encontrado para atualizar
	 */
	
	public Produto pesquisar(int codigo) throws SQLException, EntidadeNaoEncontradaException {
		//Criar o comando SQL
		PreparedStatement stmt = conexao.prepareStatement("SELECT * FROM t_blm_produto WHERE cd_produto = ?");
		//Setar o código na query
		stmt.setInt(1, codigo);
		
		//Executar a query
		ResultSet resultado = stmt.executeQuery();

		//Recuperar os valores
		if (resultado.next()) {
			Produto produto = parse(resultado);
			//Retornar o produto
			return produto;
		} else {
			throw new EntidadeNaoEncontradaException("Produto não encontrado");
		}
	}

	
	/**
	 * Pesquisa os produtos por parte do nome
	 * @param nome Termo de pesquisa
	 * @return List<Produto> Todos os produtos encontrados
	 * @throws SQLException 
	 */
	public List<Produto> pesquisarPorNome(String nome) throws SQLException {
		//Criar o comando SQL 
		PreparedStatement stmt = conexao.prepareStatement("select * from t_blm_produto where nm_produto like ?");
		
		//Passar o parâmetro para a query
		stmt.setString(1, "%" + nome + "%");
		
		//Executar a query
		ResultSet result = stmt.executeQuery();
		
		//Instanciar a lista de Produtos
		List<Produto> lista = new ArrayList<Produto>();
		
		//Percorrer o resultado e obter o produto para adicionar na lista
		while (result.next()) {
			Produto produto = parse(result);
			lista.add(produto);
		}
		
		//Retornar a lista
		return lista;
	}
		
	
	/**
	 * Atualiza um produto na tabela
	 * @param Produto produto que será atualizado no banco
	 * @throws SQLException 
	 * @throws EntidadeNaoEncontradaException produto não encontrado para atualizar
	 */
	
	public void atualizar(Produto produto) throws SQLException, EntidadeNaoEncontradaException {
		
		//Valida se o produto existe
		pesquisar(produto.getCodigo());
		
		//Criar o comando SQL que recebe os parâmetros
		PreparedStatement stmt = conexao.prepareStatement("UPDATE t_blm_produto SET nm_produto = ?,"
				+ "dt_validade = ?, qt_estoque = ?, ds_in_natura = ?, st_produto = ?" );
		
		//Setar os parâmetros na query
		stmt.setString(1, produto.getNome());
		stmt.setString(2, produto.getValidade()); 
		stmt.setInt(3, produto.getQtd());
		stmt.setBoolean(4, produto.isInNatura());
		stmt.setBoolean(5, produto.isStatus());
		//Executar a query
		stmt.executeUpdate();
		
		stmt.close();
	}
	
	
	
	public List<Produto> listar(){
		List<Produto> lista = new ArrayList<Produto>();
		
		try {
			//Criar o comando SQL
			PreparedStatement stmt = conexao.prepareStatement("SELECT * from t_blm_produto");
			//Executar a Query
			ResultSet resultado = stmt.executeQuery();
			
			while (resultado.next()) {
				//Recuperar os valores
				Produto produto = parse(resultado);
				//Adicionar na lista
				lista.add(produto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//Retornar a lista
		return lista;
	}
	

		
	private Produto parse(ResultSet resultado) throws SQLException {
		int codigo = resultado.getInt("cd_produto");
		String nome = resultado.getString("nm_produto");
		String validade = resultado.getString("dt_validade");
		int qtd = resultado.getInt("qt_estoque");
		boolean inNatura = resultado.getBoolean("ds_in_natura");
		boolean status = resultado.getBoolean("st_produto");
		
		
		//Instanciar um produto
		Produto produto = new Produto(nome, codigo, validade, qtd, inNatura, status);
		return produto;
	}
	
	/**
	 * Remove um produto do banco
	 * @param codigo PK do produto que será removido
	 * @throws SQLException
	 * @throws EntidadeNaoEncontradaException Produto não foi encontrado para remoção
	 */
	public void remover(int codigo) throws SQLException, EntidadeNaoEncontradaException {
		//Validar se o produto existe
		pesquisar(codigo);
		//Criar o comando SQL
		PreparedStatement stmt = conexao.prepareStatement("DELETE FROM t_blm_produto WHERE cd_produto = ?");
		//Setar o código na query
		stmt.setInt(1, codigo);
		//Executar o comando
		stmt.executeUpdate();
	}
	
	
			
}
