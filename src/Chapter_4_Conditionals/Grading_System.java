package Chapter_4_Conditionals;
/*
    Develop a Java program that takes a student's score as input and uses a series of if-else if statements
    to determine their grade based on the following scale:

        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: 0-59
 */

import java.util.Scanner;

public class Grading_System {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter student numbers : ");
        float marks=scanner.nextFloat();

        if (marks>=90 && marks<=100){
            System.out.println("Grade : A");
        } else if (marks>=80 && marks<89) {
            System.out.println("Grade : B");
        } else if (marks>=70 && marks<=79) {
            System.out.println("Grade : C");
        } else if (marks>=60 && marks<=69) {
            System.out.println("Grade : D");
        } else if (marks>=50 && marks<=59) {
            System.out.println("Grade : E");
        } else {
            System.out.println("Grade : F");
        }
    }
}
