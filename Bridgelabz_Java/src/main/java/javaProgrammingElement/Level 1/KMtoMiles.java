import java.util.Scanner;
public class KMtoMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter kilometers: ");
        double km = scanner.nextDouble();
        double miles = km/1.6;
        System.out.println("The distance "+km+" km in miles is "+miles);
    }
}
