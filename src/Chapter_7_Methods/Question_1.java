package Chapter_7_Methods;

import java.util.Scanner;

/*
    Write a Java method that takes two integers as parameters and returns their sum.
 */
public class Question_1 {
    public  static int sum(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int first=scanner.nextInt();

        System.out.println("Enter the second number : ");
        int second=scanner.nextInt();

        int s=sum(first,second);

        System.out.println("The sum of "+first+" and "+second+" is : "+s);
    }
}
