package Chapter_5_Loops;

import java.util.Scanner;

/*
    Develop a program to print a square pattern
 */
public class Square_Pattern {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter row number : ");
        int n=scanner.nextInt();

        if(n<0){
            System.out.println("Please enter a positive number.");
        }
        else{
            int row=1;

            while (row<=n){
                int column=1;
                while (column<=n){
                    System.out.print("*");
                    column++;
                }
                row++;
                System.out.println("");
            }
        }
    }
}
