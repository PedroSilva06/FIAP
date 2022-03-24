package br.com.fiap.tds.BEAN;

import java.util.Date;

public class Usuario {
	
	private int cd_usuario;
	private String nm_usuario;
	private String ds_email;
	private String ds_senha;
	private String ds_genero;
	private Date dt_nascimento;
	
		
	public Usuario(int cd_usuario, String nm_usuario, String ds_email, String ds_senha, String ds_genero,
			Date dt_nascimento) {
		super();
		this.cd_usuario = cd_usuario;
		this.nm_usuario = nm_usuario;
		this.ds_email = ds_email;
		this.ds_senha = ds_senha;
		this.ds_genero = ds_genero;
		this.dt_nascimento = dt_nascimento;
	}
	
	public Usuario() {}
	
	public int getCd_usuario() {
		return cd_usuario;
	}
	public void setCd_usuario(int cd_usuario) {
		this.cd_usuario = cd_usuario;
	}
	public String getNm_usuario() {
		return nm_usuario;
	}
	public void setNm_usuario(String nm_usuario) {
		this.nm_usuario = nm_usuario;
	}
	public String getDs_email() {
		return ds_email;
	}
	public void setDs_email(String ds_email) {
		this.ds_email = ds_email;
	}
	public String getDs_senha() {
		return ds_senha;
	}
	public void setDs_senha(String ds_senha) {
		this.ds_senha = ds_senha;
	}
	public String getDs_genero() {
		return ds_genero;
	}
	public void setDs_genero(String ds_genero) {
		this.ds_genero = ds_genero;
	}
	public Date getDt_nascimento() {
		return dt_nascimento;
	}
	public void setDt_nascimento(Date dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
}
