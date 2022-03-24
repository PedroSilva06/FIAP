package br.com.fiap.tds.exercicio.view;

import java.util.Scanner;

import br.com.fiap.tds.exercicio01.bean.Bacharelado;
import br.com.fiap.tds.exercicio01.bean.Medio;
import br.com.fiap.tds.exercicio01.bean.Tecnologo;



public class Exercicio01{

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		//Perguntar qual a formação
		System.out.println("Digite \n1-Medio \n2-Tecnologo \n3-Bacharelado");
		int op = leitor.nextInt();
		
		//Ler os dados da formação correta
		System.out.println("Digite a descrição");
		String descricao = leitor.next() + leitor.nextLine();
		
		System.out.println("Digite o periodo (1-Manha 2-Noite)");
		int periodo = leitor.nextInt();
				
		//Instanciar o bjeto
		switch (op) {
		case 1: {
			System.out.println("Digite o tipo");
			String tipo = leitor.next() + leitor.nextLine();
			Medio medio = new Medio(descricao, periodo, tipo);
			medio.definirDuracao();
			medio.calcularMensalidade(1);
			System.out.println(medio);
			break;
		}
		case 2: {
			System.out.println("Possui plano estendido?");
			boolean plano = leitor.nextBoolean();
			Tecnologo tecnologo = new Tecnologo(descricao, periodo, plano);
			tecnologo.definirDuracao();
			tecnologo.calcularMensalidade(1);
			System.out.println(tecnologo);
			break;
		}
		case 3: {
			System.out.println("Digite o rpojeto de conclusao");
			String projeto = leitor.next() + leitor.nextLine();
			System.out.println("Digite a carga horária do estágio");
			int estagio = leitor.nextInt();
			Bacharelado bacharel= new Bacharelado(null, periodo, projeto, estagio);
			bacharel.definirDuracao();
			bacharel.calcularMensalidade(1);
			System.out.println(bacharel);
			break;
		}
		default:
			System.out.println("Opcão inválida");
		}
		
		
		//Exibir os dados
		leitor.close();
		
	}
}
