/*
 * Programmer: Jeffrey Meng
 * Date: Sep 25, 2017
 * Purpose: Print a message telling the user that a program may contain a virus. 
 * Ask them if they want to continue and print a message.
 */

package logicalOperators;

import java.util.Scanner;

public class Antivirus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String choice;
		System.out.println("This program may contain a virus. Do you wish to continue (y/n)?");
		choice = in.nextLine();
		if (choice.equalsIgnoreCase("y")) {
			System.out.println("You are a gambler!");
		} else if (choice.equalsIgnoreCase("n")){
			System.out.println("Smart Choice!");
		} else {
			System.out.println("That was not a Y or N. You did not answer correctly!");
		}
		in.close();
	}

}
