package br.com.fiap.tds.bean;

public class PaginaPrincipal {
	
	public String informacoes;
	
	private String login;
	
	private String cadastro;

	public PaginaPrincipal(String informacoesPP, String login, String cadastro) {
		super();
		this.informacoes = informacoesPP;
		this.login = login;
		this.cadastro = cadastro;
	}
	
	public PaginaPrincipal(String informacoes) {
		super();
		this.informacoes = informacoes;
	}

	public String getInformacoes() {
		return informacoes;
	}

	public void setInformacoes(String informacoesPP) {
		this.informacoes = informacoesPP;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getCadastro() {
		return cadastro;
	}

	public void setCadastro(String cadastro) {
		this.cadastro = cadastro;
	}
	
	public void cadastro() {}
	
	public void login() {}
	
	public void atualizarPerfil() {}
	
	public String exibirInformacoesPaginaPrincipal() {
		return "Informacoes:" + informacoes;
	}
	
}
