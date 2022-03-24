package br.com.fiap.tds.bean;

public class Dicas extends Paginas{
	
	public String vestimenta;
	
	public String sugestaoDestino;
	
	public String epocaAno;
	
	public String hospedagem;
	
	public String locomocao;

	public Dicas(String vestimenta, String sugestaoDestino, String epocaAno, String hospedagem, String locomocao) {
		super();
		this.vestimenta = vestimenta;
		this.sugestaoDestino = sugestaoDestino;
		this.epocaAno = epocaAno;
		this.hospedagem = hospedagem;
		this.locomocao = locomocao;
	}

	public Dicas(String vestimenta, String hospedagem) {
		super();
		this.vestimenta = vestimenta;
		this.hospedagem = hospedagem;
	}

	public String getVestimenta() {
		return vestimenta;
	}

	public void setVestimenta(String vestimenta) {
		this.vestimenta = vestimenta;
	}

	public String getSugestaoDestino() {
		return sugestaoDestino;
	}

	public void setSugestaoDestino(String sugestaoDestino) {
		this.sugestaoDestino = sugestaoDestino;
	}

	public String getEpocaAno() {
		return epocaAno;
	}

	public void setEpocaAno(String epocaAno) {
		this.epocaAno = epocaAno;
	}

	public String getHospedagem() {
		return hospedagem;
	}

	public void setHospedagem(String hospedagem) {
		this.hospedagem = hospedagem;
	}

	public String getLocomocao() {
		return locomocao;
	}

	public void setLocomocao(String locomocao) {
		this.locomocao = locomocao;
	}
	
	public void exibirConteudo(String vestimenta, String hospedagem) {}
	
	public String exibirInformacoesDicas() {
	    return "Vestimenta:" + vestimenta + "/nSugestão:" + sugestaoDestino + "/nEpoca do ano:" + epocaAno + 
	    "/nHospedagem:" + hospedagem + "/nLocamoção:" + locomocao;
	}
}
