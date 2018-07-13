package br.com.wildflycore.entidades;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Tarefa
 *
 */
@Entity
public class Tarefa implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@SequenceGenerator(name = "seqtarefa", sequenceName = "seqtarefa", allocationSize = 1, initialValue = 1)
	@GeneratedValue(generator = "seqtarefa", strategy = GenerationType.SEQUENCE)
	private Integer id;

	@Column(name = "descricao")
	private String descricao;

	@Column(name = "info")
	private String info;

	@Column(name = "completa")
	private boolean completa;

	public Tarefa() {
		super();
	}
	
	public Tarefa(String descricao, String info, boolean completa) {
		super();
		this.descricao = descricao;
		this.info = info;
		this.completa = completa;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public boolean getCompleta() {
		return this.completa;
	}

	public void setCompleta(boolean completa) {
		this.completa = completa;
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			
			return true;
		
		if (obj == null)
			
			return false;

		Tarefa other = (Tarefa) obj;
		
		if (!id.equals(other.id))
			
			return false;
		
		return true;
	}
}
