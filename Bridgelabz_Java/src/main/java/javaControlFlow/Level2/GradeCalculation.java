package javaControlFlow.Level2;
import java.util.Scanner;
public class GradeCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("physics marks:");
        double physicsMarks = scanner.nextInt();
        System.out.println("physics marks:");
        double chemistryMarks = scanner.nextInt();
        System.out.println("physics marks:");
        double mathsMarks = scanner.nextInt();
        double totalMarks= 300;
        double totalMarksObtained= physicsMarks+mathsMarks+chemistryMarks;
        double percentage = (totalMarksObtained/totalMarks)*100;
        if (percentage>=80){
            System.out.println("Grade A");
        }
        else if (percentage>=70 && percentage<80) {
            System.out.println("Grade B");
        }
        else if (percentage>=60 && percentage<70) {
            System.out.println("Grade C");
        }
        else if (percentage>=50 && percentage<60) {
            System.out.println("Grade D");
        }
        else if (percentage>=40 && percentage<50) {
            System.out.println("Grade E");
        }else{
            System.out.println("Grade R");
        }
    }
}
