package javaConstructors.AccessModifiers;
// Class to manage employee details and demonstrate access modifiers
class Employee {
    public int employeeID;
    protected String department;
    private double salary;
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
}
// Class to demonstrate protected member access
class Manager extends Employee {
    public void display() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
    }
}
// Class to run the employee records program
public class EmployeeRecords {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.employeeID = 101;
        manager.department = "IT";
        manager.setSalary(50000);
        manager.display();
    }
}