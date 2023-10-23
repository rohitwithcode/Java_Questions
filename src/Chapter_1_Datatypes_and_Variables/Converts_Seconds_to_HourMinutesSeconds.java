package Chapter_1_Datatypes_and_Variables;

import java.util.Scanner;

public class Converts_Seconds_to_HourMinutesSeconds {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the Value of Seconds :");
        int seconds=scanner.nextInt();

       int hours=seconds/3600;
       int remainingSeconds=seconds%3600;
       int minutes=remainingSeconds/60;
       int second=remainingSeconds%60;

        System.out.println("Time is in HH:MM:SS "+hours+":"+minutes+":"+":"+second);


    }
}
