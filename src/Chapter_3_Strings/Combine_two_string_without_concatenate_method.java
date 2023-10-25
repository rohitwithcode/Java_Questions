package Chapter_3_Strings;
/*
     Combine two or more strings into one in Java without using built-in string concatenation methods.
 */
import java.util.Scanner;

public class Combine_two_string_without_concatenate_method {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your First string : ");
        String first=scanner.nextLine();

        System.out.println("Enter your Second string : ");
        String second=scanner.nextLine();

        String combine=first+second;

        System.out.println("Your combine string : "+combine);
    }
}
