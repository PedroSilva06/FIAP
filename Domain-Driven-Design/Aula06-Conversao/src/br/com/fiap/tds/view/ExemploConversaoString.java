package br.com.fiap.tds.view;

public class ExemploConversaoString {
	
	//Transformar um primitivo em uma String
	public static void main(String[] args) {
		
		//Definir uma variável do tipo int e double
		//int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		int idade = 19;
		double salario = 2500.50;
		
		//Tranformar o número em uma String
		String idadeString = String.valueOf(idade);
		
		String salarioString = String.valueOf(salario);
		
		//Exibir a soma
		System.out.println(idade + salario);
		//JOptionPane.showMessageDialog(null, idade + salario);
		
		System.out.println(idadeString + salarioString);
		
		//Concatenação de Strings... um número somado a uma string -> resultado string
		String teste = idade + "" + idade; //transforma em uma String
		System.out.println(teste);
		
	}
	
}