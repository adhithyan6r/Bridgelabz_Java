package Inheritance.Employee;

// Class to run the employee management program and demonstrate polymorphism
public class EmployeeManagement {
    public static void main(String[] args) {
        Employee manager = new Manager("Adhi", 101, 60000, 5);
        Employee developer = new Developer("TonyDog", 102, 50000, "Java");
        Employee intern = new Intern("Gautham", 103, 20000, "ABC College");

        manager.displayDetails();
        System.out.println();

        developer.displayDetails();
        System.out.println();

        intern.displayDetails();
    }
}