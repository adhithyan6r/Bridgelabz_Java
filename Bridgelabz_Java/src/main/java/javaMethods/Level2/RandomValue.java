package javaMethods.Level2;
import java.util.Arrays;
// Problem: Generate five random four-digit numbers and find their average, minimum, and maximum values.
public class RandomValue {
    // Method to genarate an array of random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + (int) (Math.random() * 9000);
        }
        return numbers;
    }
    // Method to find the average, minimum, and maximum values
    public double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }
    public static void main(String[] args) {
        RandomValue randomNumbers = new RandomValue();
        // Input: The program uses the required size of 5
        int[] numbers = randomNumbers.generate4DigitRandomArray(5);
        double[] result = randomNumbers.findAverageMinMax(numbers);
        System.out.println("Random Numbers: " + Arrays.toString(numbers));
        System.out.println("Average; " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }
}