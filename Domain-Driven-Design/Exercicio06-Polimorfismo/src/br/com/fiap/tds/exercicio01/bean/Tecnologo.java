package br.com.fiap.tds.exercicio01.bean;

public class Tecnologo extends Formacao{

	//Atributos
	public boolean planoEstendido;
	
	//Construtores
	public Tecnologo() {}
	
	public Tecnologo(String descricao, int periodo, boolean planoEstendido) {
		super(descricao, periodo);
		this.planoEstendido = planoEstendido;
	}

	//Métodos
	public void calcularMensalidade(double fator) {
		mensalidade = duracao * 600 * fator;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Plano estendido: " + planoEstendido;
	}

	//Getters e Setters

	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}
	
	
}
