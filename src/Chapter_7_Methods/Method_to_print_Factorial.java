package Chapter_7_Methods;

import java.util.Scanner;

/*
    Create a method that calculates the factorial of a given integer.
    The method should take an integer as a parameter and return its factorial.
 */
public class Method_to_print_Factorial {
    public static long factorial(int number){
        long fact=1;
        for (int i=number;i>0;i--){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number to calculate the factorial : ");
        int number=scanner.nextInt();

        long f=factorial(number);

        System.out.println("The factorial of "+number+" is : "+f);
    }
}
