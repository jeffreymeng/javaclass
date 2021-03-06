/*
 * Programmer: Jeffrey Meng
 * Date: 9/12/17
 * Purpose: Ask the user for some information on the DVD's, then print it into a well formatted string.
 */
package movieInventory;

import java.util.Scanner;

public class MovieInventory {

	public static void main(String[] args) {
		double lordCost, kidsCost, menaceCost, totalCost; // cost or product
		//Movie Titles: Lord of the Ringdings, Dennis the Dentist Menace, Spy Kids Aged 52
		int lordQuantity, menaceQuantity, kidsQuantity; //quantity of product

		Scanner in = new Scanner(System.in);
		
		//Lord of the Ringdings
		System.out.print("How much is Lord?  ");// (How much does the lord cost)
		lordCost = in.nextDouble();
		System.out.print("How many Lords does the store own?  "); // # of copies, not anything else
		lordQuantity = in.nextInt();
		
		//Dennis the Dentist Menace
		System.out.print("How much is Menace?  ");// (How much does the lord cost)
		menaceCost = in.nextDouble();
		System.out.print("How many Menace does the store own?  ");// # of copies, not anything else
		menaceQuantity = in.nextInt();
		
		//Spy Kids Aged 52 
		System.out.print("How much is Kids?  ");// (How much does the lord cost)
		kidsCost = in.nextDouble();
		System.out.print("How many Kids does the store own?  "); // # of copies, not anything else
		kidsQuantity = in.nextInt();
		
		totalCost = lordCost * lordQuantity + menaceCost * menaceQuantity + kidsCost * kidsQuantity;
		
		//print out table
		System.out.printf("%n%n%n%n%20s %-40s %-15s %-25s %n%n", "", "Video Title", "Cost", "# in Stock");
		System.out.printf("%20s %-40s $%-15.2f %-25d %n%n", "", "Lord of the Ringdings", lordCost, lordQuantity);
		System.out.printf("%20s %-40s $%-15.2f %-25d %n%n", "", "Dennis the Dentist Menace", menaceCost, menaceQuantity);
		System.out.printf("%20s %-40s $%-15.2f %-25d %n%n%n%n", "", "Spy Kids Aged 52", kidsCost, kidsQuantity);
		System.out.printf("%20s The total value of all tapes is: $" + (lordCost * lordQuantity + menaceCost * menaceQuantity + kidsCost * kidsQuantity) + "%n", "");
		System.out.printf("%20s The average is: $%.2f %n", "", totalCost / (double) (lordQuantity + menaceQuantity + kidsQuantity));
		
		in.close();
	}

}
