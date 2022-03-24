package br.com.fiap.tds.bean;

import java.util.List;

/**
 * Classe que representa um fabricante e a tabela TB_FABRICANTE
 * @author pedro
 *
 */

public class Fabricante {
	
	private int codigo;
	
	private String nome;
	
	private Endereco endereco;
	
	private List<Produto> produtos;

	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}
