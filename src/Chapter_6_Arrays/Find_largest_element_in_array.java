package Chapter_6_Arrays;

import java.util.Scanner;

/*
    Write a Java program to find the largest element in an integer array.
 */
public class Find_largest_element_in_array {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int size=scanner.nextInt();

        int [] greater=new int[size];

        for (int i=0;i<size;i++){
            System.out.println("Enter the number at "+(i+1)+" Position : ");
            greater[i]=scanner.nextInt();
        }
        int great=greater[0];
        for (int i=1;i<size;i++){
            if(greater[i]>great) {
                great = greater[i];
            }
        }
        System.out.println("Largest number in array is : "+great);
    }
}
