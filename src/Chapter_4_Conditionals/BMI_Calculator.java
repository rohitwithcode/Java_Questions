package Chapter_4_Conditionals;
/*
    Write a Java program that calculates a person's Body Mass Index (BMI) based on their height and weight.
    Use conditional statements to categorize the BMI as underweight, normal, overweight, or obese.
 */

import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your height in meters : ");
        double height=scanner.nextDouble();

        System.out.println("Enter your weight in kilograms : ");
        double weight=scanner.nextDouble();

        double bmi=weight/(height*height);

        System.out.println("Your BMI is : "+bmi);

        if (bmi<18.5){
            System.out.println("You are under weight...");
        } else if (bmi>18.5 && bmi<25.1) {
            System.out.println("You have normal weight...");
        }
        else if (bmi>25.1 && bmi<29.5){
            System.out.println("You are overweight...");
        }
        else {
            System.out.println("You are obese");
        }
    }
}
