import java.util.Scanner;
public class totslRounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("side 2: ");   
        double side2 = scanner.nextDouble();
        System.out.print("side 3: ");
        double side3 = scanner.nextDouble();
        double distanceToComplete = 5;
        double totalRounds = side1 + side2 + side3;
        double roundsCompleted = totalRounds / distanceToComplete;
        System.out.println("the total number of rounds the athlete will run is " + roundsCompleted+" to complete 5km");
    }
}
