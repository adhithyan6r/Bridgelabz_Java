package javaMethods.Level3;
// Problem: Calculate the bonus, new salary, total old salary, total new salary, and total bonus for 10 employees.
public class SalaryBonus {
    // Method: Generate sallary and years of service for 10 employees
    public static int[][] generateEmployeeData() {
        int[][] employeeData = new int[10][2];
        for (int i = 0; i < employeeData.length; i++) {
            // Generate a random 5-digit salary
            employeeData[i][0] = 10000 + (int) (Math.random() * 90000);
            // Generate random years of service from 1 to 20
            employeeData[i][1] = 1 + (int) (Math.random() * 20);
        }
        return employeeData;
    }
    // Method: Calculate new salary and bonus for each employee.
    public static double[][] calculateBonus(int[][] employeeData) {
        double[][] result = new double[employeeData.length][2];
        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonusRate;
            if (yearsOfService > 5) {
                bonusRate = 0.05;
            } else {
                bonusRate = 0.02;
            }
            double bonus = oldSalary * bonusRate;
            double newSalary = oldSalary + bonus;
            result[i][0] = newSalary;
            result[i][1] = bonus;
        }
        return result;
    }
    // Method: Calculate total old salary, new salary, and bonus.
    public static double[] calculateTotals(
            int[][] employeeData,
            double[][] result) {
        double oldSalaryTotal = 0;
        double newSalaryTotal = 0;
        double bonusTotal = 0;
        for (int i = 0; i < employeeData.length; i++) {
            oldSalaryTotal += employeeData[i][0];
            newSalaryTotal += result[i][0];
            bonusTotal += result[i][1];
        }
        return new double[]{
                oldSalaryTotal,
                newSalaryTotal,
                bonusTotal
        };
    }
    // Method: Display employee salary details in tabular format.
    public static void displayEmployeeData(
            int[][] employeeData,
            double[][] result) {
        System.out.println("Employee\tOld Salary\tYears\tNew Salary\tBonus");
        for (int i = 0; i < employeeData.length; i++) {
            System.out.printf("%d\t\t%d\t\t%d\t%.2f\t\t%.2f%n",
                    i + 1,
                    employeeData[i][0],
                    employeeData[i][1],
                    result[i][0],
                    result[i][1]
            );
        }
    }
    public static void main(String[] args) {
        // Input: Generate salary and service data for 10 employes
        int[][] employeeData = generateEmployeeData();
        double[][] result = calculateBonus(employeeData);
        displayEmployeeData(employeeData, result);
        double[] totals = calculateTotals(employeeData, result);
        System.out.println("\nTotal Old Salary: " + totals[0]);
        System.out.println("Total New Salary: " + totals[1]);
        System.out.println("Total Bonus: " + totals[2]);
    }
}