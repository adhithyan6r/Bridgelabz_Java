import java.util.Scanner;
public class universityDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total fee: ");
        double fee = scanner.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discountPercent = scanner.nextDouble();
        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;
        System.out.println("The discount amount is INR : " + discount + " and final discounted fee is INR: " + finalFee);
    }
}
