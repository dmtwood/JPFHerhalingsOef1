package be.vdab.jpf.herhalingen.personen;

import be.vdab.jpf.herhalingen.personen.Persoon;

import java.util.TreeSet;

public class SorteerApp {

    public static void main(String[] args) {

        // treeset keeps members in their natural order > implement Persoon.compareTo() to customize
    var personen = new TreeSet<Persoon>();
    personen.add(new Persoon("Joe", "Dalton"));
    personen.add(new Persoon("Joe", "Dalton"));
    personen.add(new Persoon("Joe", "Dalton"));

    personen.add(new Persoon("Jack", "Dalton"));
    personen.add(new Persoon("Averell", "Dalton"));
    personen.add(new Persoon("Don", "Dalton"));
    personen.add(new Persoon("Sarah", "Bernhardt"));

for (Persoon persoon : personen)
        System.out.println(persoon);
        System.out.println("\n");
    }
    /*
    Sorteren
Je maakt een verzameling unieke personen. Je toont deze verzameling gesorteerd op familienaam.
Je sorteert daarbij twee personen met dezelfde familienaam op voornaam.
     */
}
