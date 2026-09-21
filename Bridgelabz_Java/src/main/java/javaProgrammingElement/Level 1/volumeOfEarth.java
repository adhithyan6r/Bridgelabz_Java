import java.util.Scanner;
public class volumeOfEarth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("radius of the earth: ");
        double radius = scanner.nextDouble();
        double km = (4/3) * 3.14 * radius * radius * radius;
        double miles= km/1.6;
        System.out.println("The volume of the Earth in cubic kilometers: "+km+" and cubic miles is: "+miles);
    }
}
