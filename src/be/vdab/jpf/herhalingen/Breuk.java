package be.vdab.jpf.herhalingen;

import java.util.Scanner;

public class Breuk {
    double teller;
    double noemer;

    public Breuk() {
    }

    public Breuk(double teller, double noemer) {
        this.teller = teller;
        this.noemer = noemer;
    }

    public double getteller() {
        return teller;
    }

    public void setteller(double teller) {
        this.teller = teller;
    }

    public double getnoemer() {
        return noemer;
    }

    public void setnoemer(double noemer) {
        if (noemer == 0) throw new IllegalArgumentException("Een noemer van een breuk mag geen nul zijn.");
        this.noemer = noemer;
    }

    @Override
    public String toString() {
        return teller + "/" + noemer;
    }

    public static void main(String[] args) {

        Breuk breuk = new Breuk(1,1);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef een teller in");
        breuk.setteller(scanner.nextDouble());

        System.out.println("Geef een noemer in");
        breuk.setnoemer(scanner.nextDouble());

        System.out.println(breuk);
    }
}


/*
Je maakt een class breuk. Deze heeft als eigenschappen teller en noemer.
Je geeft deze eigenschappen mee aan de constructor.
Als de noemer 0 is, werp je een IllegalArgumentException.
De toString() method toont de teller, het teken / en de noemer.
Probeer dit uit in een class met een public static void main(String[] args)
waarin de gebruiker een teller en noemer tikt.
Je vangt de eventuele IllegalArgumentException op en toont dan een foutmelding.
 */