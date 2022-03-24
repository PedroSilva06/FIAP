package br.com.fiap.tds.view;

import java.util.Scanner;

import br.com.fiap.tds.bean.Elevador;

public class TesteElevador {
	
	//main + CTRL espaço
	public static void main(String[] args) {
		//Instanciar um elevador
		//CTRL + espaço
		//CTRL + SHIFT + o -> faz o import
		Elevador elevador = new Elevador();
		//Ler os dados do elevador (capacidade e quantidade de andares)
		Scanner leitor = new Scanner (System.in);
		
		System.out.print("Digite a capacidade: ");
		int cap = leitor.nextInt();
		
		System.out.print("Digite a quantidade de andares: ");
		int qtd = leitor.nextInt();
		
		//Atribuir os valores para o objeto
		elevador.inicializa(cap, qtd);
		//Exibir os dados
		String dados = elevador.gerenciarElevador();
		System.out.println(dados);
		
		
		//subir
		elevador.subir();
		
		//entrar pessoa
		elevador.entrar();

		//subir
		elevador.subir();
		
		//Exibir os dados
		dados = elevador.gerenciarElevador();
		System.out.println(dados);
		
		leitor.close();
		
	}

}
