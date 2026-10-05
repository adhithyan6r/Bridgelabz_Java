package encapsulationAbstractPolymorphismInterface.Library;
// Class to represent a magazine in the library
public class Magazine extends LibraryItem {
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }
    @Override
    public int getLoanDuration() {
        return 7;
    }
}