package br.com.fiap.tds.bean;

public class Administrador {
	
	protected String nome;
	
	protected String email;
	
	protected String senha;
	
	protected int codigo;
	
	public Administrador() {}
	
	public Administrador(int codigo, String nome, String email, String senha) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	
	
	public Administrador(String nome, String email, String senha) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	
	
	public Administrador(String email, String senha) {
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
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
