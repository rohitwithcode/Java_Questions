package Chapter_4_Conditionals;
/*
    Develop a Java program that checks if a given number is within a specific range (e.g., 1-100).
    Use an if statement to display whether the number is in the range or not.
 */

import java.util.Scanner;

public class Number_Range_Checker {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter number : ");
        int number=scanner.nextInt();

        if (number>=1 && number<=100){
            System.out.println("The number is range within 1 to 100 .");
        }
        else {
            System.out.println("The number is outside the range of 1 to 100 .");
        }
    }
}
