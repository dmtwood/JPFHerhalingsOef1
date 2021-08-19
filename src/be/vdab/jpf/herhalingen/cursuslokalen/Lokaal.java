package be.vdab.jpf.herhalingen.cursuslokalen;

import be.vdab.jpf.herhalingen.personen.Cursist;

import java.util.HashSet;
import java.util.Set;

public class Lokaal {
    int lokaalNr;
    Trainer trainer;
    Set<Cursist> cursisten;
    public Lokaal(int lokaalNr, Trainer trainer) {
    this.lokaalNr = lokaalNr;
        this.trainer = trainer;
        cursisten = new HashSet<>();
    }

    public void cursistToevoegen(Cursist cursist) {
        cursisten.add(cursist);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (var cursist : cursisten) {
            stringBuilder.append(cursist.toString()  );
            stringBuilder.append("\n");
        }
        return "Lokaal " + lokaalNr + ' ' + trainer +'\n'
                + cursisten.size() + " cursisten:" + '\n'
                + stringBuilder;
    }
}



/*
Je maakt de nodige classes, zodat volgende code
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
volgende output geeft:
Lokaal 11 Hans Desmet
4 cursisten:
Felix De Vliegher volgt java
Koen Vanhoutte volgt .net
Serge Vereecke volgt .net
Freddy Himpe volgt java
 */