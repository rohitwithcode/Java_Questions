package Chapter_8_OOPs;
/*
    Implement a class hierarchy with a base class Shape and two subclasses, Circle and Rectangle.
     Provide methods in each class to calculate the area.
 */

import java.util.Scanner;

class Shape{
    Scanner scanner=new Scanner(System.in);
    public void areaSquare(){
        System.out.println("Area of the Square given below : ");
        System.out.println("Enter the side of the square : ");
        double side=scanner.nextInt();
        double area=side*side;
        System.out.println("The area of the square is : "+area);
    }
}
class Circle extends Shape{
    public void areaCircle(){
        System.out.println("The area of the Circle is given below : ");
        System.out.println("Enter the radius of  the circle : ");
        double radius = scanner.nextInt();

        double area=Math.PI*radius*radius;
        System.out.println("The are of the circle is : "+area);
    }
}

class Rectangle extends Shape{
    public void areaRectangle(){
        System.out.println("The area of the rectangle is given below : ");

        System.out.println("Enter the radius of the Rectangle : ");
        double radius=scanner.nextInt();

        System.out.println("Enter the height of the Rectangle : ");
        double height=scanner.nextInt();

        double area=Math.PI*radius*radius*height;
        System.out.println("The area of the Rectangle is : "+area);
    }
}

public class Question_2 {
    public static void main(String[] args) {

        Circle circle=new Circle();
        circle.areaCircle();
        circle.areaSquare();

        Rectangle rectangle=new Rectangle();
        rectangle.areaRectangle();
        rectangle.areaSquare();
        rectangle.scanner.close();
    }
}
