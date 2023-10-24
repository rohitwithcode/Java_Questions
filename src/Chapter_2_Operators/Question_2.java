package Chapter_2_Operators;

import java.util.Scanner;

/*
Take a 4 digit number. Write a program to display a number whose digits are 2 greater than the corresponding digits of the number TAKEN.
For example, if the number which was taken is 5696, then the displayed number should be 7818.
 */
public class Question_2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the four digit number : ");
        int number=scanner.nextInt();
        int temp=number;
        int lastDigit=number%10;
        System.out.println("The Last digit of number"+number+" is : "+lastDigit);
        int lastDigitExtendBy2=lastDigit+2;
        System.out.println("The Last Digit after extend by 2 is : "+lastDigitExtendBy2);
        number=number/10;

        int secondLastDigit=number%10;
        System.out.println("The Second Last Digit of number "+temp+" is : "+secondLastDigit);
        int secondLastDigitExtendBy2=secondLastDigit+2;
        System.out.println("The Second last digit after extend by 2 is : "+secondLastDigitExtendBy2);
        number=number/10;

        int secondDigit=number%10;
        System.out.println("The Second Digit of number "+temp+" is :"+secondDigit);
        int secondDigitExtendBy2=secondDigit+2;
        System.out.println("The Second digit after extend by 2 is : "+secondDigitExtendBy2);
        number=number/10;

        int firstDigit=number;
        System.out.println("The First Digit of number "+temp+" is : "+firstDigit);
        int FirstDigitExtendBy2=firstDigit+2;
        System.out.println("The First digit after extend by 2 is : "+FirstDigitExtendBy2);


        System.out.println("Your Final Result is : "+FirstDigitExtendBy2+secondDigitExtendBy2+secondLastDigitExtendBy2+lastDigitExtendBy2);

    }
}
