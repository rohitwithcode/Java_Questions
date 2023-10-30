package Chapter_7_Methods;

import java.util.Scanner;

/*
    Write a method that calculates the Fibonacci sequence up to a given number n.
     The method should take an integer n as a parameter and return an array of Fibonacci numbers.
 */
public class Print_fibonacci {
    public static int [] fibonacci(int number){
        int firstTerm=0;
        int secondTerm=1;
        int [] fib=new int[number];
        fib[0]=firstTerm;
        fib[1]=secondTerm;
        for(int i=2;i<number;i++){
            fib[i]=firstTerm+secondTerm;
            firstTerm=secondTerm;
            secondTerm=fib[i];
        }
        return  fib;
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number : ");
        int number=scanner.nextInt();

        int [] fib=new int[number];

        fib=fibonacci(number);

        System.out.println("Your fibonacci sequence is given below : \n");
        for(int f:fib){
            System.out.print(f+" ");
        }
        System.out.println("");
    }
}
