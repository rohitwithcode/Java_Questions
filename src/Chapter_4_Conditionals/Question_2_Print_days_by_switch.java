package Chapter_4_Conditionals;
/*
    Write a Java program that takes a day of the week as input.
    (e.g., "Monday," "Tuesday") and uses a switch statement to display a message based on the day.
 */

import java.util.Scanner;

public class Question_2_Print_days_by_switch {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int start=1;
        int end=7;
        System.out.println("Enter your input : ");
        int user=scanner.nextInt();

        if(user>end || user<start){
            System.out.println("Please enter between (1-7) try again");
        }
        else{
            switch (user){
                case 1:
                    System.out.println("Day is Monday today");
                    break;
                case 2:
                    System.out.println("Day is Tuesday today.");
                    break;
                case 3:
                    System.out.println("Day is Wednesday today.");
                    break;
                case 4:
                    System.out.println("Day is Thursday today.");
                    break;
                case 5:
                    System.out.println("Day is Friday today.");
                    break;
                case 6:
                    System.out.println("Day is Saturday today.");
                    break;
                case 7:
                    System.out.println("Day is Sunday today.");
                    break;
                default:
                    System.out.println("Try again.........");
            }
        }
    }
}
