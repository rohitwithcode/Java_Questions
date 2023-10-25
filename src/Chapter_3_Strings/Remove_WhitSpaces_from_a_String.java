package Chapter_3_Strings;
/*
    Write Java code to remove all whitespace from a given string.
 */
import java.util.Scanner;

public class Remove_WhitSpaces_from_a_String {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your string : ");
        String user=scanner.nextLine();

        String replace=user.replaceAll(" ","");

        System.out.println("Your string without WhiteSpaces : "+replace);
    }
}
