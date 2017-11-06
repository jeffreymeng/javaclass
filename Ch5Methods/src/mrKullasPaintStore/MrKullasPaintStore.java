/*
 * Programmer: Jeffrey Meng
 * Date: Nov 6, 2017
 * Purpose: Sell paint
 */

package mrKullasPaintStore;

import utils.Num;
import utils.Str;

import java.util.Scanner;

public class MrKullasPaintStore {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char currentColor;
		String unprocessedInput;
		int red = 0, green = 0, currentQuantity;
		
		while (true) {
			
			System.out.print("Choose a paint color to order(red, green) or enter checkout to checkout: ");
			unprocessedInput = in.nextLine();
			if (!unprocessedInput.equals("")) {
				currentColor = unprocessedInput.toLowerCase().charAt(0);
				if (currentColor == 'c') {
					break;
				}
			} else {
				currentColor = 'a';//there's probably a better way to do this.
			}
			while (currentColor != 'r' && currentColor != 'g') {
				System.out.println("Enter red or green:");
				currentColor = in.nextLine().toLowerCase().charAt(0);
			}
			
			
			if (currentColor == 'r') {//I realize that this 
				//block will basically look the same as the else if statement, but it's more trouble to edit the color and give customized questions.
				System.out.print("Enter the number of gallons of red paint you would like to buy: ");
				currentQuantity = in.nextInt();
				in.nextLine();
				while (currentQuantity <  (0 - red)) {//they can enter an negative number to delete
					System.out.print("Enter a number greater than or equal to " + ( 0 - red ) + "(enter a negative number to delete):");
					currentQuantity = in.nextInt();
					in.nextLine();
				}
				if (currentQuantity > 0) {
					System.out.println("You added " + currentQuantity + " gallons of red paint, adding $" + 
							Num.formatDollar(getPriceRed(currentQuantity)) + " to your total.");
				} else if (currentQuantity < 0) {
					System.out.println("You removed " + Math.abs(currentQuantity) + " gallons of red paint, removing $" + 
							Num.formatDollar(getPriceRed(Math.abs(currentQuantity))) + " from your total.");
				} else {
					System.out.println("You did not add or remove any red paint.");
				}
				red += currentQuantity;
			} else if (currentColor == 'g') {
				System.out.print("Enter the number of gallons of green paint you would like to buy: ");
				currentQuantity = in.nextInt();
				in.nextLine();
				while (currentQuantity < (0 - green)) {//they can enter an negative number to delete
					System.out.print("Enter a number greater than or equal to " + ( 0 - green ) + "(enter a negative number to delete):");
					currentQuantity = in.nextInt();
					in.nextLine();
				}
				if (currentQuantity > 0) {
					System.out.println("You added " + currentQuantity + " gallons of green paint, adding $" + 
							Num.formatDollar(getPriceGreen(currentQuantity)) + " to your total.");
				} else if (currentQuantity < 0) {
					System.out.println("You removed " + Math.abs(currentQuantity) + " gallons of green paint, removing $" + 
							Num.formatDollar(getPriceGreen(Math.abs(currentQuantity))) + " from your total.");
				} else {
					System.out.println("You did not add or remove any green paint.");
				}
				green += currentQuantity;
			}
		}
		//print the invoice
		Str.repeatChar('*', 31);
		System.out.println("*** Mr. Kulla's Paint Store ***");
		Str.repeatChar('*', 31);
		System.out.println("Your total is: " +  Num.formatDollar(1.09 * (getPriceRed(red) + getPriceGreen(green))));
		//get the price, then multiply by 1.09 to get sum plus tax.
		System.out.println("Thank you for shopping at Mr. Kulla's Paint Store.");
		System.out.print("/n/n/n");
		Str.repeatChar('*', 31);
		System.out.println("*** Mr. Kulla's Paint Store ***");
		Str.repeatChar('*', 31);
		System.out.printf("* ");
	}

	private static double getPriceRed(int gallons) {
		return 21.95 * gallons;
	}
	private static double getPriceGreen(int gallons) {
		return 19.95 * gallons;
	}

}
