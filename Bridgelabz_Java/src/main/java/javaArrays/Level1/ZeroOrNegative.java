package javaArrays.Level1;
import java.util.Arrays;
import java.util.Scanner;
public class ZeroOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[5];
        int i = 0;
        double sum = 0;
        while (i < numbers.length) {
            System.out.println("Enter q number:");
            double number = scanner.nextDouble();
            if (number <= 0 ) {
                break;
            }
            else {
                numbers[i] = number;
                sum += number;
            }

            i++;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("total:" +sum);
    }
}
