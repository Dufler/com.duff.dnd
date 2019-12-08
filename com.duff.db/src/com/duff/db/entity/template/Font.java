package com.duff.db.entity.template;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Font implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id", unique=true, nullable=false, insertable=false)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic
	private int id;
	
	@Column(name="name", nullable = false)
	private String name;
	
	@Column(name="font", nullable = false)
	private String font;
	
	@Column(name="size", nullable = false)
	private int size;
	
	@Column(name="bold", nullable = false, columnDefinition = "integer")
	private boolean bold;
	
	@Column(name="italic", nullable = false, columnDefinition = "integer")
	private boolean italic;
	
	@Column(name="underlined", nullable = false, columnDefinition = "integer")
	private boolean underlined;
	
	@Column(name="strike_through", nullable = false, columnDefinition = "integer")
	private boolean strikeThrough;
	
	public Font() {}

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
		Font other = (Font) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Font [id=" + id + ", name=" + name + ", font=" + font + ", size=" + size + ", bold=" + bold
				+ ", italic=" + italic + ", underlined=" + underlined + ", strikeThrough=" + strikeThrough + "]";
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

	public String getFont() {
		return font;
	}

	public void setFont(String font) {
		this.font = font;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isBold() {
		return bold;
	}

	public void setBold(boolean bold) {
		this.bold = bold;
	}

	public boolean isItalic() {
		return italic;
	}

	public void setItalic(boolean italic) {
		this.italic = italic;
	}

	public boolean isUnderlined() {
		return underlined;
	}

	public void setUnderlined(boolean underlined) {
		this.underlined = underlined;
	}

	public boolean isStrikeThrough() {
		return strikeThrough;
	}

	public void setStrikeThrough(boolean strikeThrough) {
		this.strikeThrough = strikeThrough;
	}

}
