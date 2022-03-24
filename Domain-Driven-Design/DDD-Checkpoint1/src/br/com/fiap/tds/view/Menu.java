package br.com.fiap.tds.view;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import br.com.fiap.tds.bean.Produto;

/**
 * Classe que manipula produtos
 * @author FBVM
 * @version 1.0
 */
public class Menu{
	
	public static void main(String[] args) {
		//Objeto para ler os dados inseridos pelo usuário
		Scanner leitor = new Scanner(System.in);
		//Variável que armazena a escolha do usuário
		int opcao;
		
		//Variável para armazenar as siglas e os DDDs (Mapa -> chave - código, valor - Produto)
		Map<Integer, Set<Produto>> mapa = new HashMap<Integer, Set<Produto>>();
		
		
		//Laço de repetição
		do {
			//Exibir o menu e ler a opção escolhida
			System.out.println("Escolha: \n1-Adicionar \n2-Consultar por código \n3-Consultar por nome"
					+ " \n4-Listar \n5-Remover \n6-Editar \n7-Sair");
			
			//Criar um Set para armazenar produtos
			Set<Produto> produtos = new HashSet<Produto>();
			
			opcao =  leitor.nextInt();
			switch (opcao) {
			case 1:
				
            	//Ler o codigo
            	System.out.println("Digite um código do produto:");
                int codigo = leitor.nextInt();
                if (mapa.containsKey(codigo)) {
                	do {
                		System.out.println("Digite um código válido do produto:");
                		codigo = leitor.nextInt();
                		} while(mapa.containsKey(codigo));
                }
                
                //Ler o Produto
                System.out.println("Digite o nome:");
                String nome = leitor.next();
                System.out.println("Digite a qtd do produto:");
                int qtd = leitor.nextInt();
                System.out.println("Digite o preco:");
                Double preco = leitor.nextDouble();
                
                Produto produto = new Produto(nome, qtd, preco);
                produtos.add(produto);
                
                //Adicionar o mapeamento no mapa
                mapa.put(codigo, produtos);
                break; 
                
			case 2:
				//Ler o código
				System.out.println("Digite código: ");
				codigo = leitor.nextInt();

				//Verifica se o produto possui a código
				if (mapa.containsKey(codigo)) {
					//Pesquisar os produtos por código
					produtos = mapa.get(codigo);
					
					//Exibir o nome, quantidade e preço do produto 
					for (Produto item : produtos) {
						System.out.println(item);						
					}
				} else {
					System.out.println("O código: " + codigo + " não possui produto cadastrado!");
				}
				break;
				
			case 3:
				//PROFESSOR NÃO SOUBEMOS ACESSAR OS VALUES DENTRO DOS ATRIBUTOS
				//System.out.println("Digite o nome do produto:");
				/*nome = leitor.next();
				
				Object[] array = produtos.toArray();
				System.out.println(array);
				
				System.out.println(mapa.values());
				
				Set<Integer> codigos = mapa.keySet();

				produtos = mapa.get(nome);
				produtos.size();
				

				for (Integer item : codigos) {
					System.out.println(item + " " + mapa.get(item));
				}
				for (i : produtos.size()) {
					System.out.println(produtos[i]);
				};
				
				
				/*for (int codigos : mapa.keySet()) {
	                    
						produtos = mapa.get(codigos);
	                    Set<Produto> value = new HashSet<>();
	                    value = mapa.containsValues();
	                    System.out.println(codigo + " " + value);
	                }

				 /*
				 for (int i = 0; i < mapa.size(); i++) {
	                    if (mapa.get(i)) {
	                    }
	                }
	                
	               /* //Exibir a chave (codigo) e os valores (produto)
	                for (String produto : codigo) {
	                    System.out.println(produto + " " + mapa.get(produto));
	                }*/
				break;
				
			case 4:
				
				//Exibir todos os produtos
				Set<Integer> codigos = mapa.keySet();
				for (Integer item : codigos) {
					System.out.println(item + " " + mapa.get(item));
				}
				break;
		
			case 5:
				// Remove o produto especificado da lista
				System.out.println("Digite o codigo do produto:");
                codigo = leitor.nextInt();
                if (mapa.containsKey(codigo)) {
                    mapa.remove(codigo);
                    System.out.println("Item apagado com sucesso!");
                } else {
                    System.out.println("O produto nao foi cadastrado!");
                }
				break;
				
			case 6:
				// Permite a edição do nome, quantidade e preço do produto desejado
				System.out.println("Digite um código do produto:");
                codigo = leitor.nextInt();
                do {
	                if (mapa.containsKey(codigo)) {
	    				System.out.println("Digite as informações atualizadas");
		                System.out.println("Digite o nome:");
		                nome = leitor.next();
		                System.out.println("Digite a quantidade do produto:");
		                qtd = leitor.nextInt();
		                System.out.println("Digite o preco:");
		                preco = leitor.nextDouble();                
		                produto = new Produto(nome, qtd, preco);
		                produtos.add(produto);
		                mapa.put(codigo, produtos);	
		                break;
	                } else {                
	                	do {
	                	System.out.println("Digite um código válido do produto:");
	            		codigo = leitor.nextInt();
	            		} while(mapa.containsKey(codigo) != true);
	                }
                } while(true);
                break;
			case 7:
				// Finaliza o sistema
				System.out.println("Finalizando o sistema");
				break;
			default:
				System.out.println("Opção inválida");
			}
		} while (opcao !=7);
		leitor.close();
	}//main
}//class