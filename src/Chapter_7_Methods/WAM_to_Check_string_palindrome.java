package Chapter_7_Methods;

import java.util.Scanner;

/*
    Write a method that checks whether a given string is a palindrome.
     The method should take a string as a parameter and return true if it's a palindrome, false otherwise.
 */
public class WAM_to_Check_string_palindrome {
    public  static boolean stringPalindrome(String str){
            str=str.replaceAll("\\s","");
            str.toLowerCase();

            int left=0;
            int right=str.length()-1;

            while (left<right){
                if (str.charAt(left) != str.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
            return true;
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter string : ");
        String s=scanner.nextLine();


        boolean b=stringPalindrome(s);
        if (b){
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }
    }
}
