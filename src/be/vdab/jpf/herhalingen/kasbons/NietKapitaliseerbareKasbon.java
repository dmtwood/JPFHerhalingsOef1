package be.vdab.jpf.herhalingen.kasbons;

import java.math.BigDecimal;

public class NietKapitaliseerbareKasbon extends Kasbon {
    public NietKapitaliseerbareKasbon(BigDecimal beginwaarde, int jaren, BigDecimal intrest) {
        super(beginwaarde, jaren, intrest);
    }

    @Override
    BigDecimal getInterest() {
        return beginwaarde.multiply(intrest).multiply(BigDecimal.valueOf(jaren)).add(beginwaarde);
    }
}
