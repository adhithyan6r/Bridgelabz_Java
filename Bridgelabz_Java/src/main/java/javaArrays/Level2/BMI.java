package javaArrays.Level2;
import java.util.Arrays;
import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of peopls: ");
        int number = scanner.nextInt();
        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.print("Enter weight: ");
            weight[i] = scanner.nextDouble();
            System.out.print("Enter height; ");
            height[i] = scanner.nextDouble();
            double heightInMeter = height[i] / 100;
            bmi[i] = weight[i] / (heightInMeter * heightInMeter);
            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] < 25) {
                weightStatus[i] = "Normal";
            } else if (bmi[i] < 40) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("Weight: " + Arrays.toString(weight));
        System.out.println("Height: " + Arrays.toString(height));
        System.out.println("BMI: " + Arrays.toString(bmi));
        System.out.println("Weight Status: " + Arrays.toString(weightStatus));
    }
}