package javaConstructors.Level1;

// Class to initialize and manage hotel booking details using different constructors
public class Hotel {
    String guestName;
    String roomType;
    int nights;

    public Hotel() {
        guestName = "Unknown";
        roomType = "Standard";
        nights = 1;
    }

    public Hotel(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public Hotel(Hotel booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    public void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {
        Hotel booking1 = new Hotel();
        Hotel booking2 = new Hotel("Adhi", "Deluxe", 3);
        Hotel booking3 = new Hotel(booking2);

        booking1.display();
        booking2.display();
        booking3.display();
    }
}