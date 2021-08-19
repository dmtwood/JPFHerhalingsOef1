package be.vdab.jpf.herhalingen;

import java.util.*;

public class Land {

    private String landcode;
    private String landnaam;
    private int aantalInwoners;

    public Land(String landcode, String landnaam, int aantalInwoners) {
        this.landcode = landcode;
        this.landnaam = landnaam;
        this.aantalInwoners = aantalInwoners;
    }

    public String getLandcode() {
        return landcode;
    }

    public void setLandcode(String landcode) {
        this.landcode = landcode;
    }

    public String getLandnaam() {
        return landnaam;
    }

    public void setLandnaam(String landnaam) {
        this.landnaam = landnaam;
    }

    public int getAantalInwoners() {
        return aantalInwoners;
    }

    public void setAantalInwoners(int aantalInwoners) {
        this.aantalInwoners = aantalInwoners;
    }

    @Override
    public String toString() {
        return landcode + " " + landnaam + "\n aantal inwoners:  " + aantalInwoners;
    }

    public static void main(String[] args) {
        List<Land> landen = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String landcode = "";
        while ( !landcode.equals("STOP") ) {
            System.out.println("Geef de landcode van het land in. Type stop om te stoppen  ");
            landcode = scanner.next();
            if (landcode.equals("stop") || landcode.equals("Stop") || landcode.equals("STOP")) {
                break;
            }
            System.out.println("Geef de naam van het land in. ");
            String landnaam = scanner.next();

            System.out.println("Geef het aantal inwoners in. ");
            int aantalInwoners = scanner.nextInt();

            landen.add(new Land(landcode, landnaam, aantalInwoners));
        }
        for (Land land : landen)
        System.out.println(land);



    }
}
