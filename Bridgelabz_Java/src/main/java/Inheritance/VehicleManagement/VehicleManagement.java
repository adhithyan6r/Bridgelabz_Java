package Inheritance.VehicleManagement;
// Class to run the vehicle management program
public class VehicleManagement {
    public static void main(String[] args) {
        ElectricVehicle electricVehicle =
                new ElectricVehicle("Tesla", 200, 100);
        PetrolVehicle petrolVehicle =
                new PetrolVehicle("Toyota", 180, "Petrol");
        electricVehicle.displayDetails();
        System.out.println();
        petrolVehicle.displayDetails();
    }
}