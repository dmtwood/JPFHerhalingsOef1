package be.vdab.jpf.herhaling1;

import java.math.BigDecimal;

public class KapitaliseerbareKasbon extends Kasbon {
    public KapitaliseerbareKasbon(BigDecimal beginwaarde, int jaar, BigDecimal intrest) {
        super(beginwaarde, jaar, intrest);

    }

    @Override
    BigDecimal getInterest() {
        // loop adding intrest of past years as capital
        for (int i=0; i<jaren; i++) {
            BigDecimal temp = intrest.multiply(beginwaarde);
            beginwaarde = beginwaarde.add(temp);
        }
        return beginwaarde;

        /*
        Oplossing cursus:
        @Override
             public BigDecimal getEindWaarde() {
             var totaleIntrest = BigDecimal.ZERO;
             for (var jaar = 0; jaar != jaren; jaar++) {
             totaleIntrest = totaleIntrest.add
             (beginWaarde.multiply(intrest)).add(totaleIntrest.multiply(intrest));
             }
             return beginWaarde.add(totaleIntrest);
             }
         */
    }
}
