package br.com.fiap.tds.ltp.pacotes.ex02.produtos.cd;

import br.com.fiap.tds.ltp.pacotes.ex02.produtos.Produto;

public class Cd extends Produto{
	
	//Atributos
	private String artista, album;


	//Construtores
	public Cd() {}
	
	
	public Cd(int codigo, int preco, String artista, String album) {
		super(codigo, preco);
		this.artista = artista;
		this.album = album;
	}


	//Getters e Setters
	public String getArtista() {
		return artista;
	}


	public void setArtista(String artista) {
		this.artista = artista;
	}


	public String getAlbum() {
		return album;
	}


	public void setAlbum(String album) {
		this.album = album;
	}


}
