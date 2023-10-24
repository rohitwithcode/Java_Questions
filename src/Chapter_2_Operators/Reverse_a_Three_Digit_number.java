package Chapter_2_Operators;

import java.util.Scanner;

/*
    Write a program to reverse a 3-digit number. E.g.-Number : 132        Output : 231
 */
public class Reverse_a_Three_Digit_number {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the three digit number : ");
        int number=scanner.nextInt();
        int temp=number;
        int lastDigit=number%10;
        number=number/10;

        int secondLastDigit=number%10;
        number=number/10;

        int firstDigit=number;

        System.out.println("Your given number "+temp+" in reverse is : "+lastDigit+secondLastDigit+firstDigit);
    }
}
