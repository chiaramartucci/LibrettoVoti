package it.polito.tdp.librettovoti.model;

import java.time.*;

public class Voto {

	// pojo - Plain Old Java Object
	// una semplice classe che contiene i dati, non ha logica
	
	private String nomeCorso;
	private int voto; // 30L come lo rappresento?
	private LocalDate dataEsame; // data superamento esame
	
	// COSTRUTTORE
	public Voto(String nomeCorso, int voto, LocalDate dataEsame) {
		this.nomeCorso = nomeCorso;
		this.voto = voto;
		this.dataEsame = dataEsame;
	}
	
	// GETTER e SETTER
	public String getNomeCorso() {
		return nomeCorso;
	}

	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public LocalDate getDataEsame() {
		return dataEsame;
	}

	public void setDataEsame(LocalDate dataEsame) {
		this.dataEsame = dataEsame;
	}

	@Override
	public String toString() {
		return "Esame "+ nomeCorso + " superato con " + voto + " il " + dataEsame;
	}

	 
	
	
	

	
	
}
