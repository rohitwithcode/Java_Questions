package Chapter_2_Operators;

import java.util.Scanner;

/*
    Write a program to calculate the sum of the digits of a 3-digit number.
    Number : 132        Output : 6
 */
public class Sum_of_digits_of_a_number {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the Three digit number : ");
        int number=scanner.nextInt();

        int lastDigit=number%10;
        number=number/10;

        int secondLastDigit=number%10;
        number=number/10;

        int firstNumber=number;

        int sumOfDigits=firstNumber+secondLastDigit+lastDigit;

        System.out.println("The sum of the Digits "+firstNumber+","+secondLastDigit+" and "+lastDigit+" is "+sumOfDigits);
    }
}
