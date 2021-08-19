package be.vdab.jpf.herhalingen.woorden;

import java.util.*;

public class WoordenIndexen {

        public static void main(String[] args) {
            int rowNr = 1;
            Map<String, List<Integer>> woorden = new HashMap<>();
            List<Integer> legeLijst = new ArrayList<>() ;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Geef een zin in. stop om te stoppen");
            String input = scanner.nextLine();
            while (!input.equals("Stop") && !input.equals("STOP") && !input.equals("stop")) {
                String[] woordenGesplitst = input.split(" ");
                for (String woord : woordenGesplitst) {
                    List<Integer> helpList = woorden.getOrDefault(woord, legeLijst ) ;
                    helpList.add(rowNr);
                    woorden.put(woord, helpList);
                    rowNr += 1;
                    System.out.println("Geef een zin in. stop om te stoppen");
                    input = scanner.nextLine();
                }
            }
            System.out.println(woorden);
            woorden.forEach((entry, value) ->
                            System.out.println(entry + value.toString()));

            //        System.out.println(entry + " komt " + value + " keer voor."));
        }

}
