package Chapter_6_Arrays;

import java.util.Scanner;

/*
    Create a Java program to search for a specific element in an array index.
     If the element is not in the array, print the number is not present in array.
 */
public class Searching_element_in_array {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size=scanner.nextInt();

        int [] search=new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter the number at "+(i+1)+" Position : ");
            search[i]=scanner.nextInt();
        }

        System.out.println("Enter the number which you want to search : ");
        int numberForSearch=scanner.nextInt();

        boolean present=false;

        for (int i=0;i<size;i++){
            if (search[i]==numberForSearch){
                present=true;
                break;
            }
        }
        if (present){
            System.out.print("The number "+numberForSearch+" is present in array.");
        }
        else {
            System.out.print("The number "+numberForSearch+" is present in array.");
        }
    }
}
