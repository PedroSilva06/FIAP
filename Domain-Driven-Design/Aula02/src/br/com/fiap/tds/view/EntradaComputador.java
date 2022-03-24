package br.com.fiap.tds.view;

import java.util.Scanner;
import br.com.fiap.tds.bean.Computador;

public class EntradaComputador {

	public static void main(String [] args) {

		Scanner leitor = new Scanner(System.in);
		
		//Ler os dados do computador (informado pelo usuário)
		System.out.println("Digite o Processador: ");
		String processador = leitor.next() + leitor.nextLine(); //Le uma string
		
		System.out.println("Tem placa de video? (true/false)");
		boolean placaVideo = leitor.nextBoolean();
		
		System.out.println("Tamanaho do Hd: ");
		int hd = leitor.nextInt();
		
		System.out.println("Placa mãe: ");
		String placaMae = leitor.next() + leitor.nextLine();
		
		System.out.println("Preço: ");
		double preco = leitor.nextDouble();

		
		
		// Instanciar um objeto do tipo Computador (criar o objeto
		Computador pc = new Computador();
		
		
		//Atribuir os valores lidos nos atributos do objeto computador
		pc.configurarComputador(processador, placaVideo, hd, placaMae, preco);
		
		//Exibir os valores dos atributos do objeto
		String configuracao = pc.retornarConfiguracao();
		System.out.println(configuracao);
		
		//Ler o desconto
		System.out.print("Digite o desconto: (%)");
		double desconto = leitor.nextDouble();
		
		//Calcular o preço do pc com desconto
		double valor = pc.calcularDesconto(desconto);
		
		//Exibir o valor do pc com o desconto
		System.out.print("Valor com desconto: " + valor);
		
		leitor.close();
	
	}
	
}
