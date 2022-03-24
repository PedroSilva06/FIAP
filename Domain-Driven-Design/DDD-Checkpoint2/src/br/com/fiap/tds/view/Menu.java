package br.com.fiap.tds.view;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.fiap.tds.bean.Produto;
import br.com.fiap.tds.bo.ProdutoBo;
import br.com.fiap.tds.exception.EntidadeNaoEncontradaException;
import br.com.fiap.tds.exception.ParametroInvalidoException;
import br.com.fiap.tds.factory.ConnectionFactory;


public class Menu {
	
public static void main(String[] args) {
	
	Scanner leitor = new Scanner(System.in);
		
	int opcao; 
	
	do {
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog(
				"Escolha a opção para setar:\n"
				+ "1 - Cadastrar Produto\n"
				+ "2 - Listar Produtos\n"
				+ "3 - Pesquisar Codigo\n"
				+ "4 - Pesquisar por nome \n"
				+ "5 - Editar \n"
				+ "6 - Remover produtos\n"
				+ "0 - Sair do sistema"));
		
		switch(opcao) {
			case 1 :
				
				try {
					System.out.println("Digite o nome:");
					String nome = leitor.next() + leitor.nextLine();
					
					System.out.println("Digite o preco:");
					double preco = leitor.nextDouble();
					
					System.out.println("Digite a quantidade:");
					int qtd = leitor.nextInt();
					
					//Instanciar um produto
					Produto produto = new Produto(0, nome, preco, qtd);
					
					//Obter a conexão com o banco
					Connection conexao = ConnectionFactory.getConnection();
					
					//Instanciar o ProdutoBo
					ProdutoBo bo = new ProdutoBo(conexao);
					
					//Cadastrar o produto no banco utilizando o DAO
					bo.cadastrar(produto);
				
					System.out.println("Produto cadastrado!");
					
					conexao.close();
				} catch (ParametroInvalidoException e) {
					System.out.println(e.getMessage());
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				break;
				
			case 2 :
				
				try {
					//Obter a conexão
					Connection conexao = ConnectionFactory.getConnection();
					
					//Instanciar o ProdutoBo
					ProdutoBo bo = new ProdutoBo(conexao);
					
					//Listar os produtos
					List<Produto> lista = bo.listar();
					
					//Exibir os produtos
					for (Produto produto : lista) {
						System.out.println(produto.getCodigo() + " " + produto.getNome() + " " + produto.getPreco()
							+" "+ produto.getQtd());
					}
					
				} catch (Exception e) {
					System.out.println(e.getMessage()); 
				}
				
				break;
				
			case 3:
				
				try {
					//Obter uma conexão
					Connection conexao = ConnectionFactory.getConnection();
					
					//Instanciar um ProdutoBo
					ProdutoBo bo = new ProdutoBo(conexao);
					
					System.out.println("Digite o código:");
					int codigo = leitor.nextInt();
					
					//Pesquisar pelo código
					Produto produto = bo.pesquisar(codigo);
					
					//Exibir o resultado
					System.out.println(produto.getCodigo());
					System.out.println(produto.getNome());
					System.out.println(produto.getPreco());
					System.out.println(produto.getQtd());
					
					conexao.close();
					
				} catch (EntidadeNaoEncontradaException e) {
					System.out.println(e.getMessage());
				} catch (Exception e) {
					e.printStackTrace();
				}

				break;
				
			case 4:
				try {
					//Obter uma conexão
					Connection conexao = ConnectionFactory.getConnection();
					
					//Instanciar o BO
					ProdutoBo bo = new ProdutoBo(conexao);
					
					//Ler o nome
					String nome = JOptionPane.showInputDialog("Digite o nome:");
					
					//Pesquisar por nome
					List<Produto> lista = bo.pesquisarPorNome(nome);
					
					//Exibir os produtos
					for (Produto produto : lista) {
						System.out.println(produto.getCodigo());
						System.out.println(produto.getNome());
						System.out.println(produto.getPreco());
						System.out.println(produto.getQtd());
					}
					
					conexao.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
				
			case 5:
				try {
					//Obter uma conexão
					Connection conexao = ConnectionFactory.getConnection();
					
					//Instanciar um ProdutoDao
					//ProdutoDao dao = new ProdutoDao(conexao);
					ProdutoBo bo = new ProdutoBo(conexao);

					System.out.println("Digite o código:");
					int codigo = leitor.nextInt();
					
					System.out.println("Digite o nome do produto:");
					String nome = leitor.next() + leitor.nextLine();
					
					System.out.println("Digite o valor do produto:");
					double preco = leitor.nextDouble();

					System.out.println("Digite a quantidade do produto:");
					int qtd = leitor.nextInt();
					
					//Instanciar um produto
					Produto produto = new Produto(codigo, nome, preco, qtd);
					
					//Atualizar o produto
					bo.atualizar(produto);
					System.out.println("Produto atualizado!");
					
					conexao.close();
				} catch (EntidadeNaoEncontradaException e) {
					System.out.println(e.getMessage());
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			
			case 6:
				
				try {
					//Obter a conexão
					Connection conexao = ConnectionFactory.getConnection();
					
					//Instanciar o ProdutoBo
					ProdutoBo bo = new ProdutoBo(conexao);
					
					//Ler o codigo para remover
					System.out.println("Digite o código:");
					int codigo = leitor.nextInt();
					
					//Remover
					bo.remover(codigo);
					System.out.println("Produto removido!");
					
				} catch (EntidadeNaoEncontradaException e) {
					System.out.println(e.getMessage());
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				break;
				
			case 0:
	
				JOptionPane.showMessageDialog(null, "Finalizando... Obrigado por utilizar!");
				break;	
				
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
					
			}
		
		} while (opcao != 0);
	
		leitor.close();
		
	}
		
}
