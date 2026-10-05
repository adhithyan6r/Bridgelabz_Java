package encapsulationAbstractPolymorphismInterface.VehicleRental;
import java.util.ArrayList;
// Class to run the vehicle rental system
public class VehicleRental {
    public static void main(String[] args) {
        Car car = new Car("CAR101", "Car", 2000, "CAR-POL-101");
        Bike bike = new Bike("BIKE101", "Bike", 800, "BIKE-POL-101");
        Truck truck = new Truck("TRUCK101", "Truck", 4000, "TRUCK-POL-101");
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);
        int days = 3;
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Rental Cost: " + vehicle.calculateRentalCost(days));
            Insurable insurable = (Insurable) vehicle;
            System.out.println("Insurance Cost: " + insurable.calculateInsurance());
            System.out.println(insurable.getInsuranceDetails());
            System.out.println();
        }
    }
}