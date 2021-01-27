package be.vdab.jpf.herhaling1;

import java.math.BigDecimal;

public class Gebouw implements Kost {
    BigDecimal huurprijs;

    public Gebouw(BigDecimal huurprijs) {
        this.huurprijs = huurprijs;
    }

    @Override
    public BigDecimal getKost() {
        return huurprijs;
    }
}
