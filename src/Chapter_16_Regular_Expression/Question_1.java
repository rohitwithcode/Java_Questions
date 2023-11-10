package Chapter_16_Regular_Expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
      1. Write a Java program to check whether a string contains only
       a certain set of characters (in this case a-z, A-Z and 0-9).
*/
public class Question_1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the characters : ");
        String s=scanner.nextLine();

        Pattern pattern=Pattern.compile("[a-zA-Z0-9]");
        Matcher matcher=pattern.matcher(s);

        if(matcher.find()){
            System.out.println("Your string is correct : ");
        }
        else {
            System.out.println("Your string is incorrect...");
        }
    }
}
