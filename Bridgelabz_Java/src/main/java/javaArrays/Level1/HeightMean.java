package javaArrays.Level1;
import java.util.Scanner;
public class HeightMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0;
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1)+":");
            heights[i] = scanner.nextDouble();
            sum = sum + heights[i];
        }
        double mean = sum / heights.length;
        System.out.println("Mean height: " + mean);
    }
}