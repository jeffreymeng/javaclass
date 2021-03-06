/*
 * Programmer: Jeffrey Meng
 * Date: Sep 26, 2017
 * Purpose: Determine which cable TV channel is the user's favorite with swich statements.
 */

package switchStatements;

import java.util.Scanner;

public class CableTVEdited {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int channel;

		System.out.println("In this town, there are 5 non-cable TV channels.\n"
				+ "Which is your favorite(2, 4, 6, 8, 11)?");
		channel = in.nextInt();
		switch (channel) {

		case 2: 
			System.out.println("Channel 2 got top ratings last week!");
			break;
		case 4:
			System.out.println("Channel 4 shows primary news!");
			break;
		case 6:
			System.out.println("Channel 6 shows old movies!");
			break;
		case 8:
			System.out.println("Channel 8 covers local events!");
			break;
		case 11:
			System.out.println("Channel 11 is public broadcasting!");
			break;
		default:
			System.out.println("That channel does not exist. It must be a cable channel.");
		}

		in.close();
	}

}
