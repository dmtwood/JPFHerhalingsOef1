package be.vdab.jpf.herhalingen.kasbons;

import java.math.BigDecimal;

abstract class Kasbon {
    BigDecimal beginwaarde, intrest;
    int jaren;

    public Kasbon(BigDecimal beginwaarde, int jaren, BigDecimal intrest) {
        this.beginwaarde = beginwaarde;
        this.intrest = intrest;
        this.jaren = jaren;
    }

    abstract BigDecimal getInterest();

}
