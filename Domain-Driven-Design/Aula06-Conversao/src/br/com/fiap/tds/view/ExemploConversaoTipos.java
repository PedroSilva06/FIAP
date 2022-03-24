package br.com.fiap.tds.view;

public class ExemploConversaoTipos {

	//Converter os tipos primitios para outros tipos
	public static void main(String[] args) {
		
		//Conversao implicita (automaticas byte -> short -> int -> long -> float -> doble)
		byte valorByte = 10;
		short valorShort = valorByte;
		int valorInt = valorShort;
		long valorLong = valorInt;
		float valorFloat = valorLong;
		double valorDouble = valorFloat;
		
		float valorFloat2 = valorShort;
		long valorLong2 = valorShort;
		
		//Conversao explicita (cast: forçar um tipo ser de outro tipo)
		valorFloat = 10.5f; //f no final, diz que o número é do tipo float
				
		System.out.println("Float: " + valorFloat);
		
		valorInt = (int) valorFloat;
		
		System.out.println("Int: " + valorInt);
		
		valorFloat = (float) valorDouble;
		
		valorInt = (int) valorLong;	
	}
	
}
