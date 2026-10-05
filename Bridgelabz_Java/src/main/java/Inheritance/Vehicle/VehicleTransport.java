package Inheritance.Vehicle;
// Class to run the vehicle transport program and demonstrate polymorphism
public class VehicleTransport {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car(200, "Petrol", 5),
                new Truck(120, "Diesel", 10),
                new Motorcycle(150, "Petrol", true)
        };
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }
    }
}