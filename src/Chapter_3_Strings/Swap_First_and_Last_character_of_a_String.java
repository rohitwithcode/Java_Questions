package Chapter_3_Strings;

import java.util.Scanner;

public class Swap_First_and_Last_character_of_a_String {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your string : ");
        String str=scanner.nextLine();

        if(str.length() >= 2){
            // Extract the first and last characters
            char firstChar=str.charAt(0);
            char lastChar=str.charAt(str.length()-1);

            // Create a StringBuilder to build the new string
            StringBuilder swapped=new StringBuilder(str);

            // Replace the first and last characters
            swapped.setCharAt(0,lastChar);
            swapped.setCharAt(str.length()-1,firstChar);

            // Convert the StringBuilder back to a string
            String swap=swapped.toString();

            System.out.println("Original String : "+str);
            System.out.println("Swapped String : "+swap);
        }
        else{
            System.out.println("String is too short");
        }
    }
}
