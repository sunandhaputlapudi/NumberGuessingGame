import java.util.Random;
import java.util.Scanner;

public class Game {

    private final int MIN = 1;
    private final int MAX = 100;
    private final int MAX_ATTEMPTS = 5;

    private int randomNumber;
    private int attempts;

    public Game() {
        Random random = new Random();
        randomNumber = random.nextInt(MAX - MIN + 1) + MIN;
        attempts = 0;
    }

    public int play(Scanner scanner) {

        System.out.println("\nGuess the number between " + MIN + " and " + MAX);
        System.out.println("You have " + MAX_ATTEMPTS + " attempts.");

        while (attempts < MAX_ATTEMPTS) {

            System.out.print("Enter your guess: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
                continue;
            }

            int guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                System.out.println("Correct! You guessed in " + attempts + " attempts.");
                return calculateScore();
            }
            else if (guess < randomNumber) {
                System.out.println("Too Low!");
            }
            else {
                System.out.println("Too High!");
            }
        }

        System.out.println("You've used all attempts!");
        System.out.println("The correct number was: " + randomNumber);
        return 0;
    }

    private int calculateScore() {
        return (MAX_ATTEMPTS - attempts + 1) * 10;
    }
}
