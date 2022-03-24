package br.com.fiap.tds.bean;

/**
 * Classe que representa os produtos
 * @author FBVM
 * @version 1.0
 */

public class Cliente {

	/**
	 * Armazena o nome do Cliente
	 */
	private String nome;
	/**
	 * Armazena o código do Cliente
	 */
	private int codigo;
	/**
	 * Armazena a quantidade de produtos do Cliente
	 */
	private int qtd;
	
	/**
	 * Inicializa o objeto Cliente sem valores
	 */

	public Cliente() {}

	/**
	 * Inicializa o objeto Cliente com valores para codigo, nome, quantidade
	 * @param codigo Codigo de um cliente
	 * @param nome Nome do cliente
	 * @param qtd Quantidade de produtos de um cliente
	 */
	public Cliente(String nome, int codigo, int qtd) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.qtd = qtd;
	}

	/**
	 * Recupera o nome do cliente
	 * @return nome Nome do cliente
	 */
	
	public String getNome() {
		return nome;
	}
	/**
	 * Altera o nome do cliente
	 * @param nome Nome do cliente
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * Recupera o codigo do cliente
	 * @return codigo Codigo do cliente
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * Altera o codigo do cliente
	 * @param codigo Codigo do cliente
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * Recupera o quantidade do cliente
	 * @return qtd Quantidade de produtos do cliente
	 */
	public int getQtd() {
		return qtd;
	}
	/**
	 * Altera o Quantidade do cliente
	 * @param qtd Quantidade de produtos do cliente
	 */
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	
	
	
}
