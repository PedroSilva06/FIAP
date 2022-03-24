package br.com.fiap.tds.view;

import java.sql.Connection;
import java.util.List;

import br.com.fiap.tds.bean.Produto;
import br.com.fiap.tds.bo.ProdutoBo;
import br.com.fiap.tds.factory.ConnectionFactory;

public class ExemploListagem {

	public static void main(String[] args) {
		try {
			
		
			//Obter a conex�o
			Connection conexao = ConnectionFactory.getConnection();
			
			//Instanciar o ProdutoDao
			ProdutoBo bo = new ProdutoBo(conexao);
			
			//Listar os produtos
			List<Produto> lista = bo.listar();
			
			//Exibir os produtos
			for (Produto produto : lista) {
				System.out.println(produto.getCodigo() + " " + produto.getNome() + " " + produto.getDescricao()
							+ " " + produto.getQuantidade() + " " + produto.getValor());
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
