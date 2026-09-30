package classAndObject.Level1;
import  java.util.Scanner;
//class to get and display employee details
public class Employee {
    String name = "";
    int id = 0;
    int salary = 0;
    public void display(){
        System.out.println("name : " + name);
        System.out.println(  " Id : " + id);
        System.out.println(" Salary : "+salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee emp1 = new Employee();
        System.out.println("Enter Employee name :");
        emp1.name = scanner.nextLine();
        System.out.println("Enter employee id :");
        emp1.id = scanner.nextInt();
        System.out.println("Enter employee salary :");
        emp1.salary = scanner.nextInt();
        emp1.display();


    }

}
