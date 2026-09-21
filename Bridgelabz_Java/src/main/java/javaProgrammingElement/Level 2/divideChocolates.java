import java.util.Scanner;
public class divideChocolates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number of chocolates: ");
        int totalChocolates = scanner.nextInt();
        System.out.print("number of children: ");
        int numberOfPeople = scanner.nextInt();
        int chocolatesPerChild = totalChocolates / numberOfPeople;
        int remainingChocolates = totalChocolates % numberOfPeople;
        System.out.println("the number of chocolates each child gets is " + chocolatesPerChild + " and the number of remaining chocolates are " + remainingChocolates);
    }
}
