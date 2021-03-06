/*
 * Programmer: Jeffrey Meng
 * Date: Sep 20, 2017
 * Purpose: Ask the user for their name and age. Tell them how many years until they can drive.
 */
package ifElseStatements;

import java.util.Scanner;

public class UntilDrivingAge {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int age;
		String name;
		System.out.println("What is your name?");
		name = in.nextLine();
		System.out.println("How old are you?");
		age = in.nextInt();
		
		if (age > 16) {
			System.out.println("It's scary, " + name + " you are old enough to drive!");
		} else {
			System.out.println(name + ", you will be able to drive in " + (16 - age) + " years.");
		}
		
		in.close();
	}

}
