package classAndObject.Level2;
import java.util.Scanner;
// Class to store movie ticket details and manage ticket booking
public class MovieTicket {
    String movieName = "";
    String seatNumber = "";
    double price = 0;
    public void bookTicket(String seat, double ticketPrice) {
        if (seat.isBlank() || ticketPrice <= 0) {
            System.out.println("Invalid seat number or ticket price");
        } else {
            seatNumber = seat;
            price = ticketPrice;
            System.out.println("Ticket booked successfully");
        }
    }
    public void display() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Price: " + price);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieTicket ticket = new MovieTicket();
        System.out.print("Enter movie name: ");
        ticket.movieName = scanner.nextLine();
        System.out.print("Enter seat number: ");
        String seat = scanner.nextLine();
        System.out.print("Enter ticket price: ");
        double price = scanner.nextDouble();
        ticket.bookTicket(seat, price);
        ticket.display();
    }
}