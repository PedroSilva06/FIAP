package br.com.fiap.tds.view;

import java.util.Scanner;

import br.com.fiap.tds.bean.Conta;
import br.com.fiap.tds.bean.Usuario;

public class TesteCheckpoint {
	
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nomeUsuario = leitor.next() + leitor.nextLine();		
		
		System.out.println("Digite o número da Agência: ");
		long numeroAgencia = leitor.nextLong();
		
		System.out.println("Digite o número da conta: ");
		long numeroConta = leitor.nextLong();
		
		System.out.println("Digite o saldo atual: ");
		double saldo = leitor.nextDouble();
		
	
		Usuario usuario = new Usuario(nomeUsuario);
		
		Conta conta = new Conta(usuario);
		conta.setSaldo(saldo);
		conta.setNumeroAgencia(numeroAgencia);
		conta.setNumeroConta(numeroConta);
		
		String dados = conta.exibirDados();
		System.out.println(dados);
		
		
		leitor.close();
	}
}
