import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
    private static int rnd_number;

    public static void main(String[] args) {
        // Pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println("Can you guess what it is?...");
        makeAGuess();
    }

    private static void makeAGuess() {
        Scanner scan = new Scanner(System.in);

        if (scan.hasNextInt()) {
            int guess = scan.nextInt();
            if (guess == rnd_number) {
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!");
                if (guess > rnd_number) {
                    System.out.println("Your number is too high");
                } else {
                    System.out.println("Your number is too low.");
                }
                makeAGuess();
            }
        } else {
            System.out.println("You must choose a number.");
            makeAGuess();
        }
    }
}
