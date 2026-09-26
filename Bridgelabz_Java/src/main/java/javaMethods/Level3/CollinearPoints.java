package javaMethods.Level3;
import java.util.Scanner;
// Problem: Check whether three points are collinear using the slope and area of triangle methods.
public class CollinearPoints {
    // Method: Check whether three points are collinear using slopes.
    public static boolean areCollinearUsingSlope(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }
    // Method to check whether three points are collinear using triangle area.
    public static boolean areCollinearUsingArea(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {
        double area = 0.5 * (
                x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)
        );
        return area == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take coordunates of point A
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        // Input: Take coordinates of point b
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        // Input: Take coordinates of point c
        System.out.print("Enter x3: ");
        double x3 = scanner.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = scanner.nextDouble();
        boolean slopeResult = areCollinearUsingSlope(
                x1, y1, x2, y2, x3, y3
        );
        boolean areaResult = areCollinearUsingArea(
                x1, y1, x2, y2, x3, y3
        );
        System.out.println("Colinear using Slope: " + slopeResult);
        System.out.println("Colinear using Area: " + areaResult);
    }
}