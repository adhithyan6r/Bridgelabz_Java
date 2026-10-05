package encapsulationAbstractPolymorphismInterface.Library;
import java.util.ArrayList;
// Class to run the library management system
public class LibraryManagement {
    public static void main(String[] args) {
        Book book = new Book(101, "book1", "Author1");
        Magazine magazine = new Magazine(102, "Book2", "Authoe2");
        DVD dvd = new DVD(103, "book3", "Author3");
        ArrayList<LibraryItem> items = new ArrayList<>();
        items.add(book);
        items.add(magazine);
        items.add(dvd);
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println();
        }
    }
}