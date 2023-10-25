package Chapter_3_Strings;
/*
    Write Java code to reverse a given string without using any additional data structures.
 */
import java.util.Scanner;

public class Reverse_a_String {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your string : ");
        String user=scanner.nextLine();

        StringBuilder reversed=new StringBuilder(user);

        reversed.reverse();

        String reversedString=reversed.toString();

        System.out.println("Here is original string which entered by user : "+user);
        System.out.println("Here is revered string : "+reversedString);
    }
}
