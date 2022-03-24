package br.com.fiap.tds.ltp.jogo.personagem;

public class Personagem {
	
	//Atributos
	private String nome;
	
	private int forca, inteligencia, level, destreza;

	//Construtores
	public Personagem() {}
	
	public Personagem(String nome, int forca, int inteligencia, int level, int destreza) {
		this.nome = nome;
		this.forca = forca;
		this.inteligencia = inteligencia;
		this.level = level;
		this.destreza = destreza;
	}

	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getDestreza() {
		return destreza;
	}

	public void setDestreza(int destreza) {
		this.destreza = destreza;
	}


}
