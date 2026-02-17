import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("  WELCOME TO NUMBER GUESSING GAME");
        System.out.println("=================================");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        Player player = new Player(name);

        boolean playAgain = true;

        while (playAgain) {

            Game game = new Game();
            int score = game.play(scanner);

            player.addScore(score);

            System.out.println("Current Total Score: " + player.getTotalScore());

            System.out.print("\nDo you want to play again? (yes/no): ");
            String choice = scanner.next().toLowerCase();

            if (!choice.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("\nThank you, " + player.getName() + "!");
        System.out.println("Final Score: " + player.getTotalScore());
        System.out.println("Project Finished Successfully.");

        scanner.close();
    }
}
