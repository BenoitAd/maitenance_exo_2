package org.ss.orchestre.couplagefort;

public class Musicien {

    private Instrument instrument;
    private String morceau;

    public Musicien(Instrument instrument, String morceau) {
        this.instrument = instrument;
        this.morceau = morceau;
    }

    public Musicien() {

    }

    public void jouerMorceau() {
        instrument.afficher();
        System.out.println("et je joue le morceau " + morceau);
        instrument.jouer();
    }
}
