package Inheritance.VehicleManagement;
// Class to represent a petrol vehicle that inherits from Vehicle and implements Refuelable
public class PetrolVehicle extends Vehicle implements Refuelable {
    String fuelType;
    public PetrolVehicle(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }
    @Override
    public void refuel() {
        System.out.println("Petrol vehicle is being refueled");
    }
    public void displayDetails() {
        System.out.println("Vehicle Type: Petrol Vehicle");
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
        refuel();
    }
}