package br.com.fiap.tds.bean;

public class Destino extends Paginas{
	
	public String informacoes;
	
	public String idioma;
	
	public String costumes;
	
	public float cotacao;
	
	public String moeda;
	
	public String documentos;
	
	public int fuso;
	
	public int tomadaVolt;

	public Destino(String informacoesDestino, String idioma, String costumes, float cotacao,
			String moeda, String documentos, int fuso, int tomadaVolt) {
		super();
		this.informacoes = informacoesDestino;
		this.idioma = idioma;
		this.costumes = costumes;
		this.cotacao = cotacao;
		this.moeda = moeda;
		this.documentos = documentos;
		this.fuso = fuso;
		this.tomadaVolt = tomadaVolt;
	}

	

	public String getInformacoes() {
		return informacoes;
	}

	public void setInformacoes(String informacoesDestino) {
		this.informacoes = informacoesDestino;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getCostumes() {
		return costumes;
	}

	public void setCostumes(String costumes) {
		this.costumes = costumes;
	}

	public float getCotacao() {
		return cotacao;
	}

	public void setCotacao(float cotacao) {
		this.cotacao = cotacao;
	}

	public String getMoeda() {
		return moeda;
	}

	public void setMoeda(String moeda) {
		this.moeda = moeda;
	}

	public String getDocumentos() {
		return documentos;
	}

	public void setDocumentos(String documentos) {
		this.documentos = documentos;
	}

	public int getFuso() {
		return fuso;
	}

	public void setFuso(int fuso) {
		this.fuso = fuso;
	}

	public int getTomadaVolt() {
		return tomadaVolt;
	}

	public void setTomadaVolt(int tomadaVolt) {
		this.tomadaVolt = tomadaVolt;
	}
	
	public String exibirInformacoesDestino() {
        return "Informacoes:" + informacoes + "Idioma:" + idioma
                + "Costumes:" + costumes + "Cotacao:" + cotacao + "Moeda:" + moeda + "Documentos:" +
                documentos + "Fuso:" + fuso + "TomadaVolt:" + tomadaVolt;
	}
}
