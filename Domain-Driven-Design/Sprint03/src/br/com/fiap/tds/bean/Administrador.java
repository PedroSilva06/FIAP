package br.com.fiap.tds.bean;

public class Administrador extends Usuario {
	
	public Administrador(String nome, String email, String senha) {
		super(nome, email, senha);
	}

	public Administrador(String email, String senha) {
		super(email, senha);
	}	

	public String exibirAdministrador() {
		return "Nome do Administrador:" + nome + "\nEmail:" + email + "\nSenha:" + senha;
	}
		
}
