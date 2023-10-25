package Chapter_3_Strings;

import java.util.Scanner;

public class Character_check_in_string {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your string : ");
        String str=scanner.nextLine();


            if (str.contains("t")){
                System.out.println("String has t character.");
            }
            else {
                System.out.println("String has no t character.");
            }
        }
}
