package br.com.fiap.tds.bean;

public class Usuario {
	
	protected String nome;
	
	protected String email;
	
	protected String senha;
	
	protected int codigo;
	
	protected int ansiedade;

	public Usuario() {}
	
	
	public Usuario(int codigo, String nome, String email, String senha, int ansiedade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.ansiedade = ansiedade;
	}

	public Usuario(int codigo, String nome, String email, String senha) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	public Usuario(String email, String senha) {
		super();
		this.email = email;
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getAnsiedade() {
		return ansiedade;
	}

	public void setAnsiedade(int ansiedade) {
		this.ansiedade = ansiedade;
	}


	public String exibirUsuario() {
		return "Email:" + nome + "\n Senha:" + senha;
	}
	
}
