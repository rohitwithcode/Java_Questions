package Chapter_16_Regular_Expression;
/*
    3. Write a Java program to
     find sequences of lowercase letters joined by an underscore.
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
    In Java regular expressions,
    the caret symbol ^ has a special meaning when used at the beginning of a regular expression pattern.
    It is used to assert that the pattern that follows it must appear at the beginning of a line.


    When used at the beginning, it asserts the start of a line.
    In other positions, it is treated as a literal character.


    In Java regular expressions,the dollar sign $ has a special meaning.
     It is used to indicate the end of a line.
     When used at the end of a regular expression pattern,
    it asserts that the match should occur at the end of a line.
 */
public class Question_3 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the characters : ");
        String s=scanner.nextLine();

        Pattern pattern=Pattern.compile("^[a-z]+_[a-z]+$"); // dollar sing mean it indicate the end of line(string).
        Matcher matcher=pattern.matcher(s);

        if(matcher.find()){
            System.out.println("Pattern Match : "+matcher.group());
        }
        else {
            System.out.println("Match Not found : "+matcher.group());
        }
    }
}
