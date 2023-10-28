package Chapter_6_Arrays;

import java.util.Scanner;

/*
    Write a Java program to remove a specific element from an array.
 */
public class Remove_element_from_specific_index {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size=scanner.nextInt();

        int [] original=new int[size];

        for (int i=0;i<size;i++){
            System.out.print("Enter the number at position "+(i+1)+" : ");
            original[i]=scanner.nextInt();
        }

        System.out.print("Enter the number which you want to delete it from array : ");
        int element=scanner.nextInt();

        System.out.println("Original Array before remove element "+element);
        for (int i=0;i<size;i++){
            System.out.print(original[i]+" ");
        }

        int [] newArray=new int[original.length-1];
        int index=0;

        for (int i=0;i<size;i++) {
            if (original[i] == element) {
                continue;
            } else {
                newArray[index] = original[i];
                index++;
            }
        }
        System.out.println("\nArray after remove number :"+element);
        for (int i=0;i<newArray.length;i++){
            System.out.print(newArray[i]+" ");
        }
    }
}
