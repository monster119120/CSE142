/*
 * Tiarnan Marsten
 * 05 Dec, 2019
 * CSE142
 * Assignment 5
 */
import java.util.*;

public class GuessingGame {

	/** Max number to guess. */
	public static final int MAX = 100;

	/**
	 * Prints the game.
	 * @param args
	 */
	public static void main(String[] args) {
		printGame();
	}

	/**
	 * Creates and runs the game.
	 */
	public static void printGame() {
		Scanner s = new Scanner(System.in);
		boolean playAgain = true;
		int totalGames = 1;
		int totalGuesses = 0;
		int bestGuess = 0;

		while (playAgain) {
			System.out.println("I'm thinking of a number between 1 and " + MAX);
			bestGuess = playGame(s);
			totalGuesses += bestGuess;
			if (totalGuesses < bestGuess) {
				bestGuess = totalGuesses;
			}
			System.out.print("Do you want to play again? ");
			String answer = s.next().toLowerCase();
			if (answer.charAt(0) != 'y') {
				playAgain = false;
				printResults(totalGames, totalGuesses, bestGuess);
			} else {
				totalGames++;
			}
			System.out.println();
		}
	}

	/**
	 * Plays one game with user.
	 * @param input
	 * @return number of guesses user took
	 */
	public static int playGame(Scanner input) {
		Random r = new Random();
		int randomNum = r.nextInt(MAX) + 1;
		int guessNum = 0;
		int numOfGuesses = 0;
		while (guessNum != randomNum) {
			System.out.print("Your guess? ");
			guessNum = input.nextInt();
			numOfGuesses++;

			if (guessNum < randomNum) {
				System.out.println("It's higher.");
			} else if (guessNum > randomNum) {
				System.out.println("It's lower.");
			}
		}
		
		System.out.print("You got it right in ");
		if (numOfGuesses == 1) {
			System.out.println("1 guess!");
		} else {
			System.out.println(numOfGuesses + " guesses!");
		}
		
		return numOfGuesses;
	}

	/**
	 * Prints user's results.
	 * @param totalGames
	 * @param totalGuesses
	 * @param bestGuess
	 */
	public static void printResults(int totalGames, int totalGuesses, int bestGuess) {
		System.out.println();
		System.out.println("Overall results:");
		System.out.println("Total games   = " + totalGames);
		System.out.println("Total guesses = " + totalGuesses);
		System.out.println("Guesses/game  = " + format(totalGuesses / totalGames));
		System.out.println("Best game     = " + bestGuess);
	}
	
	/**
	 * Formats the decimal.
	 * @param value
	 * @return formatted number
	 */
	public static double format(double value) {
		return (Math.round(value * 10) / 10);
	}
}
