package br.com.fiap.tds.bean;

public class Ansiedade {
	
	protected String informacoes;
	
	protected String video;
	
	protected String musica;

	public Ansiedade(String informacoes, String video, String musica) {
		this.informacoes = informacoes;
		this.video = video;
		this.musica = musica;
	}

	public String getInformacoes() {
		return informacoes;
	}

	public void setInformacoes(String informacoes) {
		this.informacoes = informacoes;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public String getMusica() {
		return musica;
	}

	public void setMusica(String musica) {
		this.musica = musica;
	}

}
