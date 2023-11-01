package Chapter_8_OOPs;
/*
    Develop a class Book with attributes for the book title, author, and price.
    Write a constructor to initialize these attributes and a method to display the book details.
 */

import java.util.Scanner;

class Book{
    String bookTitle;
    String bookAuthor;
    float bookPrice;
    Scanner scanner=new Scanner(System.in);
    Book(){
        System.out.print("Enter the Book Title : ");
        bookTitle=scanner.nextLine();

        System.out.print("Enter the Book Author : ");
        bookAuthor=scanner.nextLine();

        System.out.print("Enter the Book Price : ");
        bookPrice= Float.parseFloat(scanner.nextLine());
    }

    public void displayBookDetails(){
        System.out.println("The Title of the Book is : "+bookTitle);
        System.out.println("The Author of the Book is : "+bookAuthor);
        System.out.println("The Price of the Book is : "+bookPrice);
    }
}

public class Question_6 {
    public static void main(String[] args) {
        Book book=new Book();

        book.displayBookDetails();
        book.scanner.close();
    }
}
