package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;

import no.hvl.dat100.jplab12.oppgave1.*;

public class Blogg {

	
	private Innlegg[] tabell;
	private int nesteLedige;

	public Blogg() {
		tabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		tabell = new Innlegg[lengde];
		nesteLedige = 0;
	}

	public int getAntall() {
		return nesteLedige;
	}
	

	
	public Innlegg[] getSamling() {
		Innlegg[] samling = new Innlegg[tabell.length];
		return samling;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		for (int i = 0; i < nesteLedige; i++) {
			if (innlegg==tabell[i]) {
				return i;
			}
			}
				return -1;
		}

	public boolean finnes(Innlegg innlegg) {
		boolean funnet = false;
		
		if (finnInnlegg(innlegg) >= 0) {
			funnet = true;
		}
		return funnet;
	}

	public boolean ledigPlass() {
		boolean ledig = false;
		if (nesteLedige < tabell.length) {
			ledig = true;
		}
        return ledig;
	}
	
	public boolean leggTil(Innlegg innlegg) {
        boolean LagtTil = false;
		if (ledigPlass() && !finnes(innlegg)) {
			tabell[nesteLedige] = innlegg;
			nesteLedige++;
			LagtTil = true;
		} 
		return LagtTil;
		
	}
	
	public String toString() {
		String a = getAntall() + "\n";
		
		for (int i = 0; i < tabell.length; i++) {
			a += tabell[i].toString();
		}
		return a;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}