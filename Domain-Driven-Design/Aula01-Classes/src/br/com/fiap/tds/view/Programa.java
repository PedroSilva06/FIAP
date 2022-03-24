package br.com.fiap.tds.view;

public class Programa {
	
	public static void main (String [] args) {
		
		//Declaração de duas variáveis do tipo int
		int x = 10;
		int y = 2;
		
		//Realizar a soma de x e y
		int soma = x+y;
		
		//Exibir a soma
		System.out.println(soma);
		
		//Realizar a subtração
		int subtracao = x-y;
		//Exibir a subtração
		System.out.println("A subtração é " + subtracao);
		//Realizar a multiplição
		int multiplicacao = x*y;
		//Exibir a multiplicação
		System.out.println("A multiplicação é " + multiplicacao);
		//Realizar a divisão
		int divisao = x/y;
		//Exibir o resultado da divisão
		System.out.println("A divisão é " + divisao);
		
		//obter o resto da divisao // x=10, y=2 (mod)
		int resto = x%y;
		//Exibir o resto da divisão	
		System.out.println("O resto da divisão é " + resto);
		//Incremento
		x++; //incremento em 1 unidade -> x = x+1
		System.out.println("Incremento: " + x);
		
		//Decremento
		x--; //retira 1 unidade -> x = x-1;
		System.out.println("Decremento: " + x);
		
		//Atribuição aditiva
		x += 2; //x = x+2;
		System.out.println("Adição aditiva: " + x);
		
		//Atribuição subtrativa
		x -= y; // x = x-y
		System.out.println("Atribuição subtrativa: " + x);
		//Atribuição multiplicativa
		x *= y; //x = x*y
		System.out.println("Atribuição multiplicativa: " + x);
		//Atribuição de divisão
		x /= y; //x=x/y
		System.out.println("Atribuição de divisão: " + x);
		//Atribuição de resto
		x %= y; // x = x%2;
		System.out.println("Atribuição de resto: " + x);
		
		}
		
}