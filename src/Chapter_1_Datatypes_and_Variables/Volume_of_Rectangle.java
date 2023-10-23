package Chapter_1_Datatypes_and_Variables;

import java.util.Scanner;

public class Volume_of_Rectangle {
    public static void main(String[] args) {

        System.out.println("Volume of the Rectangle : ");

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the Length of the Rectangle : ");
        float Length=scanner.nextFloat();

        System.out.println("Enter the Width of the Rectangle : ");
        float width=scanner.nextFloat();

        System.out.println("Enter the Height of the Rectangle : ");
        float height = scanner.nextFloat();

        double volume=Length*width*height;

        System.out.println("The Volume of the Rectangle : "+volume);


    }
}
