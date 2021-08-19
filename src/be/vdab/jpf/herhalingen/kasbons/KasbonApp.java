package be.vdab.jpf.herhalingen.kasbons;

import java.math.BigDecimal;

public class KasbonApp {
    public static void main(String[] args) {
        var klant = new Klant();
        klant.add(
                new NietKapitaliseerbareKasbon(BigDecimal.valueOf(100), 2,
                        BigDecimal.valueOf(0.05)));
        klant.add(
                new KapitaliseerbareKasbon(BigDecimal.valueOf(100), 2,
                        BigDecimal.valueOf(0.05)));
        System.out.println(klant.getEindWaarde());
    }

}

/*
Kasbons
Je maakt de nodige classes zodat volgende code de output 220.2500 geeft.
Een niet-kapitaliseerbare kasbon heeft drie eigenschappen: beginwaarde, jaren en intrest.
Bij zo’n kasbon brengt ieder jaar intrest op als beginwaarde * intrest.
Een kapitaliseerbare kasbon heeft dezelfde eigenschappen.
Bij zo’n kasbon brengt ieder jaar intrest op als beginwaarde * intrest + intrestVorigejaren * intrest
var klant = new Klant();
klant.add(
 new NietKapitaliseerbareKasbon(BigDecimal.valueOf(100), 2,
 BigDecimal.valueOf(0.05)));
klant.add(
 new KapitaliseerbareKasbon(BigDecimal.valueOf(100), 2,
 BigDecimal.valueOf(0.05)));
System.out.println(klant.getEindWaarde());

 */
