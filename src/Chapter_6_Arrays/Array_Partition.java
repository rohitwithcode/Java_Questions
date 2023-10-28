package Chapter_6_Arrays;

import java.util.Scanner;

/*
    Create a Java program to partition an array into two sub-arrays, one containing even numbers and the other containing odd numbers.
 */
public class Array_Partition {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size=scanner.nextInt();

        int [] original=new int[size];
        int [] evenNumber;
        int [] oddNumber;

        for (int i=0;i<size;i++){
            System.out.print("Enter the number at position "+(i+1)+" : ");
            original[i]=scanner.nextInt();
        }
        System.out.println("Original Array ");
        for (int i=0;i<size;i++){
            System.out.print(original[i]+" ");
        }

        int countEven=0;
        int countOdd=0;

        for (int count: original){
            if (count%2==0){
                countEven++;
            }
            else{
                countOdd++;
            }
        }
        evenNumber=new int[countEven];
        oddNumber=new int[countOdd];

        int evenIndex=0;
        int oddIndex=0;
        for (int i=0;i<size;i++){
            if (original[i]%2==0){
                evenNumber[evenIndex]=original[i];
                evenIndex++;
            }
            else{
                oddNumber[oddIndex]=original[i];
                oddIndex++;
            }
        }
        System.out.println("\nEven Numbers given below : ");
        for (int i=0;i<countEven;i++){
            System.out.print(evenNumber[i]+" ");
        }
        System.out.println("\nOdd Numbers given below : ");
        for (int i=0;i<countOdd;i++){
            System.out.print(oddNumber[i]+" ");
        }
    }
}
