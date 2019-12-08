package com.duff.db.entity.template;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
//@Table(name="gruppo_elementi")
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE) 
//@DiscriminatorColumn(name="tipoHibernate", discriminatorType = DiscriminatorType.INTEGER, columnDefinition="int")
//@DiscriminatorValue("1")


//@Entity
//@DiscriminatorValue("2")
public class GruppoElemento implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id", unique=true, nullable=false, insertable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic
	private int id;
	
	@Column(name="id_gruppo", nullable = false)
	private int idGruppo;
	
	@Column(name="elemento", nullable = false)
	private Elemento elemento;
	
	@Column(name="x", nullable = false)
	private int x;
	
	@Column(name="y", nullable = false)
	private int y;
	
	@Column(name="w", nullable = false)
	private int width;
	
	@Column(name="h", nullable = false)
	private int heigth;

}
