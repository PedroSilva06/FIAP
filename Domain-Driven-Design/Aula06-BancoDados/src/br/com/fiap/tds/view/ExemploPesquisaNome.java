package br.com.fiap.tds.view;

import java.sql.Connection;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bean.Produto;
import br.com.fiap.tds.bo.ProdutoBo;
import br.com.fiap.tds.factory.ConnectionFactory;

public class ExemploPesquisaNome {

	public static void main(String[] args) {
		try {
			//Obter uma conexão
			Connection conexao = ConnectionFactory.getConnection();
			
			//Instanciar o BO
			ProdutoBo bo = new ProdutoBo(conexao);
			
			//Ler o nome
			String nome = JOptionPane.showInputDialog("Digite o nome");
			
			//Pesquisar por nome
			List<Produto> lista = bo.buscarPorNome(nome);
			
			//Exibir os produtos
			for (Produto produto : lista) {
				System.out.println(produto.getNome());
			}
			
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
