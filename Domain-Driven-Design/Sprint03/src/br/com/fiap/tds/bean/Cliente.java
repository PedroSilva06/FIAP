package br.com.fiap.tds.bean;

public class Cliente extends Usuario{

	private String dataCadastro;
	
	public Cliente(String nome, String email, String senha) {
		super(nome, email, senha);
	}

	public Cliente(String nome, String email, String senha, String dataCadastro) {
		super(nome, email, senha);
		this.dataCadastro = dataCadastro;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

}
