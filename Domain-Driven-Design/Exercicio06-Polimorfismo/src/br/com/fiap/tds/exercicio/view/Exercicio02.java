package br.com.fiap.tds.exercicio.view;

import javax.swing.JOptionPane;
import br.com.fiap.tds.empresa.cadastro.entidade.Cliente;

public class Exercicio02 {

	public static void main(String[] args) {
		
		//Ler os dados do cliente
		int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o código"));
		String nome = JOptionPane.showInputDialog("Digite o nome");
		String titulo = JOptionPane.showInputDialog("Digite o título");
		
		//Instanciar o cliente com os dados
		Cliente cliente = new Cliente(id, nome, titulo);
		
		//Exibir o nome formatado
		cliente.exibirNomeFormatado();
	}
	
}
