package br.com.fiap.tds.exercicio01.bean;

public class Lancha extends Veiculo {
	
	//Atributos
	private int quantidadeMotores;

	//Construtor
	public Lancha() {}
	
	public Lancha(String modelo, int quantidadeLugares, double comprimento, int anoFabricacao, Cor cor,
			int quantidadeMotores) {
		super(modelo, quantidadeLugares, comprimento, anoFabricacao, cor);
		this.quantidadeMotores = quantidadeMotores;
	}

	//Getters e Setters
	public int getQuantidadeMotores() {
		return quantidadeMotores;
	}

	public void setQuantidadeMotores(int quantidadeMotores) {
		this.quantidadeMotores = quantidadeMotores;
	}
	
}
