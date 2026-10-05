package Inheritance.Library;
// Class to represent common details of a book
public class Book {
    String title;
    int publicationYear;
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("published year: " + publicationYear);
    }
}
