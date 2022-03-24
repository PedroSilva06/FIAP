package br.com.fiap.tds.to;

public class ChurrosTO {

	private int codigo;
	
	private String nome;
	
	private double valor;
	
	private String sabor;

	public ChurrosTO() {}

	public ChurrosTO(int codigo, String nome, double valor, String sabor) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.valor = valor;
		this.sabor = sabor;
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

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
}
