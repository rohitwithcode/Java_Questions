package Chapter_6_Arrays;

import java.util.Scanner;

/*
    Write a Java program that performs matrix addition and multiplication for two-dimensional arrays.
 */
public class Matrix_addition_multiplication {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the size of the outer array : ");
        int sizeOuterArrayForFirstMatrix=scanner.nextInt();

        System.out.println("Enter the size of the inner array : ");
        int sizeInnerArrayForFirstMatrix=scanner.nextInt();

        int [][] firstMatrix=new int[sizeOuterArrayForFirstMatrix][sizeInnerArrayForFirstMatrix];

        for (int i=0;i<sizeOuterArrayForFirstMatrix;i++){
            for (int j=0;j<sizeInnerArrayForFirstMatrix;j++){
                System.out.print("Enter the element at ("+i+" "+j+") index : ");
                firstMatrix[i][j]=scanner.nextInt();
            }
        }
        System.out.println("First Matrix given below : ");
        for (int i=0;i<sizeOuterArrayForFirstMatrix;i++){
            for (int j=0;j<sizeInnerArrayForFirstMatrix;j++){
                System.out.print(firstMatrix[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Enter the size of the outer array : ");
        int sizeOuterArrayForSecondMatrix=scanner.nextInt();

        System.out.println("Enter the size of the inner array : ");
        int sizeInnerArrayForSecondMatrix=scanner.nextInt();

        int [][] secondMatrix=new int[sizeOuterArrayForSecondMatrix][sizeInnerArrayForSecondMatrix];

        for (int i=0;i<sizeOuterArrayForSecondMatrix;i++){
            for (int j=0;j<sizeInnerArrayForSecondMatrix;j++){
                System.out.print("Enter the element at ("+i+" "+j+") index : ");
                secondMatrix[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Second Matrix given below : ");
        for (int i=0;i<sizeOuterArrayForSecondMatrix;i++){
            for (int j=0;j<sizeInnerArrayForSecondMatrix;j++){
                System.out.print(secondMatrix[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Enter the size of the outer array : ");
        int sizeOuterArrayOfSumMatrix=scanner.nextInt();

        System.out.println("Enter the size of the inner array : ");
        int sizeInnerArrayOfSumMatrix=scanner.nextInt();
        int [][] sumOfMatrix=new int[sizeOuterArrayOfSumMatrix][sizeInnerArrayOfSumMatrix];

        for (int i=0;i<sizeOuterArrayOfSumMatrix;i++){
            for (int j=0;j<sizeInnerArrayOfSumMatrix;j++){
                sumOfMatrix[i][j]=firstMatrix[i][j]+secondMatrix[i][j];
            }
        }
        System.out.println("Sum of  Matrix given below : ");
        for(int i=0;i<sizeOuterArrayOfSumMatrix;i++){
            for (int j=0;j<sizeInnerArrayOfSumMatrix;j++){
                System.out.print(sumOfMatrix[i][j]+" ");
            }
            System.out.println("");
        }
        for (int i=0;i<sizeOuterArrayOfSumMatrix;i++){
            for (int j=0;j<sizeInnerArrayOfSumMatrix;j++){
                sumOfMatrix[i][j]=firstMatrix[i][j]*secondMatrix[i][j];
            }
        }
        System.out.println("Multiplication of  Matrix given below : ");
        for(int i=0;i<sizeOuterArrayOfSumMatrix;i++){
            for (int j=0;j<sizeInnerArrayOfSumMatrix;j++){
                System.out.print(sumOfMatrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
