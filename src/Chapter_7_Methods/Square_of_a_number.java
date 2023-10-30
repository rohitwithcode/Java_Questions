package Chapter_7_Methods;

import java.util.Scanner;

/*
    Write a Java method that takes a number and calculates its square.
    The method should take a double as a parameter and return the square as a double.
 */
public class Square_of_a_number {
    public  static double square(double number){

        return number*number;
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number to calculate its square : ");
        int number=scanner.nextInt();

        double s=square(number);

        System.out.println("The square of the "+number+" is : "+s);
    }
}
