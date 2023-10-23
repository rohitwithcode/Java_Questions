package Chapter_1_Datatypes_and_Variables;

import java.util.Scanner;

public class Area_of_Triangle {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the height of the Triangle : ");
        float height=scanner.nextFloat();

        System.out.println("Enter Breadth of the Triangle : ");
        float breadth=scanner.nextFloat();

        double area=(breadth*height)*1/2;

        System.out.println("The area of the Triangle "+breadth+" and "+height+" is : "+area);

    }
}
