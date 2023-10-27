package Chapter_5_Loops;

import java.util.Scanner;

/*
    Develop a program to print Right Angle triangle Shape.
 */
public class Right_angle_triangle_Pattern {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the row number : ");
        int number=scanner.nextByte();

        int row=1;
        while (row<=number){
            int column=1;
            int space=1;
            while (space<=number-row){
                System.out.print(" ");
                space++;
            }
            while (column<=row){
                System.out.print("*");
                column++;
            }
            row++;
            System.out.println("");
        }

    }
}
