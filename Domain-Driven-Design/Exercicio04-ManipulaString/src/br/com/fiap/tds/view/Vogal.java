package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class Vogal {

	public static void main(String[] args) {
		
		//Ler uma String
		String palavra = JOptionPane.showInputDialog("digite uma palavra:");

		String vogais = "aeiou";

		//Substituir as vogais por *, sem fazer 5 replaces no código...
		for (int i = 0; i < vogais.length(); i++) {
			palavra = palavra.replace(vogais.charAt(i), '*');
		}		
		
		//Exibir a palavra com as vogais com *
		JOptionPane.showMessageDialog(null, palavra);
		
	}
	
}