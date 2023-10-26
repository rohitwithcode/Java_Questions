package Chapter_4_Conditionals;
/*
    Create a Java program that simulates a simple calculator with a menu.
    The user can choose between addition, subtraction, multiplication,reminder, and division, and
    then enter two numbers to perform the selected operation.
 */

import java.util.Scanner;

public class Calculator_with_Menu {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Press 1. + (ADDITION)");
        System.out.println("Press 2. - (SUBTRACTION)");
        System.out.println("Press 3. * (MULTIPLICATION)");
        System.out.println("Press 4. / (DIVIDE)");
        System.out.println("Press 5. % (REMINDER)");

        System.out.print("Enter your input : ");
        int userInput=scanner.nextInt();

        switch (userInput){
            case 1:
                System.out.println("Enter the first number : ");
                float first=scanner.nextFloat();

                System.out.println("Enter the second number : ");
                float second= scanner.nextFloat();

                float sum=first+second;
                System.out.println("Your result of sum "+first+" add "+second+" is "+sum);
                break;

            case 2:
                System.out.println("Enter the first number : ");
                float firstSub=scanner.nextFloat();

                System.out.println("Enter the second number : ");
                float secondSub= scanner.nextFloat();

                float subtraction=firstSub-secondSub;
                System.out.println("Your result of subtraction "+firstSub+" subtract by "+secondSub+" is "+subtraction);
                break;

            case 3:
                System.out.println("Enter the first number : ");
                float firstMul=scanner.nextFloat();

                System.out.println("Enter the second number : ");
                float secondMul= scanner.nextFloat();

                float multiplication=firstMul*secondMul;
                System.out.println("Your result of Multiplication "+firstMul+" multiply "+secondMul+" is "+multiplication);
                break;

            case 4:
                System.out.println("Enter the first number : ");
                float firstDiv=scanner.nextFloat();

                System.out.println("Enter the second number : ");
                float secondDiv= scanner.nextFloat();

                float divide=firstDiv/secondDiv;
                System.out.println("Your result of Divide "+firstDiv+" divide by "+secondDiv+" is "+divide);
                break;

            case 5:
                System.out.println("Enter the first number : ");
                float firstRem=scanner.nextFloat();

                System.out.println("Enter the second number : ");
                float secondRem= scanner.nextFloat();

                float Reminder=firstRem%secondRem;
                System.out.println("Your result of Reminder "+firstRem+" module by "+secondRem+" is "+Reminder);
                break;


        }
    }
}
