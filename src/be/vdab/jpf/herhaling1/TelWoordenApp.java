package be.vdab.jpf.herhaling1;

import javax.security.sasl.SaslClient;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TelWoordenApp {

    public static void main(String[] args) {
        Map<String, Integer> woorden = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geef een zin in. stop om te stoppen");
        String input = scanner.nextLine();
        while (!input.equals("Stop") && !input.equals("STOP") && !input.equals("stop") ) {
            String[] woordenGesplitst = input.split(" ");
            for (String woord : woordenGesplitst){
                if (woorden.containsKey(woord)) woorden.replace(woord, woorden.getOrDefault(woord, 0 ) + 1);
                else woorden.put(woord, 1);
            }
            System.out.println("Geef een zin in. stop om te stoppen");
            input = scanner.nextLine();
        }
        System.out.println(woorden);
        woorden.forEach((entry,value) ->
            System.out.println(entry + " komt " + value + " keer voor.") );
    }

}
