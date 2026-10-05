package Inheritance.VehicleManagement;
// Class to represent common details of vehicles
public class Vehicle {
    String brand;
    int speed;
    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}