/*
 * Programmer: Jeffrey Meng
 * Date: Sep 22, 2017
 * Purpose:
 */

package logicalOperators;

import java.util.Scanner;

public class EnterIntWinMoney {

	public static void main(String[] args) {
		int money;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number between 50 and 100(inclusive for both):");
		money = in.nextInt();
		
		if (money >= 50 && money <= 100) {
			System.out.printf("You just won $%.2d!", money);
		} else {
			System.out.println("Sorry, you are not following directions!");
		}
		
		in.close();

	}

}
