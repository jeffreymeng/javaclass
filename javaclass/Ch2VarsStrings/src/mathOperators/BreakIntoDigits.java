/*
 * Programmer: Jeffrey Meng
 * Date: 9/11/17
 * Purpose: Ask the user for a two digit number, then display each digit separately.
 */

package mathOperators;

import java.util.Scanner;

public class BreakIntoDigits {

	public static void main(String[] args) {
		int number;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a two digit number:");
		number = in.nextInt();
		System.out.println("The first digit is " + number / 10 + ".");
		System.out.println("The second digit is " + number % 10 + ".");
		
		in.close();
	}

}
