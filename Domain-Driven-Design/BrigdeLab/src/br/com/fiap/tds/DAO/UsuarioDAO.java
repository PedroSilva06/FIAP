package br.com.fiap.tds.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.fiap.tds.BEAN.*;
import br.com.fiap.tds.FACTORY.*;

public class UsuarioDAO {
	//Cria Objetos para Conexão e Manipulação de Dados Retornados do Banco
	private Connection conn = null;
	private PreparedStatement pstm = null;
	private ResultSet rst = null;
	
	//Método para Pesquisar Dados
	public List<Usuario> getUsuario(){
		//Cria Lista com Base na Classe da Estrutura de Dados, conforme Tabela no Banco
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		try{
			//Estabelece conexão com o Banco
			conn = ConexaoBDOracle.createConnBD();
			
			//Montra string SQL para Pesquisa no Banco
			String strSQL = "SELECT * FROM T_BLR_USUARIO ORDER BY CD_USUARIO";
			
			//Executa a Query no Banco
			pstm = conn.prepareStatement(strSQL);
			
			//Armazena Retorno da Query em Formato de "Array" para Leitura de Dados
			rst  = pstm.executeQuery();
			
			//Percorre Loop com os Dados, conforme Retorno do Banco
			while (rst.next()){
				//Cria objeto com Dados do Cadastro, para exibição.
				Usuario usuario = new Usuario();
				
				//Seta os Campos no Objeto Criado, pegando os Gets do Retorno dos Dados
				usuario.setCd_usuario(rst.getInt("CD_USUARIO"));
				usuario.setNm_usuario(rst.getString("NM_USUARIO"));
				usuario.setDs_email(rst.getString("DS_EMAIL"));
				usuario.setDs_senha(rst.getString("DS_SENHA"));
				usuario.setDs_genero(rst.getString("DS_GENERO"));
				usuario.setDt_nascimento(rst.getDate("DT_NASCIMENTO"));
				
				//Adiciona Objeto com Dados do Cadastro na Lista
				usuarios.add(usuario);
			}
		} catch (Exception e){
			System.out.println("Erro ao Pesquisar Dados - Erro: " + e.getMessage());
		}
		//Retorna Lista com Dados do Cadastro
		return usuarios;
	}
	
	//Método para Incluir Dados
	public void incluirUsuario(Usuario usuario){
		try{
			try {
				//Estabelece conexão com o Banco
				conn = ConexaoBDOracle.createConnBD();
			} catch (Exception e) {
				System.out.println("Erro ao Conectar BD - Erro:\n"+e.getMessage());
			}
			
			//Montra String com os "Inserts" para Inclusão no Banco
			String strSQL = "insert into t_blr_usuario (cd_usuario, nm_usuario, ds_email, ds_senha, ds_genero, dt_nascimento) values(?,?,?,?,?,?)";
			
			//Passa o string SQL para preparar Execução no Banco
			pstm = conn.prepareStatement(strSQL);

			//Seta os Campos para atualizar no Banco, conforme o que foi passado no Objeto ( contribuinte )
			pstm.setInt(1, usuario.getCd_usuario());
			pstm.setString(2, usuario.getNm_usuario());
			pstm.setString(3, usuario.getDs_email());
			pstm.setString(4, usuario.getDs_senha());
			pstm.setString(5, usuario.getDs_genero());
			pstm.setDate(6, new Date(usuario.getDt_nascimento().getTime()));
			
			//Executa o Comando, atualizando os dados no Banco
			pstm.execute();
	    } catch (SQLException ex) {
	       System.out.println("Erro ao Incluir Dados - Erro:\n"+ex.getMessage());
	    }
	}
}
