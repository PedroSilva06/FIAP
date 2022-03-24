package br.com.fiap.tds.bean;

public class Bicicleta extends Veiculo {

	//Atributos
	private int numeroAro;
	
	private String guidao;
	
	//Construtores
	//Padrão
	public Bicicleta() {}
	
	//Com todos os atributos (incluindo da superclasse)
	public Bicicleta(int numeroRodas, String modelo, Fabricante fabricante, int numeroAro, String guidao) {
		super(numeroRodas, modelo, fabricante);
		this.numeroAro = numeroAro;
		this.guidao = guidao;
	}
	
	//Métodos
	public void empinar() {
		System.out.println("Empinando a bicicleta");
	}

	//Getter/Setters
	public int getNumeroAro() {
		return numeroAro;
	}

	public void setNumeroAro(int numeroAro) {
		this.numeroAro = numeroAro;
	}

	public String getGuidao() {
		return guidao;
	}

	public void setGuidao(String guidao) {
		this.guidao = guidao;
	}
	

	
}
