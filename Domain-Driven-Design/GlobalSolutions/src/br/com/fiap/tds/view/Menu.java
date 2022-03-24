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
		
		int menu1;
		
		do {
			
			menu1 = Integer.parseInt(JOptionPane.showInputDialog(
					"Escolha se é mercado ou cliente:\n"
					+ "1 - Mercado\n"
					+ "2 - Cliente\n"
					+ "0 - Sair do sistema"));	
			switch(menu1) {
			case 1 :
				int opcao; 
				
				do {
					
					opcao = Integer.parseInt(JOptionPane.showInputDialog(
							"Escolha a opção para setar:\n"
							+ "1 - Cadastrar Produto\n"
							+ "2 - Listar Produtos\n"
							+ "3 - Pesquisar por nome \n"
							+ "4 - Editar \n"
							+ "5 - Remover produtos\n"
							+ "0 - Voltar para o menu inicial"));
					
					switch(opcao) {
						case 1 :

							try {
								System.out.println("Digite o nome:");
								String nome = leitor.next() + leitor.nextLine();
												
								System.out.println("Digite a quantidade (Kg) do produto:");
								int qtd = leitor.nextInt();
								
								System.out.println("Digite a condição do produto (Digite True = In natura e False = Processado):");
								boolean inNatura = leitor.nextBoolean();
								
								System.out.println("Digite o Status do produto (Digite True = Disponivel e False = Reservado):");
								boolean status = leitor.nextBoolean();
								
								System.out.println("Data de validade(Digite dd/mm/aaaa): ");
								String validade = leitor.next() + leitor.nextLine();
						        
								
								//Instanciar um produto
								Produto produto = new Produto(nome, validade, qtd, inNatura, status);
								
								
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
									System.out.println("Codigo: " + produto.getCodigo() + " | Nome: " + produto.getNome() + " | Validade: " + produto.getValidade()
										+" | Quantidade: "+ produto.getQtd() + "Kg | In Natura: " + produto.isInNatura() + " | Status: " + produto.isStatus());
								}
								
							} catch (Exception e) {
								System.out.println(e.getMessage()); 
							}
							
							break;
								
						case 3:
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
									System.out.println("Codigo: " + produto.getCodigo() + " | Nome: " + produto.getNome() + " | Validade: " + produto.getValidade()
									+" | Quantidade: "+ produto.getQtd() + "Kg | In Natura: " + produto.isInNatura() + " | Status: " + produto.isStatus());
			
								}
								
								conexao.close();
							} catch (Exception e) {
								e.printStackTrace();
							}
							break;
							
						case 4:
							try {
								//Obter uma conexão
								Connection conexao = ConnectionFactory.getConnection();
								
								//Instanciar um ProdutoDao
								//ProdutoDao dao = new ProdutoDao(conexao);
								ProdutoBo bo = new ProdutoBo(conexao);
								
								
								//Listar os produtos
								List<Produto> lista = bo.listar();
								
								//Exibir os produtos
								for (Produto produto : lista) {
									System.out.println("Codigo: " + produto.getCodigo() + " | Nome: " + produto.getNome() + " | Validade: " + produto.getValidade()
										+" | Quantidade: "+ produto.getQtd() + "Kg | In Natura: " + produto.isInNatura() + " | Status: " + produto.isStatus());
								}
									
								System.out.println("Digite o código:");
								int codigo = leitor.nextInt();
								
								System.out.println("Digite o nome do produto:");
								String nome = leitor.next() + leitor.nextLine();
								
								System.out.println("Digite a quantidade (kg) do produto:");
								int qtd = leitor.nextInt();
								
								System.out.println("Digite a condição do produto (Digite True = In natura e False = Processado):");
								Boolean inNatura = leitor.nextBoolean();
								
								System.out.println("Digite o Status do produto (Digite True = Disponivel e False = Reservado):");
								boolean status = leitor.nextBoolean();
								
								
								System.out.println("Data de validade(Digite dd/mm/aaaa): ");
								String validade = leitor.next() + leitor.nextLine();
						        

								//Instanciar um produto
								Produto produto = new Produto(codigo, nome, validade, qtd, inNatura, status);
								
								
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
						
						case 5:
							
							try {
								//Obter a conexão
								Connection conexao = ConnectionFactory.getConnection();
								
								//Instanciar o ProdutoBo
								ProdutoBo bo = new ProdutoBo(conexao);
								
								//Listar os produtos
								List<Produto> lista = bo.listar();
								
								//Exibir os produtos
								for (Produto produto : lista) {
									System.out.println("Codigo: " + produto.getCodigo() + " | Nome: " + produto.getNome() + " | Validade: " + produto.getValidade()
									+" | Quantidade: "+ produto.getQtd() + "Kg | In Natura: " + produto.isInNatura() + " | Status: " + produto.isStatus());
								}
								
								//Ler o codigo para remover
								System.out.println("Digite o código do produto que deseja remover:");
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
				
							JOptionPane.showMessageDialog(null, "Voltando para o menu inicial!");
							break;
							
						default:
							JOptionPane.showMessageDialog(null, "Opção inválida");
								
						}
					
					} while (opcao != 0);
				
					if (opcao == 0) {
						break;
					}
				
			case 2:
				int opcao2; 
				
				do {
					
					opcao2 = Integer.parseInt(JOptionPane.showInputDialog(
							"Escolha a opção para setar:\n"
							+ "1 - Listar Produtos\n"
							+ "2 - Reservar produtos \n"
							+ "0 - Voltar para o menu inicial"));
					
					switch(opcao2) {
						case 1:
							
							try {
								//Obter a conexão
								Connection conexao = ConnectionFactory.getConnection();
								
								//Instanciar o ProdutoBo
								ProdutoBo bo = new ProdutoBo(conexao);
								
								//Listar os produtos
								List<Produto> lista = bo.listar();
								
								//Exibir os produtos
								for (Produto produto : lista) {
									System.out.println("Codigo: " + produto.getCodigo() + " | Nome: " + produto.getNome() + " | Validade: " + produto.getValidade()
									+" | Quantidade: "+ produto.getQtd() + "Kg | In Natura: " + produto.isInNatura() + " | Status: " + produto.isStatus());
								}
								
							} catch (Exception e) {
								System.out.println(e.getMessage()); 
							}
							
							break;
						
						case 2:
							
							try {
								//Obter a conexão
								Connection conexao = ConnectionFactory.getConnection();
								
								//Instanciar o ProdutoBo
								ProdutoBo bo = new ProdutoBo(conexao);
								
								//Listar os produtos
								List<Produto> lista = bo.listar();
								
								//Exibir os produtos
								for (Produto produto : lista) {
									System.out.println("Codigo: " + produto.getCodigo() + " | Nome: " + produto.getNome() + " | Validade: " + produto.getValidade()
									+" | Quantidade: "+ produto.getQtd() + "Kg | In Natura: " + produto.isInNatura() + " | Status: " + produto.isStatus());
								}
								
								//Ler o codigo para remover
								System.out.println("Digite o código do produto que deseja reservar:");
								int codigo = leitor.nextInt();
								
								//Remover
								bo.remover(codigo);
								System.out.println("Produto Reservado!");
								
							} catch (EntidadeNaoEncontradaException e) {
								System.out.println(e.getMessage());
							} catch (Exception e) {
								e.printStackTrace();
							}
							
							break;
							
						case 0:
				
							JOptionPane.showMessageDialog(null, "Voltando para o menu inicial!");
							break;	
							
						default:
							JOptionPane.showMessageDialog(null, "Opção inválida");
								
						}
					
					} while (opcao2 != 0);
				
				break;
				
			case 0:
				JOptionPane.showMessageDialog(null, "Finalizando... Obrigado por utilizar!");
				break;	
				
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida");
					
			}
			
			}while (menu1 !=0);
		
			
			leitor.close();
			
	}
}
