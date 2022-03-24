package br.com.fiap.tds.bean;

public class Elevador {

	//Atributos: andar atual, total andares, capacidade, pessoas presentes;
	
	public int andarAtual;
	
	public int totalAndares;
	
	public int capacidade;
	
	public int pessoasPresentes;
	
	// public int andarAtual, totalAndar, capacidade, pessoasPresentes; -> outra forma possível
	
	//Métodos
	//Inicializa -> recebe a capacidade do elevador e o total de andares
	public void inicializa(int capacidade, int total) {
		this.capacidade = capacidade;
		totalAndares = total;
	}
	
	//Método que retorna os valores do elevador
	public String gerenciarElevador() {
		String dados = "Capacidade: " + capacidade + " Pessoas presentes: " + pessoasPresentes + 
				" Total andares: " + totalAndares + " Andar atual: " + andarAtual;
		return dados; //CTRL + espaço
	}
	
	//Subir, descer, entrar e sair
	public void entrar() {
		pessoasPresentes++;
	}
	
	public void sair() {
		pessoasPresentes--;
	}
	
	public void subir () {
		andarAtual++;
	}
	
	public void descer() {
		andarAtual--;
	}
}
