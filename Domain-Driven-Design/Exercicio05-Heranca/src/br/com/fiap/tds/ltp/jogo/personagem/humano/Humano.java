package br.com.fiap.tds.ltp.jogo.personagem.humano;

import br.com.fiap.tds.ltp.jogo.personagem.Personagem;

public class Humano extends Personagem {
	
	//Atributo
	private String classe;

	//Construtor
	public Humano() {}
	
	public Humano(String nome, int forca, int inteligencia, int level, int destreza, String classe) {
		super(nome, forca, inteligencia, level, destreza);
		this.classe = classe;
	}

	String definirClasse() {
		return classe;
	}
	
	//Getters e Setters
	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}
	
}
