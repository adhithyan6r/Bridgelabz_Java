package encapsulationAbstractPolymorphismInterface.EmployeeManagement;
// Class to represent a part-time employee
public class PartTimeEmployee extends Employee implements Department {
    private int workHours;
    private double hourlyRate;
    private String department;
    public PartTimeEmployee(int employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }
    public int getWorkHours() {
        return workHours;
    }
    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double calculateSalary() {
        return workHours * hourlyRate;
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