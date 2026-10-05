package encapsulationAbstractPolymorphismInterface.RideHailing;
// Class to represent a bike ride
public class BikeRide extends Ride implements FareCalculable {
    private double ratePerKm;
    public BikeRide(int rideId, String passengerName, double distance, double ratePerKm) {
        super(rideId, passengerName, distance);
        this.ratePerKm = ratePerKm;
    }
    public double getRatePerKm() {
        return ratePerKm;
    }
    public void setRatePerKm(double ratePerKm) {
        if (ratePerKm >= 0) {
            this.ratePerKm = ratePerKm;
        }
    }
    @Override
    public double calculateFare() {
        return getDistance() * ratePerKm;
    }
    @Override
    public String getFareDetails() {
        return "Bike fare: " + ratePerKm + " per km";
    }
}