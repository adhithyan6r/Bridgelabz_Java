package Inheritance.Vehicle;
// Class to represent a truck that inherits from Vehicle
public class Truck extends Vehicle {
    double loadCapacity;
    public Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}