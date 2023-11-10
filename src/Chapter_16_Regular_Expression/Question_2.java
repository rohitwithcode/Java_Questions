package Chapter_16_Regular_Expression;
/*
    2. Write a Java program that matches
     a string that has a p followed by zero or more q's.
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question_2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the characters : ");
        String s=scanner.nextLine();

        Pattern pattern=Pattern.compile("[pP?][qQ]*");
        Matcher matcher=pattern.matcher(s);

        if(matcher.find()){
            System.out.println("Match Found : "+matcher.group());
        }
        else {
            System.out.println("Match Not found : "+matcher.group());
        }
    }
}
