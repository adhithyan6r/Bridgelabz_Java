package javaStrings.Level2;
import java.util.Scanner;

// Problem: Play multiple games of Rock Paper Scissors and find the user's wins and win percentage.
public class RockPaperScissor{
    // Method to generate computer's random choice
    public static String computerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) {
            return "rock";
        } else if (choice == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }
    // Method to find the winner between user and computer.
    public static String findWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "Draw";
        }
        if ((userChoice.equals("rock") && computerChoice.equals("scissors")) || (userChoice.equals("paper") && computerChoice.equals("rock")) || (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            return "User Wins";
        }
        return "Computer Wins";
    }
    // Method to calculate wins and win percentage
    public static String[][] calculateResults(int userWins, int totalGames) {
        double percentage = ((double) userWins / totalGames) * 100;
        String[][] result = new String[2][2];
        result[0][0] = "User win";
        result[0][1] = String.valueOf(userWins);
        result[1][0] = "Win Percentage";
        result[1][1] = String.format("%.2f", percentage);
        return result;
    }
    // Method ot display game results
    public static void displayResults(String[][] games, String[][] overallResults) {
        System.out.println("\nGame\tUser\t\tComputer\tResult");
        for (int i = 0; i < games.length; i++) {
            System.out.println(
                    (i + 1) + "\t"
                            + games[i][0] + "\t\t"
                            + games[i][1] + "\t\t"
                            + games[i][2]
            );
        }
        System.out.println("\n" + overallResults[0][0] + ": " + overallResults[0][1]);
        System.out.println(overallResults[1][0] + ": " + overallResults[1][1] + "%");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take the number of games.
        System.out.print("Enter number of games: ");
        int numberOfGames = scanner.nextInt();
        String[][] games = new String[numberOfGames][3];
        int userWins = 0;
        for (int i = 0; i < numberOfGames; i++) {
            // Input: Take user's choice.
            System.out.print("Enter rock, paper, or scissors: ");
            String userChoice = scanner.next().toLowerCase();
            String computer = computerChoice();
            String winner = findWinner(userChoice, computer);
            games[i][0] = userChoice;
            games[i][1] = computer;
            games[i][2] = winner;
            if (winner.equals("User Wins")) {
                userWins++;
            }
        }
        String[][] overallResults =
                calculateResults(userWins, numberOfGames);
        displayResults(games, overallResults);
    }
}