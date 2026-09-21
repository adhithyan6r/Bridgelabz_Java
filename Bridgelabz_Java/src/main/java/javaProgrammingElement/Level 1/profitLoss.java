import java.util.Scanner;
public class profitLoss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cost price: ");
        double costPrice = scanner.nextDouble();
        System.out.print("Enter selling price: ");
        double sellingPrice = scanner.nextDouble();
        double profit = sellingPrice - costPrice;
        double profitPercentage = (profit / costPrice) * 100;
        System.out.println("the cost price is: " + costPrice+" and selling price is: "+sellingPrice);
        System.out.println("the profit in INR: " + profit+" and profit percentage is: "+profitPercentage+"%");
    }
}
