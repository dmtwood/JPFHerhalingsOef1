package be.vdab.jpf.herhaling1;

public class Persoon {

    protected final String voornaam;
    protected final String familienaam;

    public Persoon(String voornaam, String familienaam) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
    }

    @Override
    public String toString() {
        return "Naam: " +  voornaam + ' ' + familienaam;
    }



    public static void main(String[] args) {
        Persoon persoon = new Persoon("TestVoor", "TestAchter");
        System.out.println("Volledige naam: " + persoon.toString());
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
}
