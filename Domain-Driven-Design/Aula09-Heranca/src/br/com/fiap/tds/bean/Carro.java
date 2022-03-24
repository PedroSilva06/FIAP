package br.com.fiap.tds.bean;

//Carro é um Veiculo (Carro não tem um Veiculo)
public class Carro extends Veiculo {

	//Atributos
	//Carro possui um motor (Carro não é um motor)
	private Motor motor;
	
	private String placa;
	
	//Construtor
	public Carro(int numeroRodas, String modelo, Fabricante fabricante) {
		super(numeroRodas, modelo, fabricante); //Invoca o construtor da classe pai (superclasse)
	}
	
	public Carro(int numeroRodas, String modelo, Fabricante fabricante, Motor motor, String placa) {
		super(numeroRodas, modelo, fabricante);
		this.motor = motor;
		this.placa = placa;
	}
	
	public Carro() {}
	
	//Métodos
	public void darSeta(int lado) {
		System.out.println(lado == 1 ? "Seta Direita" : "Seta Esquerda");
	}

	//Getters/Setters
	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
}
