/*
 * Programmer: Jeffrey Meng
 * Date: Sep 20, 2017
 * Purpose: Asks the user to enter any positive integer. Tell if its odd or even.
 */

package ifElseStatements;

import java.util.Scanner;

class IntOddEven {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number:");
		if (in.nextInt() % 2 == 0) {
			System.out.println("Your number is even.");
		} else {

			System.out.println("Your number is odd.");
			
		}

		in.close();
	}

}
