package encapsulationAbstractPolymorphismInterface.EmployeeManagement;
import java.util.ArrayList;
// Class to run the employee management system
public class EmployeeManagement {
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee =
                new FullTimeEmployee(101, "Adhi", 50000, 60000);
        PartTimeEmployee partTimeEmployee =
                new PartTimeEmployee(102, "Rahul", 20000, 80, 300);
        fullTimeEmployee.assignDepartment("IT");
        partTimeEmployee.assignDepartment("HR");
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(fullTimeEmployee);
        employees.add(partTimeEmployee);
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("Department: " +
                    ((Department) employee).getDepartmentDetails());
            System.out.println();
        }
    }
}