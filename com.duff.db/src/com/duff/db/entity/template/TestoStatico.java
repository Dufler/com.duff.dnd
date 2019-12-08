package com.duff.db.entity.template;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gruppo_testo_statico")
public class TestoStatico implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id", unique=true, nullable=false, insertable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic
	private int id;
	
	@Column(name="id_gruppo", nullable = false)
	private int idGruppo;
	
	@Column(name="id_font", nullable = false)
	private int idFont;
	
	@Column(name="id_box")
	private Integer idBox;
	
	@Column(name="testo", nullable = false)
	private String testo;
	
	@Column(name="x", nullable = false)
	private int x;
	
	@Column(name="y", nullable = false)
	private int y;
	
	@Column(name="w", nullable = false)
	private int width;
	
	@Column(name="h", nullable = false)
	private int heigth;
	
	public TestoStatico() {}

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
		TestoStatico other = (TestoStatico) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TestoStatico [id=" + id + ", idGruppo=" + idGruppo + ", idFont=" + idFont + ", testo=" + testo + ", x="
				+ x + ", y=" + y + ", width=" + width + ", heigth=" + heigth + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdGruppo() {
		return idGruppo;
	}

	public void setIdGruppo(int idGruppo) {
		this.idGruppo = idGruppo;
	}

	public int getIdFont() {
		return idFont;
	}

	public void setIdFont(int idFont) {
		this.idFont = idFont;
	}

	public Integer getIdBox() {
		return idBox;
	}

	public void setIdBox(Integer idBox) {
		this.idBox = idBox;
	}

	public String getTesto() {
		return testo;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

}
