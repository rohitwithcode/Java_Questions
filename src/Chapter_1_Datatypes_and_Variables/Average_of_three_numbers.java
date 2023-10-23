package Chapter_1_Datatypes_and_Variables;

import java.util.Scanner;

public class Average_of_three_numbers {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the first number : ");
        float first=scanner.nextFloat();

        System.out.println("Enter the second numbers : ");
        float second=scanner.nextFloat();

        System.out.println("Enter the third numbers : ");
        float third=scanner.nextFloat();

        float average=(first+second+third)/3;

        System.out.println("The average of "+first+","+second+" and "+third+" is "+average);

    }
}
