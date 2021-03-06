/*
 * Programmer: Jeffrey Meng
 * Date: Nov 6, 2017
 * Purpose: Sell paint
 */

package mrKullasPaintStore;

import utils.Str;

import java.util.Scanner;

public class MrKullasPaintStore {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char currentColor = 'a';
		String unprocessedInput;
		int red = 0, green = 0, currentQuantity;
		boolean first = true;
		boolean quitConfirmation = false;
		
		//get the user input

		while (!quitConfirmation) {
			
			if (first) {
				System.out.print("Choose another paint color to order(red, green) or enter checkout to checkout and quit to quit: ");
				//change first to false at the very end, because the user might not enter correct input.
			} else {
				System.out.print("Choose a paint color to order(red, green) or enter checkout to checkout and quit to quit: ");
			}
			unprocessedInput = in.nextLine();
			if (!unprocessedInput.equals("")) {
				currentColor = unprocessedInput.toLowerCase().charAt(0);
				if (currentColor == 'c') {
					break;
				} else if (currentColor == 'q') {
					System.out.println("Are you sure you want to quit(yes/y to quit, anything else to return to program)?");
					// quitConfirmation = (in.nextLine().toLowerCase().charAt(0) == 'y');//conditional will return true or false.
					if (in.nextLine().toLowerCase().charAt(0) == 'y') {
						break;//or return; but that's probably bad pratice.
					} else {
						continue;
					}
				}
			} else {
				 currentColor = 'a';//there's probably a better way to do this, but this is short.
				 // I tried continue, but there was an error. This may not be the cause, but its faster to just remove it
				 //I can't find any disadvantages.
			}
			while (currentColor != 'r' && currentColor != 'g') {
				System.out.println("Enter red or green, or checkout to checkout and quit to quit: ");
				currentColor = in.nextLine().toLowerCase().charAt(0);
				if (currentColor == 'c') {
					quitConfirmation = false;
				} else if (currentColor == 'q') {
					System.out.println("Are you sure you want to quit(yes/y to quit, anything else to return to program)?");
					// quitConfirmation = (in.nextLine().toLowerCase().charAt(0) == 'y');//conditional will return true or false.
					if (in.nextLine().toLowerCase().charAt(0) == 'y') {
						break;//or return; but that's probably bad pratice.
					} else {
						continue;
					}
				}
			}
			
			
			if (currentColor == 'r') {
				//I realize that this 
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
					//System.out.println("You added " + currentQuantity + " gallons of red paint, adding $" + 
					//		Num.formatDollar(getPriceRed(currentQuantity)) + " to your total.");
					System.out.printf("You added " + currentQuantity + " gallons of red paint, adding $%.2f to your total.%n", getPriceRed(currentQuantity));
				} else if (currentQuantity < 0) {
					//System.out.println("You removed " + Math.abs(currentQuantity) + " gallons of red paint, removing $" + 
					//		Num.formatDollar(getPriceRed(Math.abs(currentQuantity))) + " from your total.");
					System.out.printf("You removed " + Math.abs(currentQuantity) + " gallons of red paint, removing $%.2f from your total.%n", getPriceRed(Math.abs(currentQuantity)));
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
					//only use printf
					//System.out.println("You added " + currentQuantity + " gallons of green paint, adding $" + 
					//		Num.formatDollar(getPriceGreen(currentQuantity)) + " to your total.");
					System.out.printf("You added " + currentQuantity + " gallons of green paint, adding $%.2f to your total.%n", getPriceGreen(currentQuantity));
				} else if (currentQuantity < 0) {
					//System.out.println("You removed " + Math.abs(currentQuantity) + " gallons of green paint, removing $" + 
					//		Num.formatDollar(getPriceGreen(Math.abs(currentQuantity))) + " from your total.");
					System.out.printf("You removed " + Math.abs(currentQuantity) + " gallons of green paint, removing $%.2f from your total.%n", getPriceGreen(Math.abs(currentQuantity)));
				} else {
					System.out.println("You did not add or remove any green paint.");
				}
				green += currentQuantity;
			}
			if (first == true) {
				first = false;
			}
		}
		if (currentColor != 'q') {
			//print the invoice
			Str.repeatChar('*', 31);
			System.out.println("*** Mr. Kulla's Paint Store ***");
			Str.repeatChar('*', 31);
			System.out.printf("Your total is: %.2f%n", 1.09 * (getPriceRed(red) + getPriceGreen(green)));
			//get the price, then multiply by 1.09 to get sum plus tax.
			System.out.println("Thank you for shopping at Mr. Kulla's Paint Store.");
			System.out.print("\n\n\n");
			Str.repeatChar('*', 31);
			System.out.println("*** Mr. Kulla's Paint Store ***");
			Str.repeatChar('*', 31);
			//going to assume nobody will purchase more than 100, 000, 000 dollars worth of red paint.
			// If I didn't, one way to go would be to split the money into multiple lines, by use a while loop(change the double into a string)
			// to keep printing(then removing the printed amount from the string) until the string is empty.
			// which is probably not that easy.
			System.out.printf("*  Red Paint       %9.2f  *%n", getPriceRed(red));
			System.out.printf("*  Green Paint     %9.2f  *%n", getPriceGreen(green));
			System.out.println("*                             *");
			System.out.printf("*  Subtotal        %9.2f  *%n", (getPriceRed(red) + getPriceGreen(green)));
			System.out.println("*                             *");
			System.out.printf("*  9%% Sales Tax    %9.2f  *%n", (double) (0.09 * (getPriceRed(red) + getPriceGreen(green))));
			System.out.printf("*  Total       %12.2f   *%n", (1.09 * (getPriceRed(red) + getPriceGreen(green))));
			System.out.println("*   Thank you for choosing    *");
			System.out.println("*  Mr. Kulla's Paint Store    *");
		Str.repeatChar('*', 31);
		} else {
			System.out.println("Exited Program.");
		}
		in.close();
	}

	private static double getPriceRed(int gallons) {
		return 21.95 * gallons;
	}
	private static double getPriceGreen(int gallons) {
		return 19.95 * gallons;
	}

}
