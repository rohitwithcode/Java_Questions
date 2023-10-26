package Chapter_4_Conditionals;
/*
    Create a Java program that prompts the user to enter two numbers,
    and uses nested if statements to determine if the first number is divisible by the second.
 */

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int first=scanner.nextInt();

        System.out.println("Enter the second number : ");
        int second= scanner.nextInt();

        if (second==0){
            System.out.println("Number is not divisible by 0.");
        }
        else{
            if (first%second==0){
                System.out.println(+first+" is divisible by "+second);
            }
            else {
                System.out.println(+first+" is not divisible by "+second);
            }
        }
    }
}
