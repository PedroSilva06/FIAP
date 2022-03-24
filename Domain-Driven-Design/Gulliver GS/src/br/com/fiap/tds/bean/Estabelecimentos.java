package br.com.fiap.tds.bean;

public class Estabelecimentos extends Paginas{
	
	public String estabelecimento;
	
	public String localizacao;
	
	public String caminho;
	
	public float horarioFuncionamento;
	
	public int horarioPico;
	
	public float valorPratos;
	
	public String siteEstabelecimentos;
	
	public String musicas;

	public Estabelecimentos(String nomeEstabelecimento, String localizacao, String caminho, float horarioFuncionamento,
			int horarioPico, float valorPratos, String siteEstabelecimentos, String musicas) {
		super();
		this.estabelecimento = nomeEstabelecimento;
		this.localizacao = localizacao;
		this.caminho = caminho;
		this.horarioFuncionamento = horarioFuncionamento;
		this.horarioPico = horarioPico;
		this.valorPratos = valorPratos;
		this.siteEstabelecimentos = siteEstabelecimentos;
		this.musicas = musicas;
	}

	public String getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(String estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}

	public float getHorarioFuncionamento() {
		return horarioFuncionamento;
	}

	public void setHorarioFuncionamento(float horarioFuncionamento) {
		this.horarioFuncionamento = horarioFuncionamento;
	}

	public int getHorarioPico() {
		return horarioPico;
	}

	public void setHorarioPico(int horarioPico) {
		this.horarioPico = horarioPico;
	}

	public float getValorPratos() {
		return valorPratos;
	}

	public void setValorPratos(float valorPratos) {
		this.valorPratos = valorPratos;
	}

	public String getSiteEstabelecimentos() {
		return siteEstabelecimentos;
	}

	public void setSiteEstabelecimentos(String siteEstabelecimentos) {
		this.siteEstabelecimentos = siteEstabelecimentos;
	}

	public String getMusicas() {
		return musicas;
	}

	public void setMusicas(String musicas) {
		this.musicas = musicas;
	}

	public String exibirInformacoesEstabelecimentos() {
		return "Nome do estabelecimento:" + estabelecimento + "\nLocalizacao:" + localizacao + "\nComo chegar:" + caminho + "\nHorario de funcionamento:" 
	+ horarioFuncionamento + "\nHorario de pico:" + horarioPico + "Preco de servicos:" + valorPratos + "Site:" + siteEstabelecimentos + "Musicas:" 
	+ musicas;
	}
}
