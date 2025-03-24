package practice;
import java.util.Scanner;
import java.util.Random;
public class GuessTheNumber 
{
    public static void main(String[] args) 
    {
        // Create a Random object to generate random numbers
        Random random = new Random();
        // Generate a random number between 1 and 100
        int targetNumber = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        
        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");

        // Keep asking the user for guesses until they guess correctly
        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < targetNumber) {
                System.out.println("Your guess is too low. Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Your guess is too high. Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
            }
        }

        scanner.close();
    }
}
