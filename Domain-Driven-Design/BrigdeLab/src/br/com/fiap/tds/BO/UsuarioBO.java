package br.com.fiap.tds.BO;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import br.com.fiap.tds.BEAN.Usuario;
import br.com.fiap.tds.DAO.UsuarioDAO;
import br.com.fiap.tds.VIEW.*;

public class UsuarioBO {
	public static void main(String[] args) {
		System.out.println( "Testando BD - Java" );
		
		//Cria Objetos para Inser��o de Dados no Banco
		Usuario usuario = new Usuario();
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
        //Captura dados para Inclus�o no Banco
        Scanner leitor = new Scanner(System.in);
                
        System.out.print("Codigo Usuario: ");
        usuario.setCd_usuario(leitor.nextInt());    
        
        System.out.print("Nome Usu�rio: ");
        usuario.setNm_usuario(leitor.next() + leitor.nextLine()); 
        
        System.out.print("Email do Usu�rio: ");
        usuario.setDs_email(leitor.next());
        
        System.out.print("Senha do Usu�rio: ");
        usuario.setDs_senha(leitor.next());
        
        System.out.print("G�nero do Usu�rio: ");
        usuario.setDs_genero(leitor.next());
        
        //Habilitar para Campo Data
        try {
	        System.out.println("Data Nascimento: ");
	        String dataDigitada = leitor.next();
	        
	        DateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
	        Date dataCadastro;
	        dataCadastro = dataFormatada.parse(dataDigitada);
	        
			usuario.setDt_nascimento(dataCadastro);
		} catch (ParseException e) {
			e.printStackTrace();
		}
        
        //Inclui Dados no Banco
        usuarioDAO.incluirUsuario(usuario);
			
		//Cria Objetos para executar exibi��o dos Dados
		SelecionaDados selecionados = new SelecionaDados();
		selecionados.exibirDados();
	}
}
