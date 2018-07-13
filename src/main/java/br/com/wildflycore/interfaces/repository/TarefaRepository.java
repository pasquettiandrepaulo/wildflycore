package br.com.wildflycore.interfaces.repository;

import java.util.List;

import br.com.wildflycore.entidades.Tarefa;

public interface TarefaRepository {
	
	void persistir(Tarefa tarefa);
	
	void deletar(Tarefa tarefa);
	
	List<Tarefa> getList();
}
