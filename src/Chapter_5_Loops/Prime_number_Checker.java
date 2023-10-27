package Chapter_5_Loops;

import java.util.Scanner;

/*
    Create a Java program that finds and displays all prime numbers within a given range (e.g., 1 to 100) using loops.
 */
public class Prime_number_Checker {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number :");
        int number=scanner.nextInt();
        boolean prime=true;
        for(int i=2;i<=number-1;i++){
            if(number%i==0){
                prime=false;
                break;
            }
        }
        if (prime){
            System.out.println(+number+" is a Prime Number.");
        }
        else {
            System.out.println(+number+" is not a Prime Number.");
        }
    }
}
