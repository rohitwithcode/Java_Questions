package Chapter_1_Datatypes_and_Variables;

import java.util.Scanner;

public class Simple_Interest_Program {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the Amount : ");
        float amount=scanner.nextFloat();

        System.out.println("Enter the Time in Months : ");
        int months=scanner.nextInt();

        System.out.println("Enter the Rate : ");
        float rate=scanner.nextFloat();

        float simpleInterest=(amount*months*rate)/100;

        float total=amount+simpleInterest;

        System.out.println("The total amount after "+months+" months is "+total+" at Rate of "+rate+"%");




    }
}
