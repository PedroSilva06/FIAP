package br.com.fiap.tds.view;

import java.util.Scanner;

import br.com.fiap.tds.bean.Data;

public class ExercicioData {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		//Instanciar uma Data
		Data data = new Data();
		
		//Setar os valores para dia, mes e ano
		System.out.println("Digite o ano:");
		data.setAno(leitor.nextInt());
		
		System.out.println("Digite o dia:");
		int dia = leitor.nextInt();
		data.setDia(dia);
		
		System.out.println("Digite o mês:");
		int mes = leitor.nextInt();
		data.setMes(mes);
		
		//Exibir a data
		String dataFormatada = data.getData();
		System.out.println(dataFormatada);
		
		//Exibir o nome do mês
		System.out.println(data.retornaMes());
	}
}
