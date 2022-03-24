package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class TesteEleitores {

	/*
	 Leia a idade de 3 pessoas e informe a sua classe eleitoral:
	 * não eleitor (abaixo de 16 anos)
	 * Eleitor obrigatório (entre 18 e 65)
	 * eleitor facultativo (16, 17 anos e maior de 65 anos)
	 Ao final da execução exibir o total de eleitores obrigatórios.
	 */
	public static void main(String[] args) {
		
		//armazena a qtd de pessoas obrigadas a votar
		int qtd = 0; 
		
		//for (variavel controle, condição parada, incremento/decremento) {}
		for (int i = 0; i <3; i++) {
			//Ler a idade
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
			
			//Validar o tipo de eleitor
			if (idade < 16) {
				JOptionPane.showMessageDialog(null, "Não eleitor");
			} else if (idade >= 18 && idade <= 65) {
				JOptionPane.showMessageDialog(null, "Eleitor obrigatório");
				qtd++;
			} else {
				JOptionPane.showMessageDialog(null, "Eleitor Facultativo");
			}
			
		}//for
		
		//Exibir a quantidade de eleitores obrigatórios
		JOptionPane.showMessageDialog(null, "Eleitores obrigatórios: " + qtd);
		
	}//main
	
}//classe