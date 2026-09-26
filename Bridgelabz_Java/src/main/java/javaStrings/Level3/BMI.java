package javaStrings.Level3;

import java.util.Scanner;

// Problem: Find the BMI and display the height, weight, BMI, and status of each individual
public class BMI{
    // To calculate BMI and status for every person
    public static String[][] calculateBMI(double[][] people) {
        String[][] result = new String[people.length][4];

        for (int i = 0; i < people.length; i++) {
            double weight = people[i][0];
            double heightInMeter = people[i][1] / 100;
            double bmi = weight / (heightInMeter * heightInMeter);
            String status;

            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal";
            } else if (bmi < 40) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            result[i][0] = String.valueOf(people[i][1]);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }

        return result;
    }

    // To display the BMI details in tabular format
    public static void displayBMI(String[][] result) {
        System.out.println("\nHeight\tWeight\tBMI\tStatus");

        for (String[] person : result) {
            System.out.println(
                    person[0] + "\t" +
                            person[1] + "\t" +
                            person[2] + "\t" +
                            person[3]
            );
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] people = new double[10][2];

        // Input: Take weight and height for 10 people
        for (int i = 0; i < people.length; i++) {
            System.out.println("Person " + (i + 1));

            System.out.print("Enter weight in kg: ");
            people[i][0] = scanner.nextDouble();

            System.out.print("Enter height in cm: ");
            people[i][1] = scanner.nextDouble();
        }

        String[][] result = calculateBMI(people);
        displayBMI(result);

        scanner.close();
    }
}