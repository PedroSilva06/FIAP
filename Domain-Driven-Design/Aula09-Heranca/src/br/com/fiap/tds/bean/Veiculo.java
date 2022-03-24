package br.com.fiap.tds.bean;

public class Veiculo {
	
	//Atributos
	private int numeroRodas;
	
	private String modelo;
	
	private Fabricante fabricante;
	
	//Métodos
	public void acelerar(int velocidade) {
		System.out.println("Veiculo acelerando " + velocidade);
	}
	
	//Construtores
	public Veiculo(int numeroRodas, String modelo, Fabricante fabricante) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.numeroRodas = numeroRodas;
	}
	
	public Veiculo() {}
	
	//Getters/Setters
	public int getNumeroRodas() {
		return numeroRodas;
	}

	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	
	
}