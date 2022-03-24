package br.com.fiap.tds.bo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


import br.com.fiap.tds.bean.Produto;
import br.com.fiap.tds.dao.ProdutoDao;
import br.com.fiap.tds.exception.EntidadeNaoEncontradaException;
import br.com.fiap.tds.exception.ParametroInvalidoException;



public class ProdutoBo {
	
	private ProdutoDao produtoDao;
		
	
	/**
	 * Construtor que recebe a conexão
	 * @param conexao
	 */
	
	public ProdutoBo(Connection conexao) {
		produtoDao = new ProdutoDao(conexao);
	}
	
	
	/**
	 * Valida o produto antes de realizar o cadastro
	 * @param produto Produto que será cadastrado
	 * @throws SQLException
	 * @throws ParametroInvalidoException Caso não seja possivel cadastrar produto
	 */
	
	public void cadastrar(Produto produto) throws SQLException, ParametroInvalidoException {
		validar(produto);
		produtoDao.cadastrar(produto);
	}
	
	private void validar(Produto produto) throws ParametroInvalidoException {
		if (produto.getNome() == null || produto.getNome().length() > 80) {
			throw new ParametroInvalidoException("Nome obrigatório ou no máximo de 80 caracteres");
		}
		 
		if (produto.getValidade() == null || produto.getValidade().length() != 10) {
			throw new ParametroInvalidoException("Favor digitar uma data valida neste formato: 'dd/mm/aaaa' incluindo a '/'.");
		}
        
		if (produto.getQtd() < 0) {
			throw new ParametroInvalidoException("A quantidade não pode ser negativa");
		}
		
	}
	
	/**
	 * Pesquisa por parte do nome do produto
	 * @param nome Termo de pesquisa
	 * @return List<Produto> Todos os produtos encontrados
	 * @throws SQLException
	 */
	public List<Produto> pesquisarPorNome(String nome) throws SQLException{
		return produtoDao.pesquisarPorNome(nome);
	}
	
	
	/**
	 * Atualiza o produto realizando uma validação dos campos
	 * @param produto Produto que será atualizado
	 * @throws ParametroInvalidoException
	 * @throws SQLException
	 * @throws EntidadeNaoEncontradaException Caso não encontre o produto para atualizar
	 */
	
	public void atualizar(Produto produto) throws ParametroInvalidoException, SQLException, EntidadeNaoEncontradaException {
		validar(produto);
		produtoDao.atualizar(produto);
	}
	
	
	
	/**
	 * Remove um produto pela PK
	 * @param codigo PK do produto
	 * @throws SQLException
	 * @throws EntidadeNaoEncontradaException Caso não encontre o produto para remover
	 */
	
	public void remover(int codigo) throws SQLException, EntidadeNaoEncontradaException {
		produtoDao.remover(codigo);
	}
	
	

	/**
	 * Lista todos os produtos
	 * @return Lista de produtos
	 */
	
	public List<Produto> listar(){
		return produtoDao.listar();
	}
		
	
	/**
	 * Pesquisa um produto pela PK
	 * @param codigo Pk do produto
	 * @return Produto encontrado
	 * @throws SQLException
	 * @throws EntidadeNaoEncontradaException Caso não encontre nenhum produto
	 */
	
	public Produto pesquisar(int codigo) throws SQLException, EntidadeNaoEncontradaException {
		return produtoDao.pesquisar(codigo);
	}
	
		
	
	
}
