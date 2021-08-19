package be.vdab.jpf.herhalingen.time;

public class TimeApp {
    public static void main(String[] args) {
        var hour1 = new Time(9, 31);
        var hour2 = new Time(10, 30);
        var hour3 = hour2.substract(hour1);
        System.out.println(hour3);
        var hour4 = hour1.add(hour2);
        System.out.println(hour4);
    }
}
