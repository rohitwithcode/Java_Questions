package Chapter_7_Methods;

import java.util.Scanner;

/*
    Create a method that checks if a number is prime.
     The method should take an integer as a parameter and return true if it's prime, false otherwise.
 */
public class Check_Prime {
    public static boolean checkPrime(int number){
        boolean prime=true;
        for (int i=2;i<number;i++){
            if (number%i==0){
                prime=false;
                break;
            }
        }
        return prime;
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number : ");
        int number=scanner.nextInt();

        boolean prime=checkPrime(number);

        if (prime){
            System.out.println("The number "+number+" is prime");
        }
        else {
            System.out.println("The number "+number+" is not prime");
        }

    }
}
