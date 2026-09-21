import java.util.Scanner;
class findAge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("harry's birth year: ");
        int birthYear = s.nextInt();
        System.out.print("Current year: ");
        int currentYear = s.nextInt();
        int age = currentYear - birthYear;
        System.out.println("harry's age in 2024 is: " + age);
    }
}