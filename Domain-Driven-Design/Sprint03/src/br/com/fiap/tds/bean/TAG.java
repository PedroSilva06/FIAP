package br.com.fiap.tds.bean;

public class TAG extends Ansiedade {

	//Generalised anxiety disorder
	public TAG(String informacoes, String video, String musica) {
		super(informacoes, video, musica);
	}

	public String exibirTAG() {
		return "Informações sobre TAG:" + informacoes + "\nVídeo sobre TAG:" + video;
	}


	
}
