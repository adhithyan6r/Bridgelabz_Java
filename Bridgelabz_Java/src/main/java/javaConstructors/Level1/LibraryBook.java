package javaConstructors.Level1;
// Class to store library book details and manage book borrowing
public class LibraryBook {
    String title;
    String author;
    double price;
    boolean availability;
    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
    }
    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book is not available");
        }
    }
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + availability);
    }
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Java Programming", "James Gosling", 500);
        book.display();
        book.borrowBook();
        book.display();
    }
}