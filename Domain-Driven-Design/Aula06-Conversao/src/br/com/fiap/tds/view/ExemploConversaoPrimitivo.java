package br.com.fiap.tds.view;

import javax.swing.JOptionPane;

public class ExemploConversaoPrimitivo {
	
	public static void main(String[] args) {
		
		//Ler uma String (número)
		//Scanner leitor = new Scanner(System.in);
		
		//System.out.println("Digite um número: ");
		//String numero= leitor.next() + leitor.nextLine();
		String numero = JOptionPane.showInputDialog("Digite um número");
		
		//Transformar a string nos tipos primitivos (String -> bute, short, int, long, float, double)
		byte b = Byte.parseByte(numero);
		
		short s = Short.parseShort(numero);
		
		int i = Integer.parseInt(numero);
		
		long l = Long.parseLong(numero);
		
		float f = Float.parseFloat(numero);
		
		double d = Double.parseDouble(numero);
		
		//Imprimir a soma dos números
		double total = b + s + i + l + f + d;
		
		System.out.println(total);
		JOptionPane.showMessageDialog(null, total);
		
		//Converter uma string em boolean
		String verdadeiro = "true";
		boolean bool = Boolean.parseBoolean(verdadeiro);
		System.out.println(bool);	
		
		//leitor.close();
	}

}