package br.com.fiap.tds.view;

import java.util.Scanner;

import br.com.fiap.tds.bean.ContaCorrente;
import br.com.fiap.tds.exception.SaldoInsuficienteException;
import br.com.fiap.tds.exception.ValorNegativoException;

public class TesteContaCorrente {
	
	private static 	Scanner leitor = new Scanner(System.in);

	/**
	 * Ler um número do tipo double, tratando a exception até que o usuário digite um número válido
	 * @return valor double lido
	 */
	public static double lerDouble() {
		//Ler um número até que seja um número válido
		while (true) {
			try {
				double valor = leitor.nextDouble();
				return valor;
			} catch (RuntimeException e) {		
				System.out.println("Número inválido, digite novamente:");
				leitor.next();
			}
			
		}	
	}
	/**
	 * Lê um número inteiro, tratando a exception, até que o usuario digite um número válido
	 * @return número inteiro inserido pelo usuário
	 */
	
	public static int lerInt() {
		//Ler um número até que seja um número válido
		while (true) {
			try {
				return leitor.nextInt();
			} catch (RuntimeException e) {		
				System.out.println("Número inválido, digite novamente:");
				leitor.next();
			}
			
		}	
	}
	public static void main(String[] args) throws Exception {
		
		//Ler o saldo e limite da conta corrente
		System.out.println("Digite o saldo");
		double saldo = lerDouble();
		
		System.out.println("Digite o limite");
		double limite = lerDouble();
		
		//Instanciar a conta corrente com os dados
		ContaCorrente cc = new ContaCorrente(saldo, limite);
		
		//Variavel para armazenar a opção do usuário
		int opcao;
		
		//Laço
		do {
			//Menu 1-Depositar, 2-Sacar, 3-Alterar limite, 0-Sair
			System.out.println("Escolha: 1-Depositar, 2-Sacar, 3-Alterar limite, 0-Sair");
			
			//Ler a opção do menu
			opcao = lerInt();
			
			switch (opcao) {
			case 1:
				System.out.println("Digite o valor para depositar");
				double valor = lerDouble();
				try {
					cc.depositar(valor);
					System.out.println("Valor depositado! Novo saldo: "  + cc.getSaldo());
				} catch (ValorNegativoException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.println("Digite o valor para retirar, Saldo:"  + cc.getSaldo());
				valor = lerDouble();
				try {
					cc.sacar(valor);
					System.out.println("Valor retirado! Novo saldo: " + cc.getSaldo());
				} catch (ValorNegativoException | SaldoInsuficienteException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("Digite o novo limite, limite atual: " + cc.getLimite());
				limite = lerDouble();
				try {
					cc.setLimite(limite);
					System.out.println("Limite alterado! Novo limite: " + cc.getLimite());
				} catch (ValorNegativoException e) {
					System.out.println(e.getMessage());

				}
				break;
			case 0:
				System.out.println("Finalizando o sistema");
				break;
			default:
				System.out.println("Opção inválida");
			}
		} while (opcao != 0);
		
		leitor.close();
		
	}//main
}//class
