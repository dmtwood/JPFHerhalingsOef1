package be.vdab.jpf.herhalingen.bedrijfkostenopbrengst;

import java.math.BigDecimal;

public class KostOpbrengstApp {

    public static void main(String[] args) {
        var kost1 = new Gebouw(BigDecimal.valueOf(1500));
        var kost2  = new Instructeur(BigDecimal.valueOf(3000), BigDecimal.valueOf(10), 1000);
        var kost3  = new Instructeur(BigDecimal.valueOf(3200), BigDecimal.valueOf(9), 1200);
        var kost4 =  new Gebouw(BigDecimal.valueOf(1200));
        var kost5 =  new Instructeur(BigDecimal.valueOf(3700), BigDecimal.valueOf(15), 1500);
        var kost6 =  new Instructeur(BigDecimal.valueOf(4100), BigDecimal.valueOf(12), 800);

        var kosten = new Kost[] { kost1, kost2, kost3, kost4, kost5, kost6 };
        var totaleKost = BigDecimal.ZERO;

        var opbrengsten = new Opbrengst[] { kost2, kost3, kost5, kost6 };
        var totaleOpbrengst = BigDecimal.ZERO;
        for (int i = 1; i < kosten.length; i++) {
            totaleKost = totaleKost.add(kosten[i].getKost() );
        }

        for (int i = 1; i < opbrengsten.length; i++) {
            totaleOpbrengst = totaleOpbrengst.add(opbrengsten[i].getOpbrengst());
        }


        System.out.println("Totale kost: " + totaleKost);
        System.out.println("Totale opbrengst: " + totaleOpbrengst);
        System.out.println("Resultaat: " + (totaleOpbrengst.subtract(totaleKost) ) );
    }
}
