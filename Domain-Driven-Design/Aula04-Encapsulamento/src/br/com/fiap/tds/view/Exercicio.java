package br.com.fiap.tds.view;

import br.com.fiap.tds.bean.Cor;
import br.com.fiap.tds.bean.Lancha;

public class Exercicio {

	public static void main(String[] args) {
		//Instanciar uma cor
		Cor cor = new Cor();
		
		//CTRL + SHIFT + o -> import
		//Instaciar uma Lancha
		Lancha lancha = new Lancha();
		
		//Atribuir valores para os objetos
		cor.setNome("Branca");
		cor.setR(255);
		cor.setB(255);
		cor.setG(255);
		
		
		lancha.setAnoFabricacao(2020);
		lancha.setComprimento(12);
		lancha.setCor(cor);
		lancha.setModelo("Parelha Armada 300");
		lancha.setQuantidadeLugares(10);
		lancha.setQuantidadeMotores(2);
		
		//sysout -> CTRL + espaço
		System.out.println(lancha.getModelo() + " " + lancha.getCor().getNome());
	}
}
