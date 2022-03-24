package br.com.fiap.tds.bean;

public class Chatbot {

	private String mensagem;
	
	private String redirectDestino;

	public Chatbot(String mensagem, String redirectDestino) {
		super();
		this.mensagem = mensagem;
		this.redirectDestino = redirectDestino;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getRedirectDestino() {
		return redirectDestino;
	}

	public void setRedirectDestino(String redirectDestino) {
		this.redirectDestino = redirectDestino;
	}
	
	
}
