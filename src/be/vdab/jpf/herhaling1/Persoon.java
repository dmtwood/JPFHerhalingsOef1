package be.vdab.jpf.herhaling1;

import java.io.Serializable;

public class Persoon implements Serializable, Comparable<Persoon> {

    public static final long serialVersionUID = 1L;
    protected final String voornaam;
    protected final String familienaam;

    public Persoon(String voornaam, String familienaam) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getFamilienaam() {
        return familienaam;
    }

    @Override
    public String toString() {
        return voornaam + ' ' + familienaam;
    }



    public static void main(String[] args) {
        Persoon persoon = new Persoon("TestVoor", "TestAchter");
        System.out.println("Volledige naam: " + persoon.toString());
    }

    @Override
    public int compareTo(Persoon anderPersoon) {

        var famNaamVgl = familienaam.compareTo(anderPersoon.familienaam);

        if (famNaamVgl == 0)
            return voornaam.compareTo(anderPersoon.voornaam);

        return famNaamVgl;
    }
    /*

    Persoon
Je maakt een class Persoon met twee eigenschappen:
voornaam en familienaam.
Je kan deze eigenschappen aan de constructor meegeven.
De class bevat een method getNaam.
Deze geeft een String terug met de volledige naam ( = voornaam + spatie + familienaam)
Probeer dit uit in een class met een public static void main(String[] args).

     */

    /*
    Je overridet in de class Persoon de method toString(). Die geeft de volledige naam van de persoon
terug, gevolgd door de naam van zijn partij, gevolgd door het aantal leden van die partij.
Probeer dit uit in een class met een public static void main(String[] args).

     */


    /* BIS
Je maakt de nodige classes zodat volgende code
var personen = new Personen();
personen.add(new Persoon("Joe", "Dalton"));
personen.add(new Persoon("Sarah", "Bernhardt"));
var manager = new PersoonManager();
manager.save(personen); // slaat op in een bestand op de harde schijf
Personen personen2 = manager.load(); // leest de data van het bestand terug
System.out.println(personen2);
volgende output geeft:
Joe Dalton
Sarah Bernhardt
 */
}
