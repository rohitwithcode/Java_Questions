package Chapter_1_Datatypes_and_Variables.I;

import java.util.Scanner;

public class Celsius_to_Fahrenheit {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter your Celsius value : ");
        double celsius=scanner.nextInt();

        double fahrenheit=(celsius * 9/5)+32;

        System.out.println(+celsius+" Celsius value is in fahrenheit = "+fahrenheit);

    }
}
