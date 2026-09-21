import java.util.Scanner;
public class poundsToKilogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter pounds: ");
        double pounds = scanner.nextDouble();
        double kilograms = pounds / 2.2;
        System.out.println("the weight of the person in pound is " + pounds + " and in kg is " + kilograms);
    }
}
