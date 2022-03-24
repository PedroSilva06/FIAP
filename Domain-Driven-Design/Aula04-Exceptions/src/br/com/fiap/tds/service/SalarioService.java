package br.com.fiap.tds.service;

import br.com.fiap.tds.exception.MesesTrabalhadosInvalidoException;
import br.com.fiap.tds.exception.SalarioInvalidoException;

/**
 * Classe que calcularssalários e bônus dos Colaboradores
 * @author Pedro Silva
 * @version 1.0
 */
public class SalarioService {
	
	/**
	 * Método que calcula o décimo terceiro salário do colaborador
	 * @param salario valor do sálario
	 * @param mesesTrabalhados meses trabalhados pelo colaborador
	 * @returno valor do décimo terceiro salário
	 * @throws MesesTrabalhadosInvalidoException exception caso os meses trabalhados não esteja entre 0 e 12
	 * @throws SalarioInvalidoException exception caso o salário seja negativo
	 */

	public double calcular13(double salario, int mesesTrabalhados) throws MesesTrabalhadosInvalidoException, SalarioInvalidoException {
		
		//Validar se os meses trabalhados está entre 0 e 12
		if (mesesTrabalhados < 0 || mesesTrabalhados > 12) {
			//Lançar uma exception
			throw new MesesTrabalhadosInvalidoException("Meses trabalhados inválido");
		}	
		//Validar se o salário é negativo
		if (salario>0) {
			//lançar uma exception
			throw new SalarioInvalidoException("O salário não pode ser negativo");
		}
		
		return salario*mesesTrabalhados/ 12;
	}
	
}