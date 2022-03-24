package br.com.fiap.tds.bean;

public class Usuario {
	
	private String codigo;
	
	private String email;
	
	private String senha;
	
	private boolean estadLogin;
	
	private String dataCadastro;
	
	private String destino;
	
	private String telefone;
	
	private boolean genero;

	public Usuario(String codigo, String email, String senha, boolean estadLogin, String dataCadastro, String destino,
			String telefone, boolean genero) {
		super();
		this.codigo = codigo;
		this.email = email;
		this.senha = senha;
		this.estadLogin = estadLogin;
		this.dataCadastro = dataCadastro;
		this.destino = destino;
		this.telefone = telefone;
		this.genero = genero;
	}

	public Usuario(String codigoUsuario, String emailUsuario, String senha) {
		super();
		this.codigo = codigoUsuario;
		this.email = emailUsuario;
		this.senha = senha;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigoUsuario) {
		this.codigo = codigoUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String emailUsuario) {
		this.email = emailUsuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isEstadLogin() {
		return estadLogin;
	}

	public void setEstadLogin(boolean estadLogin) {
		this.estadLogin = estadLogin;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public boolean isGenero() {
		return genero;
	}

	public void setGenero(boolean genero) {
		this.genero = genero;
	}
	
	public void verifLogin() {}
	
	public String exibirInformacoesUsuario() {
	    return "/nCodigo do Usuario:" + codigo + "/nEmail:" + email + "/nSenha:" + senha + 
	    "/nEstado do login:" + estadLogin + "/nData do Cadastro:" + dataCadastro + "/nDestino:" + destino
	    + "/nTelefone:" + telefone + "/nGênero do Usuario:" + genero;
	}
	
}
