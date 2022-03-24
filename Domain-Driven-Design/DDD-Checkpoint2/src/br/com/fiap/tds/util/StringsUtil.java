package br.com.fiap.tds.util;

public class StringsUtil {

	/**
	 * Valida se a string � nula ou vazia
	 * @param valor string para valida��o
	 * @return verdadeiro se for nula ou vazia
	 */
	public static boolean isNullOrEmpty(String valor) {
		return valor == null || valor.equals("");
	}
	
	/**
	 * Valida se a string possui mais do que a quantidade de caracteres informado
	 * @param valor string para valida��o
	 * @param caracteres quantidade de caracteres
	 * @return verdadeiro se a string possui mais do que a qtd de caracteres informado
	 */
	public static boolean hasMoreThan(String valor, int caracteres) {
		return valor.length() > caracteres;
	}
	
	/**
	 * Valida se a string � nula ou vazia ou se possui mais do que a quantidade de caracteres informado
	 * @param valor string para valida��o
	 * @param caracteres quantidade de caracteres 
	 * @return verdadeiro se a string � nula ou vazia ou se possui mais do que a qtd de caracteres informado
	 */
	public static boolean isNullOrEmptyOrHasMoreThan(String valor, int caracteres) {
		return isNullOrEmpty(valor) || hasMoreThan(valor, caracteres);
	}

}