/*
 * Programmer: Jeffrey Meng
 * Date: Sep 21, 2017
 * Purpose:
 */

package ifElseStatements;

import java.util.Scanner;

public class MuseumEntryFee {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int age;
		
		System.out.println("Enter the age for whom the ticket is for:");
		age = in.nextInt();
		
		if (age < 5) {
			System.out.println("Your admission is free:");
		} else if (age >= 65) {
			System.out.println("You qualify for a discount $1.50 ticket");
		} else {
			System.out.println("Your ticket will cost $2.50");
		}
		in.close();
		
	}
}
