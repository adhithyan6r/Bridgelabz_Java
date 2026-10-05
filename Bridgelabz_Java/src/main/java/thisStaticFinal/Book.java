package thisStaticFinal;
// Class to manage library books using static, this, final and instanceof
public class Book {
    static String libraryName = "City Library";
    String title;
    String author;
    final String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
    public static void main(String[] args) {
        Book book = new Book("Java Programming", "James Gosling", "ISBN101");
        Book.displayLibraryName();
        if (book instanceof Book) {
            book.displayDetails();
        }
    }
}