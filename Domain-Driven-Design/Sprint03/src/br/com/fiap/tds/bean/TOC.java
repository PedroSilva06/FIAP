package br.com.fiap.tds.bean;

public class TOC extends Ansiedade{

	public TOC(String informacoes, String video, String musica) {
		super(informacoes, video, musica);
	}
	
	public String exibirTOC() {
		return "Informações sobre TOC:" + informacoes + "\n Vídeo sobre TOC:" + video;
	}
	
	

}
