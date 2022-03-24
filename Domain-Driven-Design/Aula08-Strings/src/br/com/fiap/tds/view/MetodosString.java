package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class MetodosString {

	public static void main(String[] args) {
		//Ler um nome
		String nome = JOptionPane.showInputDialog("Digite o nome");
		
		System.out.println(nome);
		
		//Validar se nome começa com a letra A
		if (nome.startsWith("A")) {
			System.out.println("Nome começa com \"A\"");
		} else {
			System.out.println("Nome não começa com \"A\"");
		}
		
		//Validar se o nome termina com "Silva"
		if (nome.endsWith("Silva")) {
			System.out.println("Nome termina com \"Silva\"");
		} else {
			System.out.println("Nome não termina com \"Silva\"");
		}
		
		//Exibir a quantidade de caracteres do nome
		System.out.println("Quantidade de caracteres: " + nome.length());
		
		//Recuperar um caractere de uma String pela posição (começa do zero)
		char letra = nome.charAt(3);
		System.out.println("Quarta letra do nome é: " + letra);
		
		//Escrever o nome na vertical
		for (int i=0; i < nome.length() ; i++) {
			System.out.println(nome.charAt(i));
		} 
		
		//Recuperação posição da primeira letra/palavra na string
		//Recuperar a posição da palavra Silva
		int posicao = nome.indexOf("Silva");
		System.out.println("A posição da palavra \"Silva\" é: " + posicao);
		
		//Verificar se o nome possui a letra a
		if (nome.indexOf("a") != -1) {
			System.out.println("O nome possui a letra \"a\"!");
		} else {
			System.out.println("O nome não possui a letra \"a\"!");
		}
		
		//Verificar se a string possui uma letra/palavra
		System.out.println(nome.contains("a")?"Possui \"a\"":"Não possui \"a\"");
		
		//Recuperar a posição da última letra/palavra na string
		//Recuperar a posição da última letra "a" e exibir
		System.out.println("Última letra \"a\" está na posição: " + nome.lastIndexOf("a"));
		
		//Obter uma parte de uma String a partir de outra String
		//Obter as 3 primeiras letras do nome e exibi-las
		String parteNome = nome.substring(0,3);
		System.out.println("As três primeiras letras do nome são: " + parteNome);
		
		//Exibir o primeiro nome da pessoa
		String primeiroNome = nome.substring(0, nome.indexOf(" "));
		System.out.println("Primeiro nome: " + primeiroNome);
		
		//Exibir o sobrenome (último nome) da pessoa
		//Thiago T I Yamamoto -> substring da posição do último espaço + 1 até o final
		String sobrenome = nome.substring(nome.lastIndexOf(" ") + 1);
		System.out.println("Sobrenome: " + sobrenome);
		
		//Exibir o nome com as letras maiúsculas
		String nomeMaiusculo = nome.toUpperCase();
		System.out.println(nomeMaiusculo);
		
		//Exibir o nome com as letras minusculas
		String nomeMinusculo = nome.toLowerCase();
		System.out.println(nomeMinusculo);
		
		//Verificar se o nome contem Silva, sem considerar as letras maiúscula e minusculas
		//Transforma a string nome para minúsculo e verifica se existe o silva no nome
		if (nome.toLowerCase().contains("silva")) {
			System.out.println("Nome possui Silva");
		} else {
			System.out.println("Nome não possui Silva");
		}
		
		//Substituir um caractere por outro
		//Substituir o "a" por "o"
		String nome2 = nome.replace('a', 'o');
		System.out.println(nome2);
		
		//Exibir a quantidade de caracteres de um nome, sem contar os espaços
		//Retirar os espaços do nome
		String nomeSemEspaco = nome.replace(" ", "");
		System.out.println(nomeSemEspaco);
		System.out.println("Quantidade de letras no nome: " + nomeSemEspaco.length());
		
		
		
	}//main
	
}//classe
