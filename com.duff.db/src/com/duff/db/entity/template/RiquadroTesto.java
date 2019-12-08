package com.duff.db.entity.template;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class RiquadroTesto implements Serializable {
	
	public enum StileLinea { Solid, Dashed, Dotted, Double }
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id", unique=true, nullable=false, insertable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic
	private int id;
	
	@Column(name="name", nullable = false)
	private String name;
	
	@Column(name="padding", nullable = false)
	private int padding;
	
	@Column(name="line_width", nullable = false)
	private double lineWidth;
	
	@Column(name="line_style", nullable = false)
	@Enumerated(EnumType.STRING)
	private StileLinea lineStyle;
	
	@Column(name="line_color", nullable = false)
	private String lineColor;
	
	public RiquadroTesto() {}

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
		RiquadroTesto other = (RiquadroTesto) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "RiquadroTesto [id=" + id + ", name=" + name + ", padding=" + padding + ", lineWidth=" + lineWidth
				+ ", lineStyle=" + lineStyle + ", lineColor=" + lineColor + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPadding() {
		return padding;
	}

	public void setPadding(int padding) {
		this.padding = padding;
	}

	public double getLineWidth() {
		return lineWidth;
	}

	public void setLineWidth(double lineWidth) {
		this.lineWidth = lineWidth;
	}

	public StileLinea getLineStyle() {
		return lineStyle;
	}

	public void setLineStyle(StileLinea lineStyle) {
		this.lineStyle = lineStyle;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

}
