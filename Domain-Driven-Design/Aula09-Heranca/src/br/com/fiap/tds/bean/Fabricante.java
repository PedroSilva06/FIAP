package br.com.fiap.tds.bean;

public class Fabricante {

	//Atributos
	private String nome;
	
	private String pais;
	
	//Construtor
	public Fabricante() {}
	
	public Fabricante(String nome, String pais) {
		this.nome = nome;
		this.pais = pais;
	}
	
	//Getters/Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
}
