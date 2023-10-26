package Chapter_4_Conditionals;
/*
    Create a Java program that prompts the user for their age and whether they have a driver's license.
     Use logical operators to determine if they are eligible to drive.
 */

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age=scanner.nextInt();

        System.out.println("Do you have a Driving license :(yes/no)");
        String hasLicense=scanner.next();


        if (age>18 && hasLicense.equalsIgnoreCase("yes")){
            System.out.println("You are eligible to Drive...");
        }
        else if (age<18 ) {
            System.out.println("You are young to drive...");
        }
        else if ( hasLicense.equalsIgnoreCase("NO")) {
            System.out.println("You need a Driving license...");
        }
    }
}
