package be.vdab.jpf.herhaling1.personen;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Personen implements Serializable {

    public static final long serialVersionUID = 1L;

    private final List<Persoon> personen = new ArrayList<>();

    public Personen() {

    }

    public void add(Persoon p) {
        personen.add(p);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (var persoon : personen) {
            stringBuilder.append(persoon);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}