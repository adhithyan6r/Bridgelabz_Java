package Inheritance.Library;
// Class to run the library management program
public class LibraryManagement {
    public static void main(String[] args) {
        Author author = new Author(
                "Book1",
                2024,
                "author1",
                "The best book ever made"
        );
        author.displayInfo();
    }
}