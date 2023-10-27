package Chapter_5_Loops;

import java.util.Scanner;

/*
    Create a Java program that calculates and displays the factorial of a given positive integer using a loop.
 */
public class Factorial_of_given_number {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number to calculate factorial : ");
        int number=scanner.nextInt();

        int factorial=1;

        for(int i=number;i>0;i--){
            factorial=factorial*i;
        }
        System.out.println("factorial of "+number+" is "+factorial);
    }
}
