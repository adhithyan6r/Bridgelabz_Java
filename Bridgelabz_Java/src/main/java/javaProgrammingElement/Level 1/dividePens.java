import java.util.Scanner;
public class dividePens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("total number of pens: ");
        int totalPens = scanner.nextInt();
        System.out.print("number of students: ");
        int numberOfStudents = scanner.nextInt();
        int penPerStudent = totalPens / numberOfStudents;
        int remainingPens = totalPens % numberOfStudents;
        System.out.println("the pen per student is: " + penPerStudent + " and the remaining pen not distributed is: " + remainingPens);
    }
}
