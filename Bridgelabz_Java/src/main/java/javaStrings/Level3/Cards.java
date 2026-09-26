package javaStrings.Level3;
import java.util.Scanner;
// Problem: Create a deck of cards, shuffle the deck, distribute the cards to players, and display the cards
public class Cards{
    // To initialize the deck of cards
    public static String[] initializeDeck(String[] suits, String[] ranks) {
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }
        return deck;
    }
    // To shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }
    // To distribute cards to players
    public static String[][] distributeCards(String[] deck, int numberOfPlayers, int cardsPerPlayer) {
        int totalCards = numberOfPlayers * cardsPerPlayer;
        if (totalCards > deck.length) {
            return null;
        }
        String[][] players = new String[numberOfPlayers][cardsPerPlayer];
        int index = 0;
        for (int i = 0; i < numberOfPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[index];
                index++;
            }
        }
        return players;
    }
    // To print the players and their cards
    public static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1));
            for (String card : players[i]) {
                System.out.println(card);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"
        };
        // Input: Take number of players from the user
        System.out.print("Enter number of players: ");
        int numberOfPlayers = scanner.nextInt();
        // Input: Take number of cards per player from the user
        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = scanner.nextInt();
        int numOfCards = suits.length * ranks.length;
        String[] deck = initializeDeck(suits, ranks);
        deck = shuffleDeck(deck);
        String[][] players = distributeCards(deck, numberOfPlayers, cardsPerPlayer);
        if (players == null) {
            System.out.println("Cards cannot be distributed to all players");
        } else {
            System.out.println("Total cards in deck: " + numOfCards);
            printPlayers(players);
        }
    }
}