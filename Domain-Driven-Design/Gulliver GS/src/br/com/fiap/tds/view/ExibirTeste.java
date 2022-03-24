package br.com.fiap.tds.view;

import br.com.fiap.tds.bean.*;

import java.util.Scanner;

public class ExibirTeste {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		//Destino
		System.out.print("Digite as informacoes sobre o destino:");
		String informacoesDestino = leitor.next() + leitor.nextLine();
		
		System.out.println("Digite o idioma local:");
		String idioma = leitor.next();
		
		System.out.println("Digite os costumes locais:");
		String costumes = leitor.next() + leitor.nextLine();
		
		System.out.println("Digite a cotacao da moeda local:");
		float cotacao = leitor.nextFloat();
		
		System.out.println("Digite a moeda local:");
		String moeda = leitor.next();
		
		System.out.println("Digite os documentos necessarios:");
		String documentos = leitor.next() + leitor.nextLine();
		
		System.out.println("Digite o fuso horario:");
		int fuso = leitor.nextInt();
		
		System.out.println("Digite a voltagem das tomadas:");
		int tomadaVolt = leitor.nextInt();
		
		Destino destino1 = new Destino(informacoesDestino, idioma, costumes, cotacao, 
		moeda, documentos, fuso, tomadaVolt);
		
		String chamadaDestino = destino1.exibirInformacoesDestino();
		System.out.print(chamadaDestino);
		
		//Estabelecimentos
		System.out.print("Digite o nome do estabelecimento:");
		String nomeEstabelecimento = leitor.next() + leitor.nextLine();
		
		System.out.println ("Digite a localizacao:");
		String localizacao = leitor.next() + leitor.nextLine();
		
		System.out.println("Digite como chegar:");
		String caminho = leitor.next() + leitor.nextLine();
		
		System.out.println("Digite o horario de funcionamento:");
		float horarioFuncionamento = leitor.nextFloat();
		
		System.out.println("Digite o horario de pico:");
		int horarioPico = leitor.nextInt();
		
		System.out.println("Digite o preco dos servicos:");
		float valorPratos = leitor.nextFloat();
		
		System.out.println("Digite o site do estabelecimento:");
		String siteEstabelecimentos = leitor.next();
		
		System.out.println("Digite as musicas tocadas:");
		String musicas = leitor.next() + leitor.nextLine();
		
		Estabelecimentos estabelecimento1 = new Estabelecimentos(nomeEstabelecimento,
		localizacao, caminho, horarioFuncionamento, horarioPico, valorPratos, siteEstabelecimentos, 
		musicas);
		
		String chamadaEstabelecimentos = estabelecimento1.exibirInformacoesEstabelecimentos();
		System.out.print(chamadaEstabelecimentos);
		
		//Dicas
		System.out.print("Digite as informacoes sobre as vestimentas:");
		String vestimentas = leitor.next() + leitor.nextLine();

		System.out.println("Digite uma sugestao de destino:");
		String sugestaoDestino = leitor.next() + leitor.nextLine();

		System.out.println("Digite a melhor epoca do ano para viajar: ");
		String epocaAno = leitor.next() + leitor.nextLine();

		System.out.println("Digite uma sugestão de hospedagem: ");
		String hospedagem = leitor.next() + leitor.nextLine();

		System.out.println("Digite o meio de locomocao da regiâo: ");
		String locomocao = leitor.next() + leitor.nextLine();
		
		Dicas dica1 = new Dicas(vestimentas, sugestaoDestino, epocaAno, 
		hospedagem, locomocao);
		
		String chamadaDicas = dica1.exibirInformacoesDicas();
		System.out.print(chamadaDicas);
		
		//ADM
		System.out.print("Digite o nome do administrador:");
        String nomeADM = leitor.next() + leitor.nextLine(); 

        System.out.print("Digite o email do administrador:");
        String emailADM = leitor.next() + leitor.nextLine();
        
        Administrador ADM1 = new Administrador(nomeADM, emailADM);
        
        String chamadaADM = ADM1.exibirInformacoesAdministrador();
        System.out.print(chamadaADM);
		
        //Usuario
        System.out.print("Digite o código do usuário: ");
        String codigoUsuario = leitor.next() + leitor.nextLine();

        System.out.print("Digite o e-mail: ");
        String emailUsuario = leitor.next() + leitor.nextLine();

        System.out.print("Digite a senha: ");
        String senha = leitor.next() + leitor.nextLine();

        System.out.print("Digite o estado do login: ");
        boolean estadLogin = leitor.nextBoolean();

        System.out.print("Digite a data do cadastro: ");
        String dataCadastro = leitor.next() + leitor.nextLine();

        System.out.print("Digite o destino: ");
        String destino = leitor.next() + leitor.nextLine();

        System.out.print("Digite o número do seu telefone: ");
        String telefone = leitor.next() + leitor.nextLine();

        System.out.print("Digite o genêro: ");
        boolean genero = leitor.nextBoolean();
        
        Usuario usuario1 = new Usuario(codigoUsuario, emailUsuario, senha, estadLogin, dataCadastro, destino, telefone, genero);
        
        String chamadaUsuario = usuario1.exibirInformacoesUsuario();
        System.out.print(chamadaUsuario);
        
        //Pagina Principal
        System.out.print("Digite as informaçõs da página principal:");
        String informacoesPP = leitor.next() + leitor.nextLine();
        
        PaginaPrincipal PP1 = new PaginaPrincipal(informacoesPP);
        
        String chamadaPaginaPrincipal = PP1.exibirInformacoesPaginaPrincipal();
        System.out.print(chamadaPaginaPrincipal);
        
        leitor.close();
	}
}
