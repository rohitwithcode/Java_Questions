package Chapter_5_Loops;

import java.util.Scanner;

/*
    Develop a Java program that prompts the user for a number and prints the multiplication table
    for that number up to a specified range (e.g., up to 10).
 */
public class Multiplication_Table {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter a number to print table : ");
        int number=scanner.nextInt();

        System.out.println("Your "+number+" number table is below : ");
        for(int i=1;i<=10;i++){
            System.out.println(+number+"X"+i+" = "+(number*i));
        }
    }
}
