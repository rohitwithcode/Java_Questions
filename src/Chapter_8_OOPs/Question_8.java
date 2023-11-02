package Chapter_8_OOPs;
/*
    Implement a class Library that manages a collection of books.
    Include methods to add books, remove books, and search for books by title or author.
 */

import java.util.Scanner;

class  Library{
    String [] books;
    int count=0;

    String title;
    String author;
    Library(String title,String author){
        this.title=title;
        this.author=author;
    }
    public  String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    @Override
    public String toString(){
        return "Book "+ title +" By "+author;
    }
}

public class Question_8 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("How many books wants you to add : ");
        int size=scanner.nextInt();
        scanner.nextLine();

        Library []  library=new Library[size];

        int bookNumber=0;

        while (true){

            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Search Book by Author");
            System.out.println("5. Exit");

            System.out.print("Enter your choice : ");
            int choice=scanner.nextInt();
            scanner.nextLine();

            switch (choice){

                case 1:
                    if (bookNumber<size){

                        System.out.print("Enter the title of the book : ");
                        String title=scanner.nextLine();

                        System.out.print("Enter the author of the book : ");
                        String author=scanner.nextLine();

                        library[bookNumber]= new Library(title,author);
                        bookNumber++;
                        System.out.println("Book added successfully.");
                    }
                    else{
                        System.out.println("Library is Full.You can't add book");
                    }
                    break;

                case 2:
                    System.out.println("Enter the title of the book to remove book : ");
                    String titleToRemove=scanner.nextLine();
                    boolean bookRemoved=false;
                    for (int i=0;i<bookNumber;i++){
                        if (library[i] != null && library[i].getTitle().equalsIgnoreCase(titleToRemove)){
                            System.out.println("Book Removed "+library[i]);
                            library[i]=null;
                            bookRemoved=true;
                            break;
                        }
                    }
                    if (!bookRemoved){
                        System.out.println("Book not found in the library.");
                    }
                    break;

                case 3:
                    System.out.println("Enter the title of the book for search book : ");
                    String titleToSearch=scanner.nextLine();

                    for (int i=0;i<bookNumber;i++){
                        if (library[i] != null && library[i].getTitle().equalsIgnoreCase(titleToSearch)){
                            System.out.println("Book Found : "+library[i]);
                        }
                        else {
                            System.out.println("This title "+titleToSearch+" Book not found in the library.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Enter the author of the book for search book : ");
                    String authorToSearch=scanner.nextLine();

                    for (int i=0;i<bookNumber;i++){
                        if (library[i] != null && library[i].getAuthor().equalsIgnoreCase(authorToSearch)){
                            System.out.println("Book Found : "+library[i]);
                        }
                        else{
                            System.out.println("Book is not present int the library.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting the Library .");
                    System.exit(0);

                default:
                    System.out.println("Enter valid input to perform any task.Please try again");

            }

        }


    }
}
