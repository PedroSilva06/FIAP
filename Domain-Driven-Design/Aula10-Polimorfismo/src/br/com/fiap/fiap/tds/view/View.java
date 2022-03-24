package br.com.fiap.fiap.tds.view;

import javax.swing.JOptionPane;

import br.com.fiap.fiap.tds.bean.Funcionario;
import br.com.fiap.fiap.tds.bean.Nivel;
import br.com.fiap.fiap.tds.bean.Programador;

public class View {
	
	public static void main(String[] args) {
		//Ler os dados do funcionário
		//id, nome, nível, salário, linguagem
		int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID"));
		String nome = JOptionPane.showInputDialog("Digite o nome");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário"));
		
		//Lê uma String e tranforma em uma das opções de Nível (Constante)
		Nivel nivel = Nivel.valueOf(JOptionPane.showInputDialog("Digite o nível"));
		
		//Instanciar um funcionário com os dados
		Funcionario funcionario = new Funcionario(id, nome, nivel, salario);
		
		//Calcular e exibir o aumento de salário
		System.out.println(funcionario);
		double novoSalario = funcionario.aumentarSalario();
		
		System.out.println("Novo salário: " + novoSalario);
		System.out.println(funcionario);
		
		//Calcular e exibir o bônus anual
		System.out.println("Bônus: " + funcionario.calcularBonusAnual());
		
		//Instanciar um Programador com os mesmos dados do funcionário e ler a linguagem
		String linguagem = JOptionPane.showInputDialog("Digite a linguagem");
		Programador programador = new Programador(id, nome, nivel, salario,linguagem);
		
		//Exibir os dados do Programador
		System.out.println(programador);
		
		//Chamar o método para aumentar o salário
		System.out.println("Novo salário do programador: " + programador.aumentarSalario());
		
		//Exibir os dados do Programador
		System.out.println(programador);
		
		//Calcular e exibir o nônus anual do Programador
		System.out.println("Bônus anual do programador: " + programador.calcularBonusAnual());
		
		//Funcionario e Programador
		Funcionario f2 = programador; //Programador é um funcionario?
		f2.aumentarSalario(); //Chama o método de qual classe? Programador
		
		if (f2 instanceof Programador) {
		//Cast -> Força a variavel f2 ser do tipo Programador (Se não for, dá erro)
		Programador p2 = (Programador) f2; //Funcionario é um programador? Não, necessariamente
		System.out.println("P2: " + p2);
		} else {
			System.out.println("O f2 não é um programador");
		}
	}
}
















