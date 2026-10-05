package encapsulationAbstractPolymorphismInterface.VehicleRental;
// Class to represent a car available for rental
public class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;
    public Car(String vehicleNumber, String type, double rentalRate,
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
        return 1500;
    }
    @Override
    public String getInsuranceDetails() {
        return "Car insurance: 1500";
    }
}