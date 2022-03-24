package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class Maiuscula {

	//Ler uma informação e exibir tudo em maiuscula
	public static void main(String[] args) {
		
		//Lê uma palavra
		String palavra = JOptionPane.showInputDialog("Digite uma palavra");
		
		//Transformar em maiúscula
		palavra = palavra.toUpperCase();
		
		//Exivir o resultado
		System.out.println(palavra);
		
	}
	
}
