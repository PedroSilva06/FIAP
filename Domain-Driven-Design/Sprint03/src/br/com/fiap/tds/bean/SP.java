package br.com.fiap.tds.bean;

public class SP extends Ansiedade {
	
	//Sindrome do Panico
	public SP(String informacoes, String video, String musica) {
		super(informacoes, video, musica);
	}

	public String exibirSP() {
		return "Informações sobre SP:" + informacoes + "\nVídeo sobre SP:" + video;
	}

}
