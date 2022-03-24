package br.com.fiap.tds.bo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import br.com.fiap.tds.bean.Categoria;
import br.com.fiap.tds.dao.CategoriaDao;
import br.com.fiap.tds.exception.DadoInvalidoException;
import br.com.fiap.tds.exception.IdNotFoundException;

/**
 * Classe que cont�m as regras de neg�cio e valida��es
 * @author Thiago Yamamoto
 */
public class CategoriaBo {
	
	private CategoriaDao categoriaDao;
	
	/**
	 * Construtor que recebe a conex�o
	 * @param conexao conex�o com o banco de dados
	 */
	public CategoriaBo(Connection conexao) {
		categoriaDao = new CategoriaDao(conexao);
	}

	public void cadastrar(Categoria categoria) throws SQLException, DadoInvalidoException {
		validar(categoria);
		categoriaDao.cadastrar(categoria);
	}
	
	private void validar(Categoria categoria) throws DadoInvalidoException {
		if (categoria.getNome() == null || categoria.getNome().length() > 40) {
			throw new DadoInvalidoException("Nome � obrigat�rio e deve conter menos de 40 carcteres");
		}
	}
	
	public void atualizar(Categoria categoria) throws SQLException, IdNotFoundException, DadoInvalidoException {
		validar(categoria);
		categoriaDao.atualizar(categoria);
	}
	
	public Categoria pesquisar(int codigo) throws SQLException, IdNotFoundException {
		return categoriaDao.pesquisar(codigo);
	}
	
	public List<Categoria> listar() throws SQLException{
		return categoriaDao.listar();
	}
	
	public void remover(int codigo) throws SQLException, IdNotFoundException {
		categoriaDao.remover(codigo);
	}
	
}