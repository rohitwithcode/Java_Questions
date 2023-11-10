package Chapter_16_Regular_Expression;
/*
     Write a Java program
     to check if a word contains the character 'g' in a given string.
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question_6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your string : ");
        String s=scanner.nextLine();

        Pattern pattern=Pattern.compile("\\w*g.\\w*");
        Matcher matcher=pattern.matcher(s);

        if(matcher.find()){
            System.out.println("Pattern match.");
        }
        else {
            System.out.println("Pattern not matched.");
        }
    }
}
