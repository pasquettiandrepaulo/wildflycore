package br.com.wildflycore.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.wildflycore.entidades.Tarefa;
import br.com.wildflycore.interfaces.service.TarefaInterfaceService;

@RequestScoped
@Named("controlerMB")
public class ControlerMB implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private TarefaInterfaceService tarefaService;
	
	private Tarefa tarefa;
	
	private List<Tarefa> listaTarefa;

	public void salvar() {

		this.tarefaService.persistir(this.tarefa);
		this.refreschList();
	}
	
	public void deletar(Tarefa tarefa) {
		
		this.tarefaService.deletar(tarefa);
		this.refreschList();
	}
	
	public void refreschList() {
		this.listaTarefa = this.tarefaService.getList();
	}
	
	@PostConstruct
	public void init() {
		
		this.tarefa = new Tarefa();
		this.refreschList();
	}

	public Tarefa getTarefa() {
		return tarefa;
	}
	
	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}
	
	public List<Tarefa> getListaTarefa() {
		return listaTarefa;
	}

	public void setListaTarefa(List<Tarefa> listaTarefa) {
		this.listaTarefa = listaTarefa;
	}
}
