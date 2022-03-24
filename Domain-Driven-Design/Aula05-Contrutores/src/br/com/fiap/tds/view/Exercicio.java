package br.com.fiap.tds.view;

import java.util.Scanner;

import br.com.fiap.tds.bean.Funcionario;
import br.com.fiap.tds.bean.Profissao;

public class Exercicio {
	
	public static void main(String [] args) {
		
		//Ler os dados do funcionário e profissão
		Scanner leitor = new Scanner(System.in); //CTRL + SHIFT + o (import)
		
		System.out.println("Digite o nome da profissão: ");
		String nomeProfissao = leitor.next() + leitor.nextLine();
		
		System.out.println("Digite o nome do funcionário: ");
		String nomeFuncionario = leitor.next() + leitor.nextLine();
		
		System.out.println("Digite a matricula: ");
		long matricula = leitor.nextLong();
		
		System.out.println("Digite o salário: ");
		double salario = leitor.nextDouble();
		
		//Instanciar um objeto Funcionário com os dados
		Profissao profissao = new Profissao(nomeProfissao);
		
		Funcionario funcionario = new Funcionario(matricula, nomeFuncionario, profissao);
		funcionario.setSalario(salario);
		
		//Exibir os dados
		String dados = funcionario.exibirDados();
		System.out.println(dados);
		
		leitor.close();
	}

}