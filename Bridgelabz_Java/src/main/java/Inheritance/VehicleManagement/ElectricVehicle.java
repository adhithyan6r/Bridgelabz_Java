package Inheritance.VehicleManagement;
// Class to represent an electric vehicle that inherits from Vehicle
public class ElectricVehicle extends Vehicle {
    int batteryCapacity;
    public ElectricVehicle(String brand, int speed, int batteryCapacity) {
        super(brand, speed);
        this.batteryCapacity = batteryCapacity;
    }
    public void charge() {
        System.out.println("Electric vehicle is charging");
    }

    public void displayDetails() {
        System.out.println("Vehicle Type: Electric Vehicle");
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
        charge();
    }
}