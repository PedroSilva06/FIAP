package br.com.fiap.tds.bo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


import br.com.fiap.tds.bean.Usuario;
import br.com.fiap.tds.dao.UsuarioDao;
import br.com.fiap.tds.exception.EntidadeNaoEncontradaException;
import br.com.fiap.tds.exception.ParametroInvalidoException;



public class UsuarioBo {
	
	private UsuarioDao usuarioDao;
		
	
	/**
	 * Construtor que recebe a conex�o
	 * @param conexao
	 */
	
	public UsuarioBo(Connection conexao) {
		usuarioDao = new UsuarioDao(conexao);
	}
	
	
	/**
	 * Valida o usuario antes de realizar o cadastro
	 * @param usuario Usuario que ser� cadastrado
	 * @throws SQLException
	 * @throws ParametroInvalidoException Caso n�o seja possivel cadastrar usuario
	 */
	
	public void cadastrar(Usuario usuario) throws SQLException, ParametroInvalidoException {
		validar(usuario);
		usuarioDao.cadastrar(usuario);
	}
	
	private void validar(Usuario usuario) throws ParametroInvalidoException {
		if (usuario.getNome() == null || usuario.getNome().length() > 80) {
			throw new ParametroInvalidoException("Nome obrigat�rio ou no m�ximo de 80 caracteres");
		}
		
		if (usuario.getEmail() == null || usuario.getEmail().length() > 80) {
			throw new ParametroInvalidoException("Email obrigat�rio ou no m�ximo de 80 caracteres");
		}
		if (usuario.getSenha() == null || usuario.getSenha().length() < 8){
			throw new ParametroInvalidoException("O valor n�o pode ser menor do que 8 caracteres");
		}
		
		if (usuario.getAnsiedade() < 1 || usuario.getAnsiedade() > 3) {
			throw new ParametroInvalidoException("O valor n�o pode ser < 1 ou > 3");
		}
	}
	
	
	
	/**
	 * Atualiza o usuario realizando uma valida��o dos campos
	 * @param usuario Usuario que ser� atualizado
	 * @throws ParametroInvalidoException
	 * @throws SQLException
	 * @throws EntidadeNaoEncontradaException Caso n�o encontre o usuario para atualizar
	 */
	
	public void atualizar(Usuario usuario) throws ParametroInvalidoException, SQLException, EntidadeNaoEncontradaException {
		validar(usuario);
		usuarioDao.atualizar(usuario);
	}
	
	
	
	/**
	 * Remove um usuario pela PK
	 * @param codigo PK do usuario
	 * @throws SQLException
	 * @throws EntidadeNaoEncontradaException Caso n�o encontre o usuario para remover
	 */
	
	public void remover(int codigo) throws SQLException, EntidadeNaoEncontradaException {
		usuarioDao.remover(codigo);
	}
	
	

	/**
	 * Lista todos os usuarios
	 * @return Lista de usuarios
	 */
	
	public List<Usuario> listar(){
		return usuarioDao.listar();
	}
	
	/**
	 * Lista usuarios com Toc
	 * @return Lista de usuarios
	 */
	public List<Usuario> listarToc(){
		return usuarioDao.listarToc();
	}
	
	/**
	 * Lista usuarios com Sp
	 * @return Lista de usuarios
	 */
	public List<Usuario> listarSP(){
		return usuarioDao.listarSP();
	}
	
	/**
	 * Lista usuarios com Tag
	 * @return Lista de usuarios
	 */
	public List<Usuario> listarTAG(){
		return usuarioDao.listarTAG();
	}
	
	
	
	/**
	 * Pesquisa um usuario pela PK
	 * @param codigo Pk do usuario
	 * @return Usuario encontrado
	 * @throws SQLException
	 * @throws EntidadeNaoEncontradaException Caso n�o encontre nenhum usuario
	 */
	
	public Usuario pesquisar(int codigo) throws SQLException, EntidadeNaoEncontradaException {
		return usuarioDao.pesquisar(codigo);
	}
	
		
	
	
}
