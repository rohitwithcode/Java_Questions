package Chapter_5_Loops;

import java.util.Scanner;

/*
    Write a Java program to generate and display the Fibonacci series up to a specified number of terms using loops.
 */
public class Fibonacci_series_program {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number : ");
        int number =scanner.nextInt();

        int first=0;
        int second=1;
        System.out.println("Your Fibonacci Series of "+number+" numbers given below : \n");
        System.out.print(+first+" "+second);
        for(int i=3;i<=number;i++){
            int nextTerm=first+second;
            System.out.print(" "+nextTerm);
            first=second;
            second=nextTerm;
        }
    }
}
