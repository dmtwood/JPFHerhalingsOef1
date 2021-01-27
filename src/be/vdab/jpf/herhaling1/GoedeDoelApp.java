package be.vdab.jpf.herhaling1;

import java.math.BigDecimal;
import java.util.Scanner;

public class GoedeDoelApp {

    public static void main(String[] args) {

        var doel = new GoedeDoel();
        var scanner = new Scanner(System.in);


        GoedeDoel.printHoofdMenu();
        String naamDoel = scanner.nextLine();
        doel.setNaam(naamDoel);

        int input = GoedeDoel.getInput();
        System.out.println(input);

        while(input!= 0) {
            switch (input) {
                case 1:
                    System.out.println("Hoeveel wil u storten");
                    doel.storten(scanner.nextBigDecimal());
                    input = GoedeDoel.getInput();
                    break;

                case 2:
                    System.out.println("Gestort voor " + doel.getNaam() + ": " + doel.getGestort());
                    input = GoedeDoel.getInput();
                    break;

                case 0:
                    input = 0;
                    break;
            }
        }
    }
}
