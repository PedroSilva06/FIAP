package br.com.fiap.tds.bean;

/**
 * Classe que representa um produto da tabela TB_PRODUTO
 * @author Pedro Leite da Silva
 *
 */

public class Produto {

	private int codigo;
	
	private String nome;
	
	private double valor; 
	
	private String descricao;
	
	private int quantidade;
	
	private Fabricante fabricante;
	

	public Produto() {}

	
	public Produto(int codigo, String nome, double valor, String descricao, int quantidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		this.descricao = descricao;
		this.quantidade = quantidade;
	}

	public Produto(int codigo, String nome, double valor, String descricao, int quantidade, Fabricante fabricante) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.fabricante = fabricante;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
}
