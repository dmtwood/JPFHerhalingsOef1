package be.vdab.jpf.herhaling1;

public class Time {
    int hours, minutes;

    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return hours + ":" + minutes;
    }

    public Time add(Time time) {
//        System.out.println(time.hours);
        this.hours += time.hours;
//        System.out.println(hours);
        this.minutes += time.minutes;
        while (this.minutes >=60) {
            this.minutes -= 60;
            this.hours += 1;
        }
    return new Time(hours, minutes);
    }

    public Time substract(Time time) {
        var hoursResult = this.hours - time.hours;
        var minutes = this.minutes - time.minutes;
        if (minutes < 0) {
            hoursResult--;
            minutes += 60;
        }
        return new Time(hoursResult, minutes);

    }

}
