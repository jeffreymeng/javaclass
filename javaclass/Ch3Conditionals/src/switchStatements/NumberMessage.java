/*
 * Programmer: Jeffrey Meng
 * Date: Sep 29, 2017
 * Purpose: Tell the user about their inputed number.
 */

package switchStatements;

import java.util.Scanner;

public class NumberMessage {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		System.out.println("Enter a number between 1 and 10(inclusive):");
		num = in.nextInt();
		
		switch (num) {
			case 1:
			case 3:
				System.out.println("Your number is a low odd number.");
				break;
			case 2:
			case 4:
				System.out.println("Your number is a low even number.");
				break;
			case 5:
				System.out.println("Your number is a middle odd number");
				break;
			case 6:
				System.out.println("Your number is a middle even number");
				break;
			case 7:
			case 9:
				System.out.println("Your number is a low odd number.");
				break;
			case 8:
			case 10:
				System.out.println("Your number is a low even number.");
				break;
			default:
				System.out.println("You entered an invalid number.");
		}
		
		in.close();
	}

}
