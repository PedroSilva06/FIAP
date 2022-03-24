package br.com.fiap.tds.bean;

import java.util.Date;

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
	 * Armazena o validade do produto 
	 */
	private String validade;
	/**
	 * Armazena a quantidade do produto
	 */
	private int qtd;
	
	/**
	 * Armazena se o produto � in natura
	 */
	private boolean inNatura;
	
	/**
	 * Armazena se o produto esta disponivel
	 */
	private boolean status;
	
	/**
	 * Construtor que retorna o nome, validade, quantidade e in natura quando chamado no map
	 */
	
	@Override
	public String toString() {
		return "Nome: " + nome + " Validade:" + validade +  " Quantidade: " + qtd + "In Natura: " + inNatura + "Status: " + status;
	}

	/**
	 * Inicializa o objeto Produto sem valores
	 */

	public Produto() {}
	/**
	 * Inicializa o objeto Produto com valores para nome, quantidade e pre�o
	 * @param nome Nome do produto
	 * @param qtd Quantidade de um produto
	 * @param validade Validade de um produto
	 */
	public Produto(String validade) {
		this.validade = validade;
	}
	
	/**
	 * Inicializa o objeto Produto com valores para nome, quantidade e pre�o
	 * @param codigo Codigo do produto
	 * @param nome Nome do produto
	 * @param qtd Quantidade de um produto
	 * @param validade Validade de um produto
	 */
	public Produto(int codigo, String nome, Date validade, int qtd) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.qtd = qtd;
	}
	
	
	
	
	
	public Produto(int codigo, String nome, String validade, int qtd, boolean inNatura, boolean status) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.validade = validade;
		this.qtd = qtd;
		this.inNatura = inNatura;
		this.status = status;
	}

	public Produto(String nome, String validade, int qtd, boolean inNatura, boolean status) {
		super();
		this.nome = nome;
		this.validade = validade;
		this.qtd = qtd;
		this.inNatura = inNatura;
		this.status = status;
	}

	public Produto(String nome, int qtd, boolean inNatura, boolean status) {
		super();
		this.nome = nome;
		this.qtd = qtd;
		this.inNatura = inNatura;
		this.status = status;
	}

	/**
	 * Inicializa o objeto Produto com valores para nome, quantidade e pre�o
	 * @param codigo Codigo do produto
	 * @param nome Nome do produto
	 * @param qtd Quantidade de um produto
	 * @param validade Validade de um produto
	 * @param inNatura Condi��o do produto
	 */
	public Produto(int codigo, String nome, int qtd, boolean inNatura, boolean status) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.qtd = qtd;
		this.inNatura = inNatura;
		this.status = status;
	}
	
	/**
	 * Inicializa o objeto Produto com valores para nome, quantidade e pre�o
	 * @param codigo Codigo do produto
	 * @param nome Nome do produto
	 * @param qtd Quantidade de um produto
	 * @param validade Validade de um produto
	 * @param inNatura Condi��o do produto
	 * @param status Disponibilidade do produto
	 */
	public Produto(String nome, int codigo, String validade, int qtd, boolean inNatura, boolean status) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.validade = validade;
		this.qtd = qtd;
		this.inNatura = inNatura;
		this.status = status;
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
	 * Recupera a validade do produto
	 * @return	validade Validade do produto
	 */
	public String getValidade() {
		return validade;
	}
	/**
	 * Altera a data de validade do produto
	 * @param validade Validade do produto
	 */
	public void setValidade(String validade) {
		this.validade = validade;
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
	
	/**
	 * Recupera se produto � in natura
	 * @return inNatura Condi��o do produto
	 */
	
	public boolean isInNatura() {
		return inNatura;
	}
	
	/**
	 * Altera a condi��o de in natura
	 * @param inNatura Condi��o do produto
	 */

	public void setInNatura(boolean inNatura) {
		this.inNatura = inNatura;
	}

	/**
	 * Recupera se produto est� disponivel
	 * @return inNatura Disponibilidade do produto
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * Altera se produto est� disponivel
	 * @return inNatura Disponibilidade do produto
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
}