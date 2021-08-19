package be.vdab.jpf.herhaling1.politiek;

import be.vdab.jpf.herhaling1.personen.Persoon;

public class Politieker extends Persoon {

    PolitiekePartij politiekePartij;

    public Politieker(String voornaam, String familienaam, PolitiekePartij politiekePartij) {
        super(voornaam, familienaam);
        this.politiekePartij = politiekePartij;
    }

    @Override
    public String toString() {
        return super.toString() + "\npartij: " + politiekePartij.getNaam() + "\naantal leden: " + politiekePartij.getAantalLeden();

    }

    public static void main(String[] args) {
        Politieker politieker = new Politieker("Pol", "Pot", new PolitiekePartij("Potters FC", 7));
        System.out.println(politieker);
    }
}



/*

Je erft van de class Persoon een class Politieker.
Deze heeft een extra eigenschap van het type PolitiekePartij.
 */