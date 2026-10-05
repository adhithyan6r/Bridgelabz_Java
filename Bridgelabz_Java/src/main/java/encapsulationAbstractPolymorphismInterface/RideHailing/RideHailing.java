package encapsulationAbstractPolymorphismInterface.RideHailing;
import java.util.ArrayList;
// Class to manage rides using encapsulation and polymorphism
public class RideHailing {
    // To process different types of rides using one method
    public static void processRide(Ride ride) {
        ride.displayDetails();
        double fare = ride.calculateFare();
        System.out.println("Fare: " + fare);
        if (ride instanceof FareCalculable) {
            FareCalculable fareCalculable = (FareCalculable) ride;
            System.out.println(fareCalculable.getFareDetails());
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Ride> rides = new ArrayList<>();
        rides.add(new CarRide(101, "Adhi", 10, 20));
        rides.add(new BikeRide(102, "Rahul", 8, 10));
        for (Ride ride : rides) {
            processRide(ride);
        }
    }
}