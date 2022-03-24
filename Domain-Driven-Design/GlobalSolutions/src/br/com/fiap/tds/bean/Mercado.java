package br.com.fiap.tds.bean;

/**
 * Classe que representa os mercados
 * @author FBVM
 * @version 1.0
 */

public class Mercado{
	
	/**
	 * Armazena o código do Mercado
	 */
	private int codigo;
	/**
	 * Armazena o nome do Mercado
	 */
	private String nome;
	
	/**
	 * Armazena a quantidade de produtos do Mercado
	 */
	private int qtdCadastrado;

	
	/**
	 * Inicializa o objeto Mercado sem valores
	 */
	public Mercado() {}

	/**
	 * Inicializa o objeto Mercado com valores para codigo, nome, quantidade
	 * @param codigo Codigo de um Mercado
	 * @param nome Nome do Mercado
	 * @param qtdCadastrado Quantidade de produtos de um Mercado
	 */
	public Mercado(int codigo, String nome, int qtdCadastrado) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.qtdCadastrado = qtdCadastrado;
	}

	/**
	 * Recupera o codigo do mercado
	 * @return codigo Codigo do mercado
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * Altera o codigo do mercado
	 * @param codigo Codigo do mercado
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * Recupera o nome do mercado
	 * @return nome Nome do mercado
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Altera o nome do mercado
	 * @param nome Nome do mercado
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * Recupera a quantidade de produtos do mercado
	 * @return qtdCadastrado Quantidade de produtos do mercado
	 */
	public int getQtdCadastrado() {
		return qtdCadastrado;
	}
	/**
	 * Altera o quantidade de produtos do mercado
	 * @param qtdCadastrado Quantidade de produtos do mercado
	 */
	public void setQtdCadastrado(int qtdCadastrado) {
		this.qtdCadastrado = qtdCadastrado;
	}

	


	
	
}

