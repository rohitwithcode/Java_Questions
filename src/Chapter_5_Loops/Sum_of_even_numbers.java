package Chapter_5_Loops;

import java.util.Scanner;

/*
    Write a Java program that uses a loop to print all even numbers from 1 to 50.
 */
public class Sum_of_even_numbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number ");
        int number=scanner.nextInt();

        int sum=0;

        System.out.println("Even numbers : ");
        for (int i=1;i<=number;i++){

            if(i%2==0){
                System.out.print(i+" ");
                sum=sum+i;
            }
        }
        System.out.println("\nSum of "+number+" even numbers are : "+sum);
    }
}
