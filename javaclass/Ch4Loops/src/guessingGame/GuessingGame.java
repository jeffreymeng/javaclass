/*
 * Programmer: Jeffrey Meng
 * Date: Oct 9, 2017
 * Purpose:
 */

package guessingGame;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		int number, guess, tries;//random number
		Scanner in = new Scanner(System.in);
		number = (int) (Math.random() * 100) + 1;
		tries = 0;


		//System.out.println(number);//testing
		System.out.println("Guess the number between 1 and 100(inclusive):");
		do {
			guess = in.nextInt();
			if (guess > 100 || guess < 1) {
				System.out.println("You must enter a number between 1 and 100(inclusive). Please try again:");		
			} else if (guess > number) {
				tries ++;
				System.out.println("Too high! Try again:");
			} else if (guess < number) {
				tries ++;
				System.out.println("Too low! Try again:");
			}
		} while (guess != number);
		//use tries + 1 to account for final, correct guess.
		System.out.println("It took you " + (tries + 1) + " tries to guess " + number + ".");
		
		in.close();
	}
	

}
