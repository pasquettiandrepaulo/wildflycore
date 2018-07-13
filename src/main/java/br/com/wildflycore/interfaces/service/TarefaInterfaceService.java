package br.com.wildflycore.interfaces.service;

import java.util.List;

import br.com.wildflycore.entidades.Tarefa;

public interface TarefaInterfaceService {
	
	void persistir(Tarefa tarefa);
	
	void deletar(Tarefa tarefa);
	
	List<Tarefa> getList();
}
