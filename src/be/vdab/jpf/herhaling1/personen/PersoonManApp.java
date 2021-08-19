package be.vdab.jpf.herhaling1.personen;

public class PersoonManApp {

    public static void main(String[] args) {

    var personen = new Personen();
    personen.add(new Persoon("Joe", "Dalton"));
    personen.add(new Persoon("Sarah", "Bernhardt"));
    var manager = new PersoonManager();
    manager.save(personen); // slaat op in een bestand op de harde schijf
    Personen personen2 = manager.load(); // leest de data van het bestand terug
    System.out.println(personen2);
    }
}
