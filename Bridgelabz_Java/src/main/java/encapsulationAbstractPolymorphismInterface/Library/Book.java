package encapsulationAbstractPolymorphismInterface.Library;
// Class to represent a book in the library
public class Book extends LibraryItem {
    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }
    @Override
    public int getLoanDuration() {
        return 14;
    }
}