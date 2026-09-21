// Create TravelComputation Class to compute the Distance and Travel Time
import java.util.Scanner;
class TravelComputation {
   
   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter name: ");
      String name = scanner.nextLine();

      System.out.print("starting city: ");
      String fromCity = scanner.nextLine();

      System.out.print("via city: ");
      String viaCity = scanner.nextLine();

      System.out.print("to city: ");
      String toCity = scanner.nextLine();

      System.out.print("Enter distance from " + fromCity + " to " + viaCity + ": ");
      double distanceFromToVia = scanner.nextDouble();

      System.out.print("Enter travel time from " + fromCity + " to " + viaCity + " (in minutes): ");
      int timeFromToVia = scanner.nextInt();

      System.out.print("Enter distance from " + viaCity + " to " + toCity + ": ");
      double distanceViaToFinalCity = scanner.nextDouble();

      System.out.print("Enter travel time from " + viaCity + " to " + toCity + " (in minutes): ");
      int timeViaToFinalCity = scanner.nextInt();

      double totalDistance = distanceFromToVia + distanceViaToFinalCity;

      int totalTime = timeFromToVia + timeViaToFinalCity;


      System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity +" is " + totalDistance + " km and " +"the Total Time taken is " + totalTime + " minutes");
   }
}