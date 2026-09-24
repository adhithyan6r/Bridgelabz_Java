package javaArrays.Level2;
import java.util.Arrays;
import java.util.Scanner;
public class BMI2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of peopls: ");
        int number = scanner.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.print("Enter weight: ");
            double weight = scanner.nextDouble();
            while (weight <= 0) {
                System.out.print("Enter a positive weight: ");
                weight = scanner.nextDouble();
            }
            System.out.print("Enter height: ");
            double height = scanner.nextDouble();
            while (height <= 0) {
                System.out.print("Enter a positive height: ");
                height = scanner.nextDouble();
            }
            double heightInMeter = height / 100;
            double bmi = weight / (heightInMeter * heightInMeter);
            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = bmi;
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal";
            } else if (bmi < 40) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("Person Data: " + Arrays.deepToString(personData));
        System.out.println("Weight Status: " + Arrays.toString(weightStatus));
    }
}