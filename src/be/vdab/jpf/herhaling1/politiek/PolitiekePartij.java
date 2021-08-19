package be.vdab.jpf.herhaling1.politiek;

public class PolitiekePartij  {


    private String naam;

    private int aantalLeden;


    public PolitiekePartij(String naam, int aantalLeden) {
        this.naam = naam;
        this.aantalLeden = aantalLeden;
    }

    public String getNaam() {
        return naam;
    }

    public int getAantalLeden() {
        return aantalLeden;
    }
}

/*
PolitiekePartij – Politieker
Je maakt een class PolitiekePartij. Deze heeft twee eigenschappen: naam en aantal leden.
Je geeft deze mee aan de constructor.
 */