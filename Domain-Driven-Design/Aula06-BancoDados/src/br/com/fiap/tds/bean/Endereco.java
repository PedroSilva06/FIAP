package br.com.fiap.tds.bean;

/**
 * Classe que representa um endereço e a tabela TB_ENDERECO
 * @author pedro
 *
 */

public class Endereco {

	private int codigo;
	
	private String logradouro;
	
	private String cep;

	private Fabricante fabricante;
	
	

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
}
