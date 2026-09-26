package javaMethods.Level2;
import java.util.Arrays;
import java.util.Scanner;
// Problem: Find the roots of a quadratic equation using the discriminant and return the roots as an array
public class QuadraticRoots {
    // Method tp calculate and return the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double discriminant = Math.pow(b, 2) - (4 * a * c);
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return new double[]{root1, root2};
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            return new double[]{};
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: get vals of a, b, and c from the user
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        double[] roots = findRoots(a, b, c);
        System.out.println("Roots: " + Arrays.toString(roots));
    }
}