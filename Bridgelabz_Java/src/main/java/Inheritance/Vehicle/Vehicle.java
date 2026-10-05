package Inheritance.Vehicle;
// Class to represent common properties and behavior of all vehicles
public class Vehicle {
    int maxSpeed;
    String fuelType;
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    public void displayInfo() {
        System.out.println("Maximum Speed: " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
    }
}