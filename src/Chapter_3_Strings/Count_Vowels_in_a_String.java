package Chapter_3_Strings;

import java.util.Scanner;

public class Count_Vowels_in_a_String {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your string : ");
        String user=scanner.nextLine();

        int countA=0;
        int countE=0;
        int countI=0;
        int countO=0;
        int countU=0;

        for (int i=0;i<user.length()-1;i++){
            if (user.charAt(i)=='A' || user.charAt(i)=='a'){
                countA++;
            }
             if (user.charAt(i)=='E' || user.charAt(i)=='e'){
                countE++;
            }
             if (user.charAt(i)=='I'|| user.charAt(i)=='i') {
                countI++;
            }
             if (user.charAt(i)=='O' || user.charAt(i)=='o') {
                countO++;
            }
             if (user.charAt(i)=='U' || user.charAt(i)=='u') {
                countU++;
            }
        }
        System.out.println("Your vowels in string Below :");

        System.out.println("How many A in your string : There are "+countA+" A in your string.");
        System.out.println("How many E in your string : There are "+countE+" E in your string.");
        System.out.println("How many I in your string : There are "+countI+" I in your string.");
        System.out.println("How many O in your string : There are "+countO+" O in your string.");
        System.out.println("How many U in your string : There are "+countU+" U in your string.");
    }
}
