package Inheritance.Employee;
// Class to represent common details and behavior of all employees
public class Employee {
    String name;
    int id;
    double salary;
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}