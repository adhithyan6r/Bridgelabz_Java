package encapsulationAbstractPolymorphismInterface.RideHailing;
// Abstract class to store common ride details and behavior
public abstract class Ride {
    private int rideId;
    private String passengerName;
    private double distance;
    public Ride(int rideId, String passengerName, double distance) {
        this.rideId = rideId;
        this.passengerName = passengerName;
        this.distance = distance;
    }
    public int getRideId() {
        return rideId;
    }
    public void setRideId(int rideId) {
        if (rideId > 0) {
            this.rideId = rideId;
        }
    }
    public String getPassengerName() {
        return passengerName;
    }
    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }
    public double getDistance() {
        return distance;
    }
    public void setDistance(double distance) {
        if (distance > 0) {
            this.distance = distance;
        }
    }
    // To calculate the fare for the ride
    public abstract double calculateFare();
    // To display ride details
    public void displayDetails() {
        System.out.println("Ride ID: " + rideId);
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Distance: " + distance);
    }
}