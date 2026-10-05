package thisStaticFinal;
// Class to manage employees using static, this, final and instanceof
public class Employee {
    static String companyName = "ABC Technologies";
    static int totalEmployees = 0;
    String name;
    final int id;
    String designation;
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    public void displayDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
    }
    public static void main(String[] args) {
        Employee employee1 = new Employee("Adhi", 101, "Developer");
        Employee employee2 = new Employee("Rahul", 102, "Tester");
        if (employee1 instanceof Employee) {
            employee1.displayDetails();
        }
        if (employee2 instanceof Employee) {
            employee2.displayDetails();
        }
        Employee.displayTotalEmployees();
    }
}