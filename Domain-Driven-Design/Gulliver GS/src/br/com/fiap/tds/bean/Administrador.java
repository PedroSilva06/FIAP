package br.com.fiap.tds.bean;

public class Administrador {
	
	private String nome;
	
	private String email;

	public Administrador(String nomeADM, String emailADM) {
		super();
		this.nome = nomeADM;
		this.email = emailADM;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nomeADM) {
		this.nome = nomeADM;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String emailADM) {
		this.email = emailADM;
	}
	
	
	public void addConteudo() {}
	
	public String exibirInformacoesAdministrador() {
		return "Nome:" + nome + "email:" + email;
	}
}
