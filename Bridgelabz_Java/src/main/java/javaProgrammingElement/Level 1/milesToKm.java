import java.util.Scanner;
public class milesToKm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter miles: ");
        double miles = scanner.nextDouble();
        double km = miles*1.6;
        System.out.println("The distance "+miles+" mile in km is "+km);
    }

}




