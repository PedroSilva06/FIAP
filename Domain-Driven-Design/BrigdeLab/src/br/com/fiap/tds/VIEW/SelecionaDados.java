package br.com.fiap.tds.VIEW;

import br.com.fiap.tds.BEAN.*;
import br.com.fiap.tds.DAO.*;

public class SelecionaDados{
	public void exibirDados() {
		UsuarioDAO userDAO = new UsuarioDAO();
		
		//Executa Consulta no Banco de Dados
		for (Usuario user : userDAO.getUsuario()){
			//System.out.println("Testando");
			System.out.println("Usu�rio: " + user.getCd_usuario() + " - " +
					           "Nome :" + user.getNm_usuario() + " - " +
					           "Email: " + user.getDs_email() + " -" +
					           "Senha: " + user.getDs_senha() + " - " +
					           "G�nero: " + user.getDs_genero() + " - " +
					           "Nascimento: " + user.getDt_nascimento() );
		}
	}
}