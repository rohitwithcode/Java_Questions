package Chapter_6_Arrays;

import java.util.Scanner;

/*
    Write a Java program to calculate the sum of all elements in an integer array
 */
public class Sum_of_numbers_using_array {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the size of array ; ");
        int size=scanner.nextInt();

        int [] number=new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter the number at "+(i+1)+" position : ");
            number[i]=scanner.nextInt();
        }
//        for (int show:number) {
//            System.out.println(show);
//        }

        for (int i=0;i<size;i++){
            System.out.println("Number at "+(i+1)+" Position is : "+number[i]);
        }

    }
}
