package classAndObject.Level1;
import  java.util.Scanner;
//class to create and display books
public class Book {
    String name = "";
    String author = "";
    int price = 0;
    public void display(){
        System.out.println("name : " + name);
        System.out.println(  " Id : " + author);
        System.out.println(" Salary : "+price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book book1 = new Book();
        System.out.println("Enter Book name :");
        book1.name = scanner.nextLine();
        System.out.println("Enter Author name :");
        book1.author = scanner.nextLine();
        System.out.println("Enter price of book :");
        book1.price = scanner.nextInt();
        book1.display();


    }

}
