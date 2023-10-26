package Chapter_4_Conditionals;
/*
    Write a Java program that checks if a given year is a leap year.
    Use an if-else statement to display whether the year is a leap year or not.
 */

import java.util.Scanner;

public class Leap_year_checker {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter year,Do you want to check year is leap or not : ");
        int year=scanner.nextInt();

        if (year%400==0){
            System.out.println(+year+" is Leap year.");
        } else if (year%4==0 && year%100!=0) {
            System.out.println(+year+" is a Leap year.");
        }
        else {
            System.out.println(+year+" is not a Leap Year.");
        }
    }
}
