import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 100;
        int secretNumber = new Random().nextInt(max - min + 1) + min;
        int userGuess;

        do {
            System.out.print("Guess the secret number (" + min + " to " + max + "): ");
            userGuess = scanner.nextInt();

            if (userGuess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed it!");
            }
        } while (userGuess != secretNumber);

        scanner.close();
    }
}
