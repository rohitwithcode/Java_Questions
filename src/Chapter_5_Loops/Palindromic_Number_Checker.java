package Chapter_5_Loops;

import java.util.Scanner;

/*
    Create a Java program that checks if a given positive integer is a palindromic number using loops (e.g., 121 is palindromic).
 */
public class Palindromic_Number_Checker {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number =scanner.nextInt();
        int temp=number;
        int reverseNumber=0;
        if(number<0){
            System.out.println("Enter a Positive number : ");
        }
        else{
            while (number!=0){
                int digit=number%10;
                reverseNumber=reverseNumber*10+digit;
                number=number/10;
            }
        }
        if (reverseNumber==temp){
            System.out.println(+temp +" is Palindromic Number.");
        }
        else {
            System.out.println(+temp+" is not Palindromic Number.");
        }
    }
}
