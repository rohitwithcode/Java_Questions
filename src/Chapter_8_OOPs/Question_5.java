package Chapter_8_OOPs;
/*
    Implement a class Student with attributes for a student's name, roll number, and an array to store the marks in five subjects.
     Provide a method to calculate and return the student's average mark.
 */

import java.util.Scanner;

class  Student{
    String studentName;
    int studentRollNumber;
    double [] marks=new double[5];

    Scanner scanner=new Scanner(System.in);

    Student(){
        System.out.println("Enter the name of the student : ");
        studentName=scanner.nextLine();

        System.out.println("Enter the student Roll Number : ");
        studentRollNumber=scanner.nextInt();

        System.out.println("Enter the student marks below : ");

    }

    public double marksAverage(){
        double averageOfMarks=0;
        int count=0;
        double average=0;
        for (int i=0;i<=marks.length-1;i++){
            System.out.println("Enter the marks subject "+(i+1));
            marks[i]=scanner.nextDouble();
        }

        for (int i=0;i<=marks.length-1;i++){
            averageOfMarks=averageOfMarks+marks[i];
            count++;
        }
        average=averageOfMarks/count;
        return  average;
    }

}

public class Question_5 {
    public static void main(String[] args) {
        Student student=new Student();

        double average=student.marksAverage();
        System.out.println("The average of teh student marks : "+average);

    }
}
