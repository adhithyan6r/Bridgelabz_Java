package javaConstructors.Level1;

public class Book {
    String title;
    String author;
    double price;

    Book(){
        title = "Unknown";
        author = "anonymous";
        price = 100;
    }
    Book(String t, String a, int p){
        title = t;
        author = a;
        price = p;
    }
    void display(){
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println("Price : "+price);
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("My First Book","Adhi" ,200);
        book1.display();
        book2.display();
    }
 }
