package br.com.fiap.tds.view;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.util.List;

import br.com.fiap.tds.bean.Usuario;
import br.com.fiap.tds.bo.UsuarioBo;
import br.com.fiap.tds.exception.ParametroInvalidoException;
import br.com.fiap.tds.exception.EntidadeNaoEncontradaException;
import br.com.fiap.tds.factory.ConnectionFactory;


public class TesteMind {
	
public static void main(String[] args) {
	
	Scanner leitor = new Scanner(System.in);
		
	int opcao; 
	
	do {
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog(
				"Escolha a opção para setar:\n"
				+ "1 - Cadastrar Usuario\n"
				+ "2 - Listar Usuarios\n"
				+ "3 - Pesquisar Codigo\n"
				+ "4 - Listar TAG \n"
				+ "5 - Listar TOC \n"
				+ "6 - Listar SP \n"
				+ "7 - Remover Cadastros\n"
				+ "0 - Sair do sistema"));
		
		switch(opcao) {
			case 1 :
				
				try {
					System.out.println("Digite o nome:");
					String nome = leitor.next() + leitor.nextLine();
					
					System.out.println("Digite o email:");
					String email = leitor.next() + leitor.nextLine();
					
					System.out.println("Digite a senha:");
					String senha = leitor.next() + leitor.nextLine();
					
					System.out.println("Digite a ansiedade:");
					int ansiedade = leitor.nextInt();
					
					//Instanciar um usuario
					Usuario usuario = new Usuario(0, nome, email, senha, ansiedade);
					
					//Obter a conexão com o banco
					Connection conexao = ConnectionFactory.getConnection();
					
					//Instanciar o UsuarioBo
					UsuarioBo bo = new UsuarioBo(conexao);
					
					//Cadastrar o usuario no banco utilizando o DAO
					bo.cadastrar(usuario);
				
					System.out.println("Usuario cadastrado!");
					
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
					
					//Instanciar o UsuarioBo
					UsuarioBo bo = new UsuarioBo(conexao);
					
					//Listar os usuarios
					List<Usuario> lista = bo.listar();
					
					//Exibir os usuarios
					for (Usuario usuario : lista) {
						System.out.println(usuario.getCodigo() + " " + usuario.getNome() + " " + usuario.getEmail()
							+" "+ usuario.getSenha() +" "+ usuario.getAnsiedade());
					}
					
				} catch (Exception e) {
					System.out.println(e.getMessage()); 
				}
				
				break;
				
			case 3:
				
				try {
					//Obter uma conexão
					Connection conexao = ConnectionFactory.getConnection();
					
					//Instanciar um UsuarioBo
					UsuarioBo bo = new UsuarioBo(conexao);
					
					System.out.println("Digite o código");
					int codigo = leitor.nextInt();
					
					//Pesquisar pelo código
					Usuario usuario = bo.pesquisar(codigo);
					
					//Exibir o resultado
					System.out.println(usuario.getCodigo());
					System.out.println(usuario.getNome());
					System.out.println(usuario.getEmail());
					System.out.println(usuario.getSenha());
					System.out.println(usuario.getAnsiedade());
					
					conexao.close();
					
				} catch (EntidadeNaoEncontradaException e) {
					System.out.println(e.getMessage());
				} catch (Exception e) {
					e.printStackTrace();
				}

				break;
				
			case 4:
				
				try {
					//Obter a conexão
					Connection conexao = ConnectionFactory.getConnection();
					
					//Instanciar o UsuarioBo
					UsuarioBo bo = new UsuarioBo(conexao);
					
					//Listar os usuarios
					List<Usuario> listaTAG = bo.listarTAG();
					
					//Exibir os usuarios
					for (Usuario usuario : listaTAG) {
						System.out.println(usuario.getCodigo() + " " + usuario.getNome() + " " + usuario.getEmail()
							+" "+ usuario.getSenha() +" "+ usuario.getAnsiedade());
					}
					
				} catch (Exception e) {
					System.out.println(e.getMessage()); 
				}
				
				break;
				
			case 5:
				
				try {
					//Obter a conexão
					Connection conexao = ConnectionFactory.getConnection();
					
					//Instanciar o UsuarioBo
					UsuarioBo bo = new UsuarioBo(conexao);
					
					//Listar os usuarios
					List<Usuario> listaTOC = bo.listarToc();
					
					//Exibir os usuarios
					for (Usuario usuario : listaTOC) {
						System.out.println(usuario.getCodigo() + " " + usuario.getNome() + " " + usuario.getEmail()
							+" "+ usuario.getSenha() +" "+ usuario.getAnsiedade());
					}
					
				} catch (Exception e) {
					System.out.println(e.getMessage()); 
				}
			
				break;
			
			case 6:
				
				try {
					//Obter a conexão
					Connection conexao = ConnectionFactory.getConnection();
					
					//Instanciar o UsuarioBo
					UsuarioBo bo = new UsuarioBo(conexao);
					
					//Listar os usuarios
					List<Usuario> listaSP = bo.listarSP();
					
					//Exibir os usuarios
					for (Usuario usuario : listaSP) {
						System.out.println(usuario.getCodigo() + " " + usuario.getNome() + " " + usuario.getEmail()
							+" "+ usuario.getSenha() +" "+ usuario.getAnsiedade());
					}
					
				} catch (Exception e) {
					System.out.println(e.getMessage()); 
				}
				
				break;
			
			case 7:
				
				try {
					//Obter a conexão
					Connection conexao = ConnectionFactory.getConnection();
					
					//Instanciar o UsuarioBo
					UsuarioBo bo = new UsuarioBo(conexao);
					
					//Ler o codigo para remover
					System.out.println("Digite o código");
					int codigo = leitor.nextInt();
					
					//Remover
					bo.remover(codigo);
					System.out.println("Usuario removido!");
					
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
