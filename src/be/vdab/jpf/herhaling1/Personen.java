package be.vdab.jpf.herhaling1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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