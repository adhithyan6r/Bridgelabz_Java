package encapsulationAbstractPolymorphismInterface.Library;
// Class to represent a DVD in the library
public class DVD extends LibraryItem {
    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }
    @Override
    public int getLoanDuration() {
        return 3;
    }
}