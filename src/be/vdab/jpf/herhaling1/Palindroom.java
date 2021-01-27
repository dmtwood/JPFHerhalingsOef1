package be.vdab.jpf.herhaling1;

import java.util.Scanner;

public class Palindroom {

    static boolean check(String s) {
        if (s == null) {
            return false;
        }
        int len = s.length();
        for (int i = 0; i < len; i++) {
            // checks whether the character is not a letter
            if ( !Character.isLetter( s.charAt(i) ) ) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindroom(String input) {
        return new StringBuilder(input).reverse().toString().equals(input) ;
    }


    public static void main(String[] args) {

        String input;
        Scanner scanner =new Scanner(System.in);

        System.out.println("Geef een woord in: ");
        input = scanner.nextLine();

        while (!check(input) || input.length() < 2){
            System.out.println("Geef een geldig woord in, bestaande uit enkel letters: ");
            input = scanner.nextLine();
        }

        System.out.println(
                ( isPalindroom(input) ) ?
            input + " is een palindroom." :
            input + " is geen palindroom."
        );
    }
}
