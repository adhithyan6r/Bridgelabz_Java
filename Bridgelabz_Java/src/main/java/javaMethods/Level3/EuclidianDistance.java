package javaMethods.Level3;
import java.util.Arrays;
import java.util.Scanner;
// Problem: Find the Euclidean distance between two points and the equation of the line passing through them.
public class EuclidianDistance {
    // Method to Calculate the Euclideanvdistance between two points
    public static double findDistance(double x1, double y1, double x2, double y2) {
        double xDifference = x2 - x1;
        double yDifference = y2 - y1;
        return Math.sqrt(
                Math.pow(xDifference, 2) +
                        Math.pow(yDifference, 2)
        );
    }
    // Method to Find the slope
    public static double[] findLineEquation(
            double x1, double y1,
            double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);
        double yIntercept = y1 - slope * x1;
        return new double[]{slope, yIntercept};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take coordinates of the first point
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        // Input: Take coordinates of the sevond point
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        double distance = findDistance(x1, y1, x2, y2);
        double[] line = findLineEquation(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);
        System.out.println("Slope and Y-Intercept: " + Arrays.toString(line));
        System.out.println(
                "Equation of Line: y = " + line[0] + "x + " + line[1]);
    }
}