package be.vdab.jpf.herhalingen.cursuslokalen;

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
