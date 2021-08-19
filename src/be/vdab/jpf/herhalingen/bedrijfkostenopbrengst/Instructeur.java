package be.vdab.jpf.herhalingen.bedrijfkostenopbrengst;

import be.vdab.jpf.herhalingen.bedrijfkostenopbrengst.Kost;
import be.vdab.jpf.herhalingen.bedrijfkostenopbrengst.Opbrengst;

import java.math.BigDecimal;

public class Instructeur implements Kost, Opbrengst {

    BigDecimal maandwedde;

    BigDecimal uurPrijsPerLes;

    int aantalUrenLesAanWerknemers;

    public Instructeur(BigDecimal maandwedde, BigDecimal uurPrijsPerLes, int aantalUrenLesAanWerknemers) {
        this.maandwedde = maandwedde;
        this.uurPrijsPerLes = uurPrijsPerLes;
        this.aantalUrenLesAanWerknemers = aantalUrenLesAanWerknemers;
    }

    @Override
    public BigDecimal getKost() {
        return maandwedde;
    }

    @Override
    public BigDecimal getOpbrengst() {
        return uurPrijsPerLes.multiply(BigDecimal.valueOf(aantalUrenLesAanWerknemers));
    }
}
