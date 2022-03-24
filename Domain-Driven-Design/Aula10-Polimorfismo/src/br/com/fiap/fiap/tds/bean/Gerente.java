package br.com.fiap.fiap.tds.bean;

public class Gerente extends Funcionario{
	
	private int tamanhoEquipe;

	//Construtores
	public Gerente() {}

	public Gerente(int tamanhoEquipe) {
		this.tamanhoEquipe = tamanhoEquipe;
	}

	//Getters e Setters
	public int getTamanhoEquipe() {
		return tamanhoEquipe;
	}

	public void setTamanhoEquipe(int tamanhoEquipe) {
		this.tamanhoEquipe = tamanhoEquipe;
	}
	
	
	
	
}
