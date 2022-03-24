package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bean.Elevador;

public class Terminal {
	
	
	public static void main(String[] args) {
		
		//Pedir a capacidade e total de andares
		int pessoas = Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade do elevador"));
		int andares = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de andares"));
		
		//Instanciar um elevador com as informções do usuário
		Elevador elevador = new Elevador(pessoas, andares);

		int op = 0; //ler a opção
		
		//Valida no começo, pode ser que não entre no while
		//while (op !=0) {}
		
		//Valida no fial, é executado pelo menos uma vez
		do {
			//Pedir uma opção para o usuário
			// 1 - Entrar com a qtd e exibir a qtd atual
			// 2 - Sair com a qtd e exibir a qtd atual
			// 3 - Subir e exibir a andar atual
			// 4 - Descer e exibir a andar atual
			// 0 - Sair
		
			op = Integer.parseInt(JOptionPane.showInputDialog(
					"Escolha a opção:\n"
					+ "1 - Entrar no elevador \n"
					+ "2 - Sair do elevador\n"
					+ "3 - Subir \n"
					+ "4 - Descer\n"
					+ "0 - Sair do Sistema"));
			
			switch(op) {
				case 1 :
					//Ler a quantidade de pessoas para entrar no elevador
					int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pessoas:"));
					//Chamar o método de entrar no elevador com a quantidade informada e exibir a qtd
					JOptionPane.showMessageDialog(null, "Quantidade atual: " + elevador.entrar(qtd));
					break;
				case 2 :
					//Ler a quantidade de pessoas para sair do elevador
					qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pessoas:"));
					//Chamar o método de sair e exibir a quantidade atual
					JOptionPane.showMessageDialog(null, "Quantidade atual: " + elevador.sair(qtd));
					break;
				case 3:
					//Subir um andar
					elevador.subir();
					//Exibir o andar atual
					JOptionPane.showMessageDialog(null, "Andar atual: " + elevador.getAndarAtual());
					break;
				case 4:
					//Descer um andar
					elevador.descer();
					//Exibir o andar atual
					JOptionPane.showMessageDialog(null, "Andar atual: " + elevador.getAndarAtual());
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "Finalizando... Obrigado por utilizar!");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida");
					
			}
			
		} while (op != 0);
		
	}//main

}//classe