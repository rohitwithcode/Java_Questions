package Chapter_1_Datatypes_and_Variables;

import java.util.Scanner;

public class Concatenates_two_Strings {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter first String : ");
        String first=scanner.nextLine();

        System.out.println("Enter Second String : ");
        String second=scanner.nextLine();

        System.out.println(first.concat(second));


    }
}
