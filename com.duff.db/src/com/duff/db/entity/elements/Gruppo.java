package com.duff.db.entity.elements;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Gruppo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id", unique=true, nullable=false, insertable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic
	private int id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="descrizione")
	private String descrizione;
	
	public Gruppo() {}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gruppo other = (Gruppo) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Gruppo [id=" + id + ", nome=" + nome + ", descrizione=" + descrizione + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}
