import java.util.Scanner;
public class yardAndMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter feets: ");
        double feet = scanner.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;
        System.out.println("distance in feets is: "+feet+" while in yards is: "+yards+" and in miles is: "+miles);
    }
}