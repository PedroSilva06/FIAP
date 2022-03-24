package br.com.fiap.tds.empresa.cadastro.entidade;

public class Cliente extends Pessoa {

	//Atributo
	private String titulo;
	
	//Construtores
	public Cliente() {}	
	
	public Cliente(String titulo, String nome) {
		super(nome);
		this.titulo = titulo;
	}
	
	public Cliente(int id, String nome, String titulo) {
		super(id, nome);
		this.titulo = titulo;
	}
	
	//Métodos
		@Override
		public void exibirNomeFormatado() {
			System.out.println(titulo.toUpperCase() + " - " + nome.toUpperCase());
		}

	//Getters e Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
