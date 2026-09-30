package classAndObject.Level1;
import  java.util.Scanner;
//class to find the total price of the item purchased and then display the details of the item
public class Item {
    String itemName = "";
    int itemCode = 0;
    int price = 0;
    public void display(double quantity){
        System.out.println("Name : " + itemName);
        System.out.println("Code : " + itemCode);
        System.out.println("price : "+price);
        double total = quantity * price;
        System.out.println("total price :" +total);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Item item1 = new Item();
        System.out.println("Enter item name :");
        item1.itemName = scanner.nextLine();
        System.out.println("Enter item code :");
        item1.itemCode = scanner.nextInt();
        System.out.println("Enter item price :");
        item1.price = scanner.nextInt();
        System.out.println("Enter quantity");
        double quantity = scanner.nextDouble();
        item1.display(quantity);


    }

}
