package Chapter_5_Loops;

import java.util.Scanner;

/*
    Develop a Java program that reverses a positive integer using loops (e.g., 12345 becomes 54321).
 */
public class Reverse_Number {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number=scanner.nextInt();

        if (number<0){
            System.out.println("Please enter a positive number : ");
        }
        else {
            int reverseNumber=0;
            while (number!=0){
                int digit=number%10;
                reverseNumber=reverseNumber*10+digit;
//                System.out.print(reverseNumber);
                number=number/10;
            }
            System.out.println("Reverse Number : "+reverseNumber);
        }
    }
}
