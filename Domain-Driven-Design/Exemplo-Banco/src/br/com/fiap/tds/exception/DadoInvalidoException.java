package br.com.fiap.tds.exception;

public class DadoInvalidoException extends Exception {

	public DadoInvalidoException() {
		super("Dado inv�lido");
	}
	
	public DadoInvalidoException(String msg) {
		super(msg);
	}
	
}
