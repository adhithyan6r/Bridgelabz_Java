import java.util.Scanner;
public class celsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("the " + celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}
