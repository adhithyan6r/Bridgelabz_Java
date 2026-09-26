package javaMethods.Level2;
import java.util.Scanner;
// Problem: Find the youngest and tallest among Amar, akbar, and Anthony using arrays and methods
public class YoungestTallest{
    // Method: Find the index of the youngest person
    public static int findYoungest(int[] ages) {
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return youngestIndex;
    }
    // Method: Find the index of the tallest person
    public static int findTallest(int[] heights) {
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return tallestIndex;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];
        for (int i = 0; i < 3; i++) {
            // Input: Take age and height of each person
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height of " + names[i] + " in cm: ");
            heights[i] = scanner.nextInt();
        }
        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);
        System.out.println("Youngest: " + names[youngestIndex]);
        System.out.println("Tallest: " + names[tallestIndex]);
    }
}