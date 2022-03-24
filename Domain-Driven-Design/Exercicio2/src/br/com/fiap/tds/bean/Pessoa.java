package br.com.fiap.tds.bean;

public class Pessoa {
	
	// Atributos: nome, idade, altura
	
	public String nome;
	
	public int idade;
	
	public float altura;
	
	//Métodos: para alterar o valor e recuperar os valores
	public void gerenciarDados(String nome, int idade, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura; //this -> referencia para a classe/objeto
	}
	
	public String retornarDados() {
		String dados = "Nome: " + nome + "Altura: " + altura + "Idade: " + idade;
		
		return dados;
	}

}
