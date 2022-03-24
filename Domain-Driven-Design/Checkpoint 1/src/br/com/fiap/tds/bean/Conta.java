package br.com.fiap.tds.bean;

public class Conta {

	//Atributos
	private Usuario usuario;
	
	private long numeroAgencia, numeroConta;
	
	private double saldo;
	

	
	public Conta() {}

	public Conta(int numeroAgencia, int cpf) {
		super();
		this.numeroAgencia = numeroAgencia;

	}

	public Conta(int numeroAgencia, int numeroConta, double saldo, int cpf) {
		super();
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	public Conta(Usuario nome) {
		super();
		this.usuario = nome;
	}

	
	public String exibirDados () {
		return  " Número da Agência: " + numeroAgencia + " Número da conta: " + numeroConta + 
				" Saldo: " + saldo + " Nome: " + usuario.getNome();
	}
	
	
	
	//Métodos gets/sets

	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	

	public long getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(long numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	
	public long getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(long numeroConta) {
		this.numeroConta = numeroConta;
	}

	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
