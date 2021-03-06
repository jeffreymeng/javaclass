/*
 * Programmer: Jeffrey Meng
 * Date: Sep 21, 2017
 * Purpose: Ask the users year of birth, then print out something based on it.
 */

package ifElseStatements;

import java.util.Scanner;

public class JukeBoxRalley {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year;
		String fruit;

		System.out.println("Enter your year of birth:");
		year = in.nextInt();
		/* this next line gets the enter key, because nextInt() only took the number, not the enter key
		 the user entered. To get around this we consume the new line, so the next nextLine
		 will not automatically accept just the enter key without letting the user input first.
		*/
		in.nextLine();
		System.out.println("Enter your favorite fruit:");
		fruit = in.nextLine();
		if (year < 1970) {
			System.out.println("You qualify for the Juke Box Rally.");
		}
		if (fruit.equals("strawberry")) {
			System.out.println("Strawberry fields forever");
		} else {
			System.out.println("Bye, bye Miss American Pie");
		}
		in.close();

	}

}
