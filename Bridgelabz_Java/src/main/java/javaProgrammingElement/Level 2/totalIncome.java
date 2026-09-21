import java.util.Scanner;
public class totalIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter salary: ");
        int salary = scanner.nextInt();
        System.out.print("Enter bonus: ");
        int bonus = scanner.nextInt();
        int totalIncome = salary + bonus;
        System.out.println("The salary in INR " + salary + " and the bonus in INR " + bonus + ". Hence total income of INR " + totalIncome);
    }
}