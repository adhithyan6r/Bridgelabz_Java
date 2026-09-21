import java.util.Scanner;
public class maxHandshakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number of students: ");
        int numberOfStudents = scanner.nextInt();
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("number of possible handshakes is: " + handshakes);
    }
}
