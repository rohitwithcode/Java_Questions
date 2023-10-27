package Chapter_5_Loops;

import java.util.Scanner;

/*
    Develop a program to print Diamond Shape.
 */
public class Diamond_Shape {
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
                int space=1;
                while (space<=n-row){
                    System.out.print(" ");
                    space++;
                }
                int column=1;
                while (column<=row*2-1){
                    System.out.print("*");
                    column++;
                }
                row++;
                System.out.println("");
            }
            int backRow=1;
            while (backRow<=n){
                int backSpace=1;
                while (backSpace<=backRow-1){
                    System.out.print(" ");
                    backSpace++;
                }
                int backcolumn=1;
                while (backcolumn<=n*2-backRow*2+1){
                    System.out.print("*");
                    backcolumn++;
                }
                backRow++;
                System.out.println("");
            }
        }
    }
}
