package it.polito.tdp.librettovoti.model;

import java.util.*;

public class Libretto {

	// contiene un elenco di oggetti di classe Voto
	
	private List <Voto> voti;

	public Libretto(ArrayList<Voto> voti) {
		this.voti = new ArrayList<>();
	}
	
	public void add (Voto v) {
		this.voti.add(v);
	}

	@Override
	public String toString() {
		String s="";
		for(Voto v: this.voti) {
			s= s+ v.toString()+ "\n";
		}
		
		return s;
	}
	
	
}
