package encapsulationAbstractPolymorphismInterface.EmployeeManagement;
// Class to represent a full-time employee
public class FullTimeEmployee extends Employee implements Department {
    private double fixedSalary;
    private String department;
    public FullTimeEmployee(int employeeId, String name, double baseSalary, double fixedSalary) {
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }
    public double getFixedSalary() {
        return fixedSalary;
    }
    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }
    @Override
    public double calculateSalary() {
        return fixedSalary;
    }
    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }
    @Override
    public String getDepartmentDetails() {
        return department;
    }
}