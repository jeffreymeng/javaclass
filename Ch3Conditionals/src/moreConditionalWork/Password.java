/*
 * Programmer: Jeffrey Meng
 * Date: Sep 26, 2017
 * Purpose:
 */

package moreConditionalWork;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		String password = "wronghorsebatterypaperclip";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the password:");
		if (in.nextLine().equals(password))
			System.out.println("Hello, You're in!");
		else 
			System.out.println("Sorry, incorrect password.");
		
		in.close();
	}

}
