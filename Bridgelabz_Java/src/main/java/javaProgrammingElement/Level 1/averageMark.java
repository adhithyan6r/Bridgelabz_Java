import java.util.Scanner;
public class averageMark {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter mark scored in maths: ");
        double mathsMark = s.nextInt();
        System.out.println("enter marks scored in physics");
        double physicsMarks = s.nextInt();
        System.out.println("enter marks scored in chemistry");
        double chemistryMarks = s.nextInt();
        double totalMarks=mathsMark+physicsMarks+chemistryMarks;
        double average = totalMarks/3;
        System.out.println("Sam's average mark in PCM is " +average);
    }
}
