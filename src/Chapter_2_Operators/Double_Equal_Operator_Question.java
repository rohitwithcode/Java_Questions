package Chapter_2_Operators;

import java.util.Scanner;

/*
    Now, solve the above question using assignment operators (eg. +=, -=, *=).
 */
public class Double_Equal_Operator_Question {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number=scanner.nextInt();
        System.out.print("Enter the number which you want to add : ");
        int numberAdd=scanner.nextInt();

        number +=numberAdd;
        System.out.println("Number after the (+=) Operator Below:");
        System.out.println("Value of (number += numberAdd) : "+number);

    }
}
