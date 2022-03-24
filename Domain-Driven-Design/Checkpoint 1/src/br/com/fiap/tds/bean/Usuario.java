package br.com.fiap.tds.bean;

public class Usuario {
	
	//atributos
	private String nome;
	

	//Construtor
	public Usuario(String nome) {
		this.nome = nome;
	}


	//Métodos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

}
