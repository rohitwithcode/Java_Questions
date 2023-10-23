package Chapter_1_Datatypes_and_Variables;

import java.util.Scanner;

public class Swapping_without_third_variable {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int first=scanner.nextInt();

        System.out.println("Enter the second number : ");
        int second=scanner.nextInt();

        System.out.println("Your swapped values is given below : ");

        first=first+second;
        second=first-second;
        first=first-second;

        System.out.println("The first after swap : "+first);
        System.out.println("The second after swap : "+second);

    }
}
