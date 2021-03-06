/*
 * Programmer: Jeffrey Meng
 * Date: Sep 14, 2017
 * Purpose: Assists children in totaling the amount of money in their piggy banks.
 */
package piggyBankProblem;

import java.util.Scanner;

public class PiggyBankProblem {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int quarters, dimes, nickels, pennies, weeks;
		double pval, dval, nval, qval, total;//value for pennies, dimes, nickels, quarters. Total
		String full, name;// name is first name, full is full name
		
		System.out.println(" * * * * * * * MyPiAccountant * * * * * * * ");
		System.out.println("Hello! What is your whole name?");
		full = in.nextLine();
		//===String Formatting(for fun)===
		// Gets the first letter of the user's name, makes it uppercase if not already, then adds it to the rest of the user's name string.
		name = full.substring(0, 1).toUpperCase() + full.substring(1, full.indexOf(' '));
		// adds the user's first name, formatted above, to the first two letters of the last name(space 
		//and the first letter of their last name to the rest of their last name)
		full = name + (full.substring(full.indexOf(' '), full.indexOf(' ') + 2).toUpperCase() + 
				full.substring(full.indexOf(' ') + 2));
		//end string formatting
		System.out.println(name + ", how many quarters do you have?");
		quarters = in.nextInt();
		System.out.println(name + ", how many dimes do you have?");
		dimes = in.nextInt();
		System.out.println(name + ", how many nickels do you have?");
		nickels = in.nextInt();
		System.out.println(name + ", how many pennies do you have?");
		pennies = in.nextInt();
		System.out.println(name + ", how many weeks have you been saving?");
		weeks = (int) in.nextDouble();
		
		pval = pennies / 100.00;
		nval = (5 * nickels) / 100.00;
		dval = (10 * dimes) / 100.00;
		qval = (25 * quarters) / 100.00;
		total = pval + nval + dval + qval;

		//chart
		
		System.out.printf("*************** " + full + "'s Piggy Bank *************%n");
		System.out.printf("      Coin                 Amount of coin   Value %n%n");
		System.out.printf("      Pennies              %-15d $%-25.2f %n", pennies, pval);
		System.out.printf("      Nickels              %-15d $%-25.2f %n", nickels, nval);
		System.out.printf("      Dimes                %-15d $%-25.2f %n", dimes, dval);
		System.out.printf("      Quarters             %-15d $%-25.2f %n%n%n", quarters, qval);
		System.out.printf("      Grand Total: $%.2f", total);
		System.out.printf("%n      The average amount you saved each week is: $%.2f", total / weeks);
		System.out.printf("%n%n      " + name + ", at this rate, you can save $%.2f in one year!", (total / weeks) * 52);
		
		in.close();
	}
	
}
