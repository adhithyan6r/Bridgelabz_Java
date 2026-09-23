package javaControlFlow.Level1;
import java.util.Scanner;
public class SalaryBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter salary:");
        double salary = scanner.nextInt();
        System.out.println("Enter Years:");
        int years= scanner.nextInt();
        if (years>=5){
            double bonus = (salary*0.05);
            System.out.println("The bonus is "+bonus);
        }else{
            System.out.println("not eligible");
        }
    }

}
