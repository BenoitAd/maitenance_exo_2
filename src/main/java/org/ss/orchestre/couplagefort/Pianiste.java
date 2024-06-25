package org.ss.orchestre.couplagefort;
public class Pianiste extends Musicien {
	
	private Piano piano;
	private String morceau;
	
	public Pianiste( String morceau) {
		super();
		this.piano = new Piano();
		this.morceau = morceau;
	}
	
	public void jouerMorceau() {
		piano.afficher();
		System.out.println("et je joue le morceau " + morceau);
		piano.jouer();
	}
}
