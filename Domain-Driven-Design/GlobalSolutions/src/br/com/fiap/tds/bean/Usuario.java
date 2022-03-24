package br.com.fiap.tds.bean;

/**
 * Classe que representa os usuarios
 * @author FBVM
 * @version 1.0
 */

public class Usuario {

	/**
	 * Armazena o nome do usuario
	 */
	private String nome;
	/**
	 * Armazena o código do usuario
	 */
	private int codigo;
	
	/**
	 * Armazena o email do usuario
	 */
	private String email;
	
	/**
	 * Armazena a senha do usuario
	 */
	private String senha;
	
	/**
	 * Inicializa o objeto Usuario sem valores
	 */
	public Usuario() {}

	/**
	 * Inicializa o objeto Usuario com valores para nome, codigo e email
	 * @param nome Nome do usuario
	 * @param codigo Codigo de um usuario
	 * @param email Email de um usuario
	 * @param senha Senha de um usuario
	 */
	public Usuario(String nome, int codigo, String email, String senha) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.email = email;
		this.senha = senha;
	}
	
	/**
	 * Recupera o nome do usuario
	 * @return nome Nome do usuario
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Altera o nome do usuario
	 * @param nome Nome do usuario
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Recupera o codigo do usuario
	 * @return codigo Código do usuario
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Altera o codigo do usuario
	 * @param codigo Código do usuario
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Recupera o email do usuario
	 * @return email Email do usuario
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Altera o email do usuario
	 * @param email Email do usuario
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Recupera a senha do usuario
	 * @return senha Senha do usuario
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * Altera o senha do usuario
	 * @param senha Senha do usuario
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
