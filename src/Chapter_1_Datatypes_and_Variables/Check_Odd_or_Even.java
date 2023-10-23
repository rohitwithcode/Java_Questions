package Chapter_1_Datatypes_and_Variables;

import javax.swing.*;
import java.util.Scanner;

public class Check_Odd_or_Even {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the number : ");
        int a=scanner.nextInt();

        if (a%2==0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
}
