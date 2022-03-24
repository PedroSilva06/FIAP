package br.com.fiap.tds.bean;

public class Elevador {

	//Atributos
	private int andarAtual, totalAndares, capacidade, pessoasPresentes;
	
	//Construtor!!
	public Elevador(int capacidade, int total) {
		this.capacidade = capacidade;
		totalAndares = total;
	}
	
	//Método que retorna os valores do elevador
	public String gerenciarElevador() {
		String dados = "Capacidade: " + capacidade + " Pessoas presentes: " +
				pessoasPresentes + " Total Andares: " + totalAndares + 
				" Andar atual: " + andarAtual;
		return dados; //CTRL + espaço
	}
	
	//o método entra() deve adicionar o valor passado como parâmetro ao atributo
	//quantidadeAtualPessoas, desde que a capacidade do elevador não seja excedida
	//Após executar o procedimento citado, o método deve retornar o valor do atributo
	//quantidadeAtualPessoas;
	public int entrar(int qtd) {
		//validar se é possível adicionar as pessoas, se possível adiciona-las no elevador
		if (validarEntrada(qtd)) {
			pessoasPresentes = pessoasPresentes + qtd; //pessoasPresentes = pessoasPresentes + qtd;
		}
		//retorns o valor das pessoasPresentes
		return pessoasPresentes;
	}
	
	//Subir, descer, entrar e sair
		public void entrar() {
			if (validarEntrada(1))
			pessoasPresentes++;
		}
		
		private boolean validarEntrada(int qtd) {
			return pessoasPresentes + qtd <= capacidade;
		}
	
	/*
	 * O método sai() deve subtrair do atributo quantidadeAtualPessoas o valor passado
	 * como parâmetro, desde que o resultado desta operação seja um número maior ou igual a 0.
	 * Após executar o procedimento citado, o método deve retornar a quantidade de pessoas
	 * restantes no elevador;
	 * */
	public int sair(int qtd) {
		//validar se é possível retirar pessoa do elevador, se sim, retirar
		if (validarSaida(qtd)) {
			pessoasPresentes-= qtd; //pessoasPresentes = pessoasPresentes - qtd
		}
		//retornar o valor atual das pessoas presentes no elevador
		return pessoasPresentes;
	}
	
	public void sair() {
		if (validarSaida(1))
			pessoasPresentes--;
	}
	
	private boolean validarSaida(int qtd) {
		return pessoasPresentes - qtd >= 0;
	}
	
	
	/*
	 * Adicionar 1 ao atributo andarAtual, desde que o resultado desta operação
	 * não seja maior que o valor do atributo quantidadeAndar. Após executar o procedimento citado,
	 * o método deve retornar o valor true quando o valor for adicionado e false no caso contrário;
	 */
	public boolean subir() {
		if (andarAtual == totalAndares) {
			return false;
		} 
			andarAtual++;
			return true;
		
	}
	
	/*
	 * Deve subtrair 1 ao atributo andarAtual, desde que o resultado desta operação
	 * não seja menor que 0 (zero). Após executar o procedimento citado,
	 * o método deve retornar o valor true quando o valor for subtraido e false no caso contrário;
	 */
	
	public boolean descer() {
		if (andarAtual > 0) {
			andarAtual--;
			return true;
		}
			return false;			
		
	}
	
	//Getters e Setters -> CTRL + 3 -> ggas

	public int getAndarAtual() {
		return andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public int getPessoasPresentes() {
		return pessoasPresentes;
	}

	
}