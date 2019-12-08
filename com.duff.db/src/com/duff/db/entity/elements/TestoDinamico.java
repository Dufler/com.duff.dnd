package com.duff.db.entity.elements;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class TestoDinamico {
	
	@Id
	@Column(name="id", unique=true, nullable=false, insertable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic
	protected int id;
	
	@Column(name="id_font", nullable = false)
	protected int idFont;
	
	@Column(name="id_box")
	protected Integer idBox;
	
//	@Column(name="espressione", nullable = false)
//	protected String espressione;
	
	@Column(name="x", nullable = false)
	protected int x;
	
	@Column(name="y", nullable = false)
	protected int y;
	
	@Column(name="w", nullable = false)
	protected int width;
	
	@Column(name="h", nullable = false)
	protected int heigth;
	
	public TestoDinamico() {}

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
		TestoDinamico other = (TestoDinamico) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TestoDinamico [id=" + id + ", idFont=" + idFont + ", x=" + x + ", y=" + y + ", width=" + width + ", heigth=" + heigth + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

//	public String getEspressione() {
//		return espressione;
//	}
//
//	public void setEspressione(String espressione) {
//		this.espressione = espressione;
//	}

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
