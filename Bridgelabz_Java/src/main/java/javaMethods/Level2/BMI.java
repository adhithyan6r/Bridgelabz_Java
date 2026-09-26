package javaMethods.Level2;
import java.util.Scanner;
// Problem: Calculate BMI for 10 team members using weight,height,and BMI values stored in a 2D array.
public class BMI {
    // Method to calculate BMI using weight in kg and height in meters.
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
    // Method to return BMI status for all team members
    public static String[] getBMIStatus(double[][] teamData) {
        String[] status = new String[teamData.length];
        for (int i = 0; i < teamData.length; i++) {
            double bmi = teamData[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25) {
                status[i] = "Normal";
            } else if (bmi < 40) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] teamData = new double[10][3];
        for (int i = 0; i < 10; i++) {
            // Input: Take weight and height of each team member
            System.out.print("Enter weight of member " + (i + 1) + " in kg: ");
            teamData[i][0] = scanner.nextDouble();
            System.out.print("Enter height of member " + (i + 1) + " in cm: ");
            teamData[i][1] = scanner.nextDouble();
            double heightInMeters = teamData[i][1] / 100;
            teamData[i][2] = calculateBMI(teamData[i][0], heightInMeters);
        }
        String[] status = getBMIStatus(teamData);
        for (int i = 0; i < 10; i++) {
            System.out.println(
                    "Member " + (i + 1) +
                            " BMI: " + teamData[i][2] +
                            " - " + status[i]
            );
        }
    }
}