package Chapter_7_Methods;

import java.util.Scanner;

/*
    Create a method that computes the average of an array of integers.
     The method should take an array of integers as a parameter and return the average.
 */
public class Average_of_array {
    public  static float Average(int [] array){
        int count=0;
        float store=0f;
        for (int j : array) {
            store = store + j;
            count++;
        }
        return store/count;
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size=scanner.nextInt();

        int [] average=new int[size];

        for (int i=0;i<size;i++){
            System.out.print("Enter the element at index "+(i+1)+" : ");
            average[i]=scanner.nextInt();
        }

        float a=Average(average);

        System.out.println("\nThe average of the array elements : "+a);
    }
}
