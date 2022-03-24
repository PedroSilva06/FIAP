package br.com.fiap.tds.bean;

/**
 * Classe que representa os produtos
 * @author FBVM
 * @version 1.0
 */

public class Produto {
	
	/**
	 * Armazena o nome do produto
	 */
	private String nome;
	/**
	 * Armazena o c�digo do produto
	 */
	private int codigo;
	/**
	 * Armazena o pre�o do produto 
	 */
	private double preco;
	/**
	 * Armazena a quantidade do produto
	 */
	private int qtd;
	
	/**
	 * Construtor que retorna o nome, pre�o e quantidade quando chamado no map
	 */
	
	@Override
	public String toString() {
		return "Nome: " + nome + " Pre�o: " + preco + " Quantidade: " + qtd;
	}
	
	/**
	 * Inicializa o objeto Produto sem valores
	 */

	public Produto() {}
	/**
	 * Inicializa o objeto Produto com valores para nome, quantidade e pre�o
	 * @param nome Nome do produto
	 * @param qtd Quantidade de um produto
	 * @param preco Pre�o de um produto
	 */
	public Produto(String nome, int qtd, double preco) {
		this.nome = nome;
		this.qtd = qtd;
		this.preco = preco;
	}
	
	/**
	 * Recupera o nome do produto
	 * @return nome Nome do produto
	 */
	
	public String getNome() {
		return nome;
	}

	/**
	 * Altera o nome do produto
	 * @param nome Nome do produto
	 */
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Recupera o c�digo do produto 
	 * @return codigo C�digo do produto
	 */
	
	public int getCodigo() {
		return codigo;
	}
	
	/**
	 * Altera o n�mero do c�digo do produto
	 * @param codigo C�digo do produto
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * Recupera o pre�o do produto
	 * @return	preco Pre�o do produto
	 */
	public double getPreco() {
		return preco;
	}
	/**
	 * Altera o n�mero do pre�o do produto
	 * @param preco Pre�o do produtp
	 */
	public void setPreco(double preco) {
		this.preco = preco;
	}

	/**
	 * Recupera a quantidade de produto
	 * @return qtd Quantidade de produto
	 */

	public int getQtd() {
		return qtd;
	}

	/**
	 * Altera o n�mero de quantidade de um produto
	 * @param qtd Quantidade de produto
	 */
	
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
}