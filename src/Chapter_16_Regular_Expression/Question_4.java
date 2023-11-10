package Chapter_16_Regular_Expression;
/*
    Write a Java program to
    find the sequence of one upper case letter followed by lower case letters.
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question_4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the characters : ");
        String s=scanner.nextLine();

        Pattern pattern=Pattern.compile("^[A-Z][a-z]+$");
        Matcher matcher=pattern.matcher(s);

        try {
            if(matcher.find()){
                System.out.println("Pattern Match : "+matcher.group());
            }
            else {
                System.out.println("Match Not found : "+matcher.group());
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
