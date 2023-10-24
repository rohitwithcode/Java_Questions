package Chapter_2_Operators;

import java.util.Scanner;

/*
    Write a program to calculate the sum of the first and the second last digit of a 5 digit.
    E.g.- NUMBER : 12345        OUTPUT : 1+4=5
 */
public class FirstDigit_and_SecondLastDigit_sum_of_a_Number {
    public static void main(String[] args) {

        int number=12345;

        int lastDigit=number%10;
        number=number/10;

        int secondLastDigit=number%10;
        System.out.println("The Second last Digit of your number is : "+secondLastDigit);
        number=number/10;

        number=number/10;
        number=number/10;

        int firstDigit=number;
        System.out.println("The First number is of your number is : "+firstDigit);

        int sum=firstDigit+secondLastDigit;
        System.out.println("The sum of "+secondLastDigit+" and "+firstDigit+" is = "+(sum));

    }
}
