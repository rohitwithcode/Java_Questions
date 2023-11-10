package Chapter_16_Regular_Expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
     Write a Java program that
     matches a string with a 'p' followed by anything ending in 'q'.
 */
public class Question_5 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your string : ");
        String s=scanner.nextLine();

        Pattern pattern=Pattern.compile("[pP][a-zA-Z]*q");
        Matcher matcher=pattern.matcher(s);

        if (matcher.find()){
            System.out.println("Patter match...");
        }
        else {
            System.out.println("Pattern not Match...");
        }
    }
}
