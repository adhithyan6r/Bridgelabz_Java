import java.util.Scanner;
public class fahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("the " + fahrenheit + " Fahrenheit is " + celsius + " Celsius");
    }
}
