package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.tds.to.ChurrosTO;

public interface ChurrosDao {
	
	void cadastrar(ChurrosTO churros);
	
	List<ChurrosTO> listar();

	ChurrosTO buscarPorCodigo(int codigo);

	void atualizar(ChurrosTO churros);
	
	void remover(int codigo);
}