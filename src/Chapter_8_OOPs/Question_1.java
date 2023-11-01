package Chapter_8_OOPs;
/*
    Create a Java class called Person with attributes for a person's name and age.
     Write a constructor to initialize these attributes and a method to display the person's information.
 */

import java.util.Scanner;

class Person{
    String name;
    int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public  void  display(){
        System.out.println("The name of the Person is : "+name);
        System.out.println("The age of the Person is : "+age);
    }
}

public class Question_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter your name here : ");
        String name=scanner.nextLine();

        System.out.print("Enter age your here : ");
        int age=scanner.nextInt();

        Person person=new Person(name,age);
        person.display();
    }
}
