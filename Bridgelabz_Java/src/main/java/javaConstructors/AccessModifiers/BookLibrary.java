package javaConstructors.AccessModifiers;
// Class to manage book details and demonstrate access modifiers
class Book {
    public String ISBN;
    protected String title;
    private String author;
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
// Class to demonstrate protected member access
class EBook extends Book {
    public void display() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + getAuthor());
    }
}
// Class to run the book library program
public class BookLibrary {
    public static void main(String[] args) {
        EBook book = new EBook();
        book.ISBN = "978-1234567890";
        book.title = "Java Programming";
        book.setAuthor("James Gosling");
        book.display();
    }
}