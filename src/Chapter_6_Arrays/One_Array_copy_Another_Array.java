package Chapter_6_Arrays;

import java.util.Scanner;

/*
    Write a Java program to copy the elements of one array into another array.
 */
public class One_Array_copy_Another_Array {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size=scanner.nextInt();

        int [] original=new int[size];

        for (int i=0;i<size;i++){
            System.out.println("Enter the number at position "+(i+1));
            original[i]=scanner.nextInt();
        }

        int [] copyOriginal=new int[size];

        for (int i=0;i<size;i++){
            copyOriginal[i]=original[i];
            System.out.print("\nNumber at position "+(i+1)+" is "+copyOriginal[i]+"\n");
        }
    }
}
