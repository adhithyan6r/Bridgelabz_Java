package javaConstructors.InstanceVsClassVariables;
// Class to manage vehicle details and registration fee
public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 1500;
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }
    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Adhi", "Car");
        Vehicle vehicle2 = new Vehicle("Rahul", "Bike");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(2000);
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}