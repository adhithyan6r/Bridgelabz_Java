import java.util.Scanner;
public class feeDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total fee: ");
        double fee = scanner.nextDouble();
        System.out.print("enter the discount percentage: ");
        double discountPercent = scanner.nextDouble();
        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;
        System.out.println("the discount amount is INR : " + discount+" and final discounted fee is INR: "+finalFee);

    }
}
