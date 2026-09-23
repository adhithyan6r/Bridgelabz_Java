package javaControlFlow.Level2;
import java.util.Scanner;
public class BmiCalculation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight:");
        double weight = scanner.nextDouble();
        System.out.print("Enter height:");
        double heightCm = scanner.nextDouble();
        double heightMeter = heightCm / 100;
        double bmi = weight / (heightMeter * heightMeter);
        System.out.println("BMI: " + bmi);
        if (bmi < 18.5) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi < 25) {
            System.out.println("Weight Status: Normal");
        } else if (bmi < 40) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obese");
        }
    }
}