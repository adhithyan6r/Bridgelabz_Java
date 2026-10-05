package javaConstructors.Level1;
// Class to initialize car rental details and calculate total rental cost
public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay;
    public CarRental() {
        this("Unknown", "Unknown", 1, 1000);
    }
    public CarRental(String customerName, String carModel, int rentalDays, double costPerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }
    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }
    public void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
    public static void main(String[] args) {
        CarRental rental1 = new CarRental();
        CarRental rental2 = new CarRental("Adhi", "BMW", 3, 5000);
        rental1.display();
        rental2.display();
    }
}