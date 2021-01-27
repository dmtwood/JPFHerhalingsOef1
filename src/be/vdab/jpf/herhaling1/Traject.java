package be.vdab.jpf.herhaling1;

public class Traject {

    String cursusnaam;

    public Traject(String cursus) {
        this.cursusnaam = cursus;
    }

    @Override
    public String toString() {
        return cursusnaam;
    }
}
