package Chapter_7_Methods;

import java.util.Scanner;

/*
    Write a method that reverses an array of strings.
     The method should take an array of strings as a parameter and return a new array with the elements reversed.
 */
public class WAP_to_reversed_string {
    public String [] stringRevered(String [] str){
        String [] reversedArray=new String[str.length];
        int j=0;
        for (int i=str.length-1;i>=0;i--){
            reversedArray[j]=str[i];
            j++;
        }
        return reversedArray;
    }
    public static void main(String[] args) {

        WAP_to_reversed_string wap_to_reversed_string=new WAP_to_reversed_string();

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size=scanner.nextInt();

        String  [] str=new String[size];

        for (int i=0;i<str.length;i++){
            System.out.print("Enter your string : ");
            str[i]=scanner.nextLine();
        }

        String [] revered= wap_to_reversed_string.stringRevered(str);

        for (String s:revered) {
            System.out.println(s);
        }
    }
}
