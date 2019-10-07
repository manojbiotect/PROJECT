/** @ Author: Manoj Adhikari 
   @Assignment: 1b. 
   @Date: 10/06/2019
   @FileName : "assignment1B.java". */

package assignment;

import java.util.Scanner;

public class assignment1B {
	// create a main method
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in); 

		// Prompt the user to enter an integer
		System.out.print("Enter a number: ");
		long number = input.nextLong();

		// Display the square root
		System.out.println("The approximated square root of " + number + " is: " + sqrt(number));
	}
	
	// Method squrt approximates the square root of n 
	public static double sqrt(long n) {
		long lastGuess = 1;
		long nextGuess = (lastGuess + n / lastGuess) / 2; 

		// If the difference between nextGuess and lastGuess is less than 0.0001,
		// return nextGuess as the approximated square root of n.
		while (nextGuess - lastGuess > 0.0001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n / lastGuess) / 2;
		}
		lastGuess = nextGuess;
		return nextGuess = (lastGuess + n / lastGuess) / 2;
	}
}

/**
Enter a number: 25
The approximated square root of 25 is: 5.0
*/
