package br.com.fiap.tds.bean;

public class Time {
	
	//Atributos
	private String nome;
	
	private int numeroTitulos;
	
	private int anoFundacao;
	
	private boolean mundial;
	
	//Construtores
	//Não tem retorno (nem void) e possui o mesmo nome da classe
	//Construtor padrão - sem parâmetros
	public Time() {}
		
	public Time(String nome, int numeroTitulos) {
		this.nome = nome;
		this.numeroTitulos = numeroTitulos;
	
	}
	
	public Time(String nome, int numeroTitulos, int anoFundacao, boolean mundial) {
		this(nome, numeroTitulos); //chamando o construtor Time(String nome, iint numeroTitulos
		//this.nome = nome;
		//this.numeroTitulos = numeroTitulos;
		this.anoFundacao = anoFundacao;
		this.mundial = mundial;
	}
	
	//Métodos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroTitulos() {
		return numeroTitulos;
	}

	public void setNumeroTitulos(int numeroTitulos) {
		this.numeroTitulos = numeroTitulos;
	}

	public int getAnoFundacao() {
		return anoFundacao;
	}

	public void setAnoFundacao(int anoFundacao) {
		this.anoFundacao = anoFundacao;
	}

	public boolean isMundial() {
		return mundial;
	}

	public void setMundial(boolean mundial) {
		this.mundial = mundial;
	}

	
}
