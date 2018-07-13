package br.com.wildflycore.implementacao.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import br.com.wildflycore.entidades.Tarefa;
import br.com.wildflycore.interfaces.repository.TarefaRepository;
import br.com.wildflycore.interfaces.service.TarefaInterfaceService;

@Stateless
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class TarefaImplementacaoService implements TarefaInterfaceService {
	
	@Inject
	private TarefaRepository tarefaRepository;
	
	@Override
	public void persistir(Tarefa tarefa) {
		
		this.tarefaRepository.persistir(tarefa);
	}

	@Override
	public List<Tarefa> getList() {
		
		return this.tarefaRepository.getList();
	}

	@Override
	public void deletar(Tarefa tarefa) {
		
		this.tarefaRepository.deletar(tarefa);
	}
}
