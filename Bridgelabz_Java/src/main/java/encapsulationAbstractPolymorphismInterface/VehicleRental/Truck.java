package encapsulationAbstractPolymorphismInterface.VehicleRental;
// Class to represent a truck available for rental
public class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    public Truck(String vehicleNumber, String type, double rentalRate,
                 String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    public String getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }
    public void setInsurancePolicyNumber(String insurancePolicyNumber) {
        this.insurancePolicyNumber = insurancePolicyNumber;
    }
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    @Override
    public double calculateInsurance() {
        return 3000;
    }
    @Override
    public String getInsuranceDetails() {
        return "Truck insurance: 3000";
    }
}