package Chapter_8_OOPs;
/*
    Create a class Time to represent a time of day (hours, minutes, seconds).
    Implement methods to add and subtract times, and compare two times to find which is earlier.
 */

class  Time {
    int hours, minutes, second;

    Time(int h, int m, int s) {
        hours = h;
        minutes = m;
        second = s;
    }

    public void addTime(int h, int m, int s) {
        hours = hours + h;
        minutes = minutes + m;
        second = second + s;
        normalizeTime();
        display();
    }

    public void subtractTime(int h, int m, int s) {
        hours = hours - h;
        minutes = minutes - m;
        second = second - s;
        normalizeTime();
        display();
    }

    public void normalizeTime() {
        while (second >= 60) {
            second = second - 60;
            minutes = minutes + 1;
        }
        while (minutes>=60){
            minutes=minutes-60;
            hours=hours+1;
        }
        while (hours>=12){
            hours=hours-12;
            //hours=hours+1;
        }
    }

    public boolean whichTimeEarlier(Time secondTime) {
        if (this.hours < secondTime.hours) {
            return true;
        } else if (this.hours == secondTime.hours && this.minutes < secondTime.minutes) {
            return true;
        } else if (this.hours == secondTime.hours && this.minutes == secondTime.minutes && this.second < secondTime.second) {
            return true;
        } else {
            return false;
        }
    }
    public void display(){
        System.out.println(+hours+":"+minutes+":"+second);
    }
}
public class Question_9 {
    public static void main(String[] args) {
        System.out.println("Hour below: ");

        Time t=new Time(13,65,23);
        Time t1=new Time(3,45,6);

        t.addTime(2,3,45);
        t1.subtractTime(1,23,45);

        if(t.whichTimeEarlier(t1)){
            System.out.println("Time t is earlier.");
        }
        else{
            System.out.println("Time t1 is earlier.");
        }

        t.normalizeTime();
        t.display();


    }
}
