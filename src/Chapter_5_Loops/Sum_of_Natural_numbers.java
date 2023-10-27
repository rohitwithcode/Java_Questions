package Chapter_5_Loops;
/*
    Write a Java program that calculates the sum of natural numbers up to a given positive integer using a loop.
 */

import java.util.Scanner;

public class Sum_of_Natural_numbers {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number=scanner.nextInt();
        int sum=0;
        int count=0;
        if (number<0){
            System.out.println("Please Enter a Positive number.\n\t\t\t\t\t\t\tTry again....");
            System.exit(0);
        }
        else{
            System.out.println("Natural numbers :");
            for(int i=1;i<=number;i++){
                System.out.print(i+" ");
                sum=sum+i;
                count++;
            }
            System.out.println("\nThe sum of "+count+" Natural numbers is "+sum);
        }
    }
}
