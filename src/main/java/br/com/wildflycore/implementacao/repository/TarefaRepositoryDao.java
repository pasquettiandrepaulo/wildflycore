package br.com.wildflycore.implementacao.repository;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.wildflycore.entidades.Tarefa;
import br.com.wildflycore.interfaces.repository.TarefaRepository;

@Stateless
public class TarefaRepositoryDao implements TarefaRepository{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void persistir(Tarefa tarefa) {
		
		this.em.persist(tarefa);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Tarefa> getList() {
		
		Query query = this.em.createQuery("FROM Tarefa");
		return query.getResultList();
	}

	@Override
	public void deletar(Tarefa tarefa) {
		
		this.em.remove(em.find(Tarefa.class, tarefa.getId()));
	}
}
