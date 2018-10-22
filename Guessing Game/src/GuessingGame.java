import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int numberToGuess = rand.nextInt(1000);
        int numberOfTries = 0;
        int guess;
        boolean win = false;

        System.out.println("Guess a number between 1 and 1000: ");

        while (win == false) {

            guess = sc.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) {

                win = true;

            } else if (guess > numberToGuess) {
                System.out.println("Try a lower number...");
            } else if (guess < numberToGuess) {
                System.out.println("Try a higher number...");
            }
        }

        System.out.println("Congratulations! You guessed the right number!");
        System.out.println("The number was " + numberToGuess + ".");
        System.out.println("It took you " + numberOfTries + " tries!");
    }
}
