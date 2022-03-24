package br.com.fiap.tds.bean;

public class PaginaPrincipal {
	
	public String informacoes;
	
	private String login;
	
	private String cadastro;

	public PaginaPrincipal(String informacoes, String login, String cadastro) {
		super();
		this.informacoes = informacoes;
		this.login = login;
		this.cadastro = cadastro;
	}

	public PaginaPrincipal(String login, String cadastro) {
		super();
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

	public void setInformacoes(String informacoes) {
		this.informacoes = informacoes;
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

	public String exibirPaginaPrincipal() {
		return "Info da Pagina Principal:" + informacoes;
	}
	
	

}
