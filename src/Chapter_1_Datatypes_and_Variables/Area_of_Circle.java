package Chapter_1_Datatypes_and_Variables;

import java.util.Scanner;

public class Area_of_Circle {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Radius : ");
        int radius=scanner.nextInt();

        double area=Math.PI*radius*radius;

        System.out.println("The area of circle is : "+area);
    }
}
