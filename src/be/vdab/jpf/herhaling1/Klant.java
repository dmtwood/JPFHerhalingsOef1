package be.vdab.jpf.herhaling1;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Klant {
    List<Kasbon> kasbons = new ArrayList<>();

    public void add(Kasbon kasbon) {
        kasbons.add(kasbon);
    }

    public BigDecimal getEindWaarde() {
        var totaal = BigDecimal.ZERO;
        for (var kasbon : kasbons) totaal = totaal.add(kasbon.getInterest());
        return totaal;
    }
}
