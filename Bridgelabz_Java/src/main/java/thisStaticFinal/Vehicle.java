package thisStaticFinal;
// Class to manage vehicle registration using static, this, final and instanceof
public class Vehicle {
    static double registrationFee = 1500;
    String ownerName;
    String vehicleType;
    final String registrationNumber;
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
    public void displayDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
    }
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Adhi", "Car", "TN01AB1234");
        Vehicle.updateRegistrationFee(2000);
        if (vehicle instanceof Vehicle) {
            vehicle.displayDetails();
        }
    }
}