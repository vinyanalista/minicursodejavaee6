package br.com.vinyanalista.agenda.modelo;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Categoria implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String nome;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Categoria)
			return ((Categoria) obj).id == this.id;
		else
			return false;
	}

	@Override
	public String toString() {
		return nome;
	}
	
}