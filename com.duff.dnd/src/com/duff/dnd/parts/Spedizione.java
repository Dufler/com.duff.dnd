package com.duff.dnd.parts;

import java.util.Date;

public class Spedizione {

	private int colli;
	private int pezzi;
	private double peso;
	private double volume;
	private boolean contrassegno;
	private Date dataPartenza;

	public Spedizione(int colli, int pezzi, double peso, double volume, boolean contrassegno, Date dataPartenza) {
		super();
		this.colli = colli;
		this.pezzi = pezzi;
		this.peso = peso;
		this.volume = volume;
		this.contrassegno = contrassegno;
		this.dataPartenza = dataPartenza;
	}

	public int getColli() {
		return colli;
	}

	public void setColli(int colli) {
		this.colli = colli;
	}

	public int getPezzi() {
		return pezzi;
	}

	public void setPezzi(int pezzi) {
		this.pezzi = pezzi;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public boolean isContrassegno() {
		return contrassegno;
	}

	public void setContrassegno(boolean contrassegno) {
		this.contrassegno = contrassegno;
	}

	public Date getDataPartenza() {
		return dataPartenza;
	}

	public void setDataPartenza(Date dataPartenza) {
		this.dataPartenza = dataPartenza;
	}

}
