package Chapter_6_Arrays;

import java.util.Scanner;

/*
    Create a Java program that takes an array of integers and returns the array with its elements reversed.
 */
public class Array_Reversed {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the size of array ; ");
        int size=scanner.nextInt();

        int [] reverse=new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter the number at "+(i+1)+" position : ");
            reverse[i]=scanner.nextInt();
        }

        for (int i=size-1;i>=0;i--){
            System.out.println("The number at "+(i+1)+" Position is "+reverse[i]);
        }
    }
}
