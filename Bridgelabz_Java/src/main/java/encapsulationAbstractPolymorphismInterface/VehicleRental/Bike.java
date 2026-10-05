package encapsulationAbstractPolymorphismInterface.VehicleRental;
// Class to represent a bike available for rental
public class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    public Bike(String vehicleNumber, String type, double rentalRate,
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
        return 500;
    }
    @Override
    public String getInsuranceDetails() {
        return "Bike insurance: 500";
    }
}