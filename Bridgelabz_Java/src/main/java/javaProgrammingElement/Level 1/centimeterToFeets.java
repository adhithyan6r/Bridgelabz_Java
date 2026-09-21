import java.util.Scanner;
public class centimeterToFeets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length in cm: ");
        double centimeters = scanner.nextDouble();
        double inches = centimeters / 2.54;
        double feet = inches / 12;
        System.out.println("Your height in cm is: " + centimeters + " while in feet is: " + feet + " and inches is: " + inches );
    }
}
