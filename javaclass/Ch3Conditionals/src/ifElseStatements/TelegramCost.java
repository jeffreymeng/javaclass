/*
 * Programmer: Jeffrey Meng
 * Date: Sep 21, 2017
 * Purpose: Determine the cost of a telegram. $8.50 for first 15 words, 0.25 each over.
 */

package ifElseStatements;

import java.util.Scanner;

public class TelegramCost {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int words;
		
		System.out.println("Enter the number of words in your telegram:");
		words = in.nextInt();
		
		if (words > 15) {
			System.out.printf("Your " + words + " word telegram will cost $%.2f.", 8.5 + ((words - 15) * 0.25));
		} else {
			System.out.println("Your " + words + " word telegram will cost $8.50.");
		}
		
		in.close();
	}
}
