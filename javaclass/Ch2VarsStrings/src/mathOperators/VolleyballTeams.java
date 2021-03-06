/*
 * Programmer: Jeffrey Meng
 * Date: 9/8/17
 * Purpose: Ask the user for the number of players, 
 * then form teams of seven and tell how many are left over.
 */
package mathOperators;

import java.util.Scanner;

public class VolleyballTeams {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int players;
		
		System.out.println("Enter the number of players:");
		players = in.nextInt();
		System.out.println("There will be " + players / 7 + " teams of 7 and " + players % 7 + " players left over.");
		
		in.close();

	}

}
