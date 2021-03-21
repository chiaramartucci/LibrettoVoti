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
	
//	public void StampaVotiUguali (int punteggio) {
//		// il libretto stampa da solo i voti
//		 System.out.println();
//		
//		// metodo da pigri: l'altro metodo guarda più avanti
//	 }
	
//	public String votiUguali (int punteggio) {
//		// calcola una stringa che contiene i voti
//		// sarà poi il chiamante a stamparli
//		
//		// problema: stampare solo il nome del corso o anche il voto?
//		
//	 }
	
//	public List <Voto> listaVotiUguali (int punteggio){
//		// restituisce solo i voti uguali al criterio
//		// difetto: espone all'esterno il tipo di struttura dati
//		// che ho usato internamente
//		
//		ArrayList<Voto> risultato = new ArrayList<Voto>();
//		
//		for(Voto v: this.voti) {
//			if(v.getVoto()==punteggio) {
//				risultato.add(v);
//			}
//		}
//		
//		return risultato;
//	}
	
	public Libretto votiUguali (int punteggio) {
		// resttuisco un oggetto Libretto con voti solo uguali a punteggio
		// in questo modo ho tutti i metodi della classe Libretto
		// da poter applicare a quei corsi in cui ho punt 
		
		// non do all'esterno informazioni sulla struttura dati 
		// che ho usato internamente
		
		Libretto risultato = new Libretto(null);
		for(Voto v: this.voti) {
			if(v.getVoto()==punteggio) {
				risultato.add(v);
			}
		}
		
		return risultato;
		
	}

	@Override
	public String toString() {
		String s="";
		for(Voto v: this.voti) {
			s= s+ v.toString()+ "\n";
		}
		
		return s;
	}
	
	public Voto ricercaCorso (String nomeCorso) {
		Voto risultato = null;
		for( Voto v : this.voti) {
			if(v.getNomeCorso().equals(nomeCorso)) {
				risultato = v;
				break ;
			}
		}
		return risultato;
	}
	
}
