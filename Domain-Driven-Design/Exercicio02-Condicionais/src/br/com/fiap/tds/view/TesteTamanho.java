package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class TesteTamanho {
	
	//Crie uma classe TesteTamanho em java que peça o nome, a altura e o 
	//peso de 2 pessoas e apresente o nome da mais pesada e o nome da mais alta
	public static void main(String[] args) {
		//Ler o nome, altura e peso da pessoa 1
		String nome1 = JOptionPane.showInputDialog("Digite o nome da pessoa 1");
		float peso1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso"));
		float altura1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura"));
		
		//Ler o nome, altura e peso da pessoa 2
		String nome2 = JOptionPane.showInputDialog("Digite o nome da pessoa 2");
		float peso2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso"));
		float altura2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura"));
		
		//Exibir os dados
		System.out.println(nome1 + " peso: " + peso1 + " altura: " + altura1);
		System.out.println(nome2 + " peso: " + peso2 + " altura: " + altura2);
		
		//Verificar a pessoa mais pesada
		System.out.println("Mais pesado(a): ");
		if (peso1 > peso2) {
			JOptionPane.showMessageDialog(null, nome1);
		} else if (peso2 > peso1) {
			JOptionPane.showConfirmDialog(null, nome2);
		} else {
			JOptionPane.showMessageDialog(null, "Possuem o mesmo peso!");
		}
		
		//Verificar a pessoa mais alta
		if (altura1 > altura2)
			JOptionPane.showConfirmDialog(null, nome1);
		else if (altura2 > altura1)
			JOptionPane.showConfirmDialog(null, nome2);
		else
			JOptionPane.showMessageDialog(null, "Possuem a mesma altura!");
	
	}//main
	
}//classe