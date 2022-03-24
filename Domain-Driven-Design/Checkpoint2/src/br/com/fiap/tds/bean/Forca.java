package br.com.fiap.tds.bean;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Forca {
	 public static void main(String[] args) {
	        
	        Scanner leitor = new Scanner(System.in);

	        System.out.println("Digite uma palavra: ");
	        String palavraDigitada = leitor.next();
			String nomeMinusculo = palavraDigitada.toLowerCase();

	        
	        System.out.println("Digite uma dica: ");
	        String dica = leitor.next();
	        
	        
	        System.out.println("\nA dica �: " + dica);
	
	        List<Character> letrasInvalidas = new ArrayList<>();

	        char[] asterisco = new char[nomeMinusculo.length()];
	        for (int i = 0; i < nomeMinusculo.length(); i++) {
	        	asterisco[i] = '*';
	        }


	        int tamPalavra = nomeMinusculo.length();
	        int tentativas = 6;

	        while(tamPalavra > 0 && tentativas > 0 ){
	        	System.out.println("\nLetras inv�lidas: " + letrasInvalidas);
	            for ( int i = 0; i < nomeMinusculo.length(); i++) {
	              System.out.print(" " + asterisco[i] + " ");
	            }
	         
	            System.out.println("\nVoc� tem " + tentativas + " chances de adivinhar");
	            System.out.println("Digite uma letra: ");
	            char letra = leitor.next().charAt(0);
	            boolean correto = false;
	            for (int i = 0; i < asterisco.length; i++) {
	                if(nomeMinusculo.charAt(i) == letra)
	                {
	                	asterisco[i] = letra;
	                    tamPalavra--;
	                    correto = true;
	                }
	            }

	            if(!correto) {
	                tentativas--;
	                letrasInvalidas.add(letra);
	            }
	            	            
	            
	        }

	        if(tamPalavra == 0) {
	        	
	            System.out.println("Parab�ns!Voc� acertou! A palavra era: " + palavraDigitada + ".");
	        } else { 
	        	System.out.println("Infelizmente voc� perdeu.");
	        }
	        leitor.close();


	    }
}
