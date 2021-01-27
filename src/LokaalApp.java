import be.vdab.jpf.herhaling1.Cursist;
import be.vdab.jpf.herhaling1.Lokaal;
import be.vdab.jpf.herhaling1.Trainer;
import be.vdab.jpf.herhaling1.Traject;

public class LokaalApp {

    public static void main(String[] args) {
        var traject1 = new Traject("java");
        var traject2 = new Traject(".net");
        var cursist1 = new Cursist("Felix", "De Vliegher", traject1);
        var cursist2 = new Cursist("Koen", "Vanhoutte", traject2);
        var cursist3 = new Cursist("Serge", "Vereecke", traject2);
        var cursist4 = new Cursist("Freddy", "Himpe", traject1);
        var trainer = new Trainer("Hans", "Desmet");
        var lokaal = new Lokaal(11, trainer);
        lokaal.cursistToevoegen(cursist1);
// een lokaal heeft een variabel aantal cursisten
        lokaal.cursistToevoegen(cursist2);
        lokaal.cursistToevoegen(cursist3);
        lokaal.cursistToevoegen(cursist4);
        System.out.println(lokaal);

    }
}
