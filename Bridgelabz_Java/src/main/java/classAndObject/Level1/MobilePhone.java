package classAndObject.Level1;
import  java.util.Scanner;
//class to get and display a mobile's brand, model, and price
public class MobilePhone {
    String brand = "";
    String model  = "";
    int price = 0;
    public void display(){
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("price : "+price);
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MobilePhone phone1 = new MobilePhone();
        System.out.println("Enter phone brand :");
        phone1.brand = scanner.nextLine();
        System.out.println("Enter phone model :");
        phone1.model = scanner.nextLine();
        System.out.println("Enter phone price :");
        phone1.price = scanner.nextInt();
        phone1.display();


    }

}
