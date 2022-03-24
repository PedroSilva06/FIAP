package br.com.fiap.tds.bean;

public class Endereco {

	//Atributos
	public String rua;

	public short numero;
	
	public String complemento;
	
	public String bairro;
	
	public String cep;
	
	//Métodos
	//retorna o numeor do endereço
	public short getNumero() {
		return numero;
	}
	
	//Altera o número do endereço
	public void setNumero(short novoNumero) {
		numero = novoNumero;
	}
	
}
