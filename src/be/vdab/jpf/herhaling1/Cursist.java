package be.vdab.jpf.herhaling1;

public class Cursist extends Persoon {

    String voornaam;
    String familienaam;
    Traject traject;

    public Cursist(String voornaam, String familienaam, Traject traject) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.traject = traject;
    }

    @Override
    public String toString() {
        return  voornaam + " " + familienaam + " volgt " + traject;
    }
}
