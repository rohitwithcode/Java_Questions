package Chapter_7_Methods;

import java.util.Scanner;

/*
    Create a method that finds the maximum element in an array of integers.
    The method should take an array of integers as a parameter and return the maximum value.
 */
public class Find_maximum_values {
    public  static int maxValue(int [] maximumValue){

        int maximum=maximumValue[0];
        for (int i=1;i<maximumValue.length;i++){
            if (maximumValue[i]>maximum){
                maximum=maximumValue[i];
            }
        }
        return  maximum;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size=scanner.nextInt();

        int [] maximumValue=new int[size];

        for (int i=0;i<size;i++){
            System.out.print("Enter the element at index "+(i+1)+" : ");
            maximumValue[i]=scanner.nextInt();
        }

        int m=maxValue(maximumValue);

        System.out.println("The maximum value in array is : "+m);
    }
}
