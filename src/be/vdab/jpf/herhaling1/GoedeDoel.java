package be.vdab.jpf.herhaling1;

import java.io.Console;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.jar.JarEntry;

public class GoedeDoel {

    BigDecimal gestort = BigDecimal.ZERO;

    private String naam;

    public GoedeDoel() {
    }

    public void storten(BigDecimal storting) {
        if (storting.intValue() > 0)
            gestort = gestort.add(storting);
    }

    public BigDecimal getGestort() {
        return gestort;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getNaam() {
        return naam;
    }



    static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a Kies 1 om te storten \n 2 om het saldo te raadplegen \n 0 om te stoppen");
        int input = Integer.parseInt(scanner.nextLine());
        while(input != 0 && input != 1 && input != 2 ) {
            System.out.println("B Kies 1 om te storten \n 2 om het saldo te raadplegen \n 0 om te stoppen");
            input = Integer.parseInt(scanner.nextLine());
        }
        return input;
    }


    static void printHoofdMenu() {
        System.out.println("Welkom bij het goede doel \n");
        System.out.println("Geef uw goed doel in. \n");
    }
}
