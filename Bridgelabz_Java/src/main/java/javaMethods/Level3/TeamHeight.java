package javaMethods.Level3;
// Problem: Find the shortest, tallest, and mean height of players present in a football team.
public class TeamHeight {
    // Method: Generate random heights for 11 players between 150 cm and 250 cm
    public static int[] generateHeights() {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + (int) (Math.random() * 101);
        }
        return heights;
    }
    // Method: Find the sum of all player heights.
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }
    // Method: Find the mean height of the players.
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }
    // Method: Find the shortest player height
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }
    // Method: Find the tallest player height.
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
    public static void main(String[] args) {
        // Input: Generate random heights for the football team
        int[] heights = generateHeights();
        System.out.println("Player Heights:");
        for (int height : heights) {
            System.out.println(height + " cm");
        }
        System.out.println("Sum of Heights: " + findSum(heights));
        System.out.println("Mean Height: " + findMean(heights));
        System.out.println("Shortest Height: " + findShortest(heights));
        System.out.println("Tallest Height: " + findTallest(heights));
    }
}