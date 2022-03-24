package br.com.fiap.tds.exercicio.view;

import javax.swing.JOptionPane;

import br.com.fiap.tds.exercicio03.bean.ContaCorrente;
import br.com.fiap.tds.exercicio03.bean.ContaPoupanca;
import br.com.fiap.tds.exercicio03.bean.Titular;

public class Exercicio03 {

	public static void main(String[] args) {
		//Pedir os dados do titular
		String nomeTitular = JOptionPane.showInputDialog("Digite o nome do titular");
		String cpfTitular = JOptionPane.showInputDialog("Digite o CPF");
		
		//Instanciar um titular
		Titular titular = new Titular(nomeTitular, cpfTitular);

		
		//Pedir os dados da conta corrente (saldo, titular, agencia, número, limite
		double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da cc"));
		int agencia = Integer.parseInt(JOptionPane.showInputDialog("Digite a agencia da cc"));
		String numero = JOptionPane.showInputDialog("Digite o número da conta corrente");
		double limite = Double.parseDouble(JOptionPane.showInputDialog("Digite o limite"));
		
		//Instanciar uma conta corrente
		ContaCorrente cc = new ContaCorrente(saldo, titular, agencia, numero, limite);
		
		//Pedir os dados da conta poupança
		double saldoPoupanca = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da poupança"));
		int agenciaPoupanca = Integer.parseInt(JOptionPane.showInputDialog("Digite a agencia da poupança"));
		String numeroPoupanca = JOptionPane.showInputDialog("Digite o número da conta poupança");
		double taxaJuros = Double.parseDouble(JOptionPane.showInputDialog("Digite a taxa de juros"));
	
		//Instanciar uma conta poupança
		ContaPoupanca cp = new ContaPoupanca(saldoPoupanca, titular, agenciaPoupanca, numeroPoupanca, taxaJuros);
		
		//Exibir todos os valores da conta corrente e conta poupança
		JOptionPane.showMessageDialog(null, cc);
		JOptionPane.showMessageDialog(null, cp);

		
		//Pedir o valor para o saque
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para o saque"));
		
		//Sacar da conta corrente e poupança
		cc.sacar(valor);
		cp.sacar(valor);
		
		//Exibir o valor
		System.out.println("Saldo da conta corrente " + cc.exibirSaldo());
		System.out.println("Saldo da conta poupança " + cp.exibirSaldo());
		
		//Exibir todos os valores da conta corrente e conta poupança
		JOptionPane.showMessageDialog(null, cc);
		JOptionPane.showMessageDialog(null, cp);
		
		//Pedir o valor para depósito
		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para o deposito"));
		
		//Depositar na conta corrente e poupança
		cc.depositar(valor);
		cp.depositar(valor);

		
		//Exibir o valor
		JOptionPane.showMessageDialog(null, "Saldo da conta corrente " + cc.exibirSaldo());
		JOptionPane.showMessageDialog(null, "Saldo da conta poupança " + cp.exibirSaldo());

	}
}
