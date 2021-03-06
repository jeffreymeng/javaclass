package mrKullasPaintStore;

import java.util.Scanner;

import utils.Str;

public class MrKullasPaintStoreRedo {

	public static void main(String[] args) {
		// new version
		Scanner in = new Scanner(System.in);
		String color = "";
		boolean first = true;
		int red = 0, green = 0, quantity;// red/green is how much red or green paint they bought.
		System.out.println("Mr. Kulla's Paint Store");
		while (!color.equalsIgnoreCase("checkout")) {

			if (first) {
				System.out.print("Please enter a color of paint to purchase(red/green): ");
			} else {
				System.out.print(
						"Please enter another color of paint to purchase(red/green), or enter checkout to checkout: ");
			}
			color = in.nextLine();
			// make sure they enter red or green. If they have already bought something,
			// they can also enter checkout.
			while (!(color.equalsIgnoreCase("red") || color.equalsIgnoreCase("green")
					|| (color.equalsIgnoreCase("checkout") && !first))) {
				if (first) {
					System.out.print("Please enter either red or green: ");

				} else {
					System.out.print("Please enter red, green, or checkout: ");
				}
				color = in.nextLine();
			}
			if (first) {
				first = false;
			}
			if (color.equalsIgnoreCase("red") || color.equalsIgnoreCase("green")) {
				System.out.print(
						"Enter the number of gallons of " + color.toLowerCase() + " paint would you like to buy: ");
				quantity = in.nextInt();
				in.nextLine();
				while (quantity < 0) {// if they don't want anymore, they can enter zero
					System.out.println("You must enter a number zero or greater: ");
					quantity = in.nextInt();
					in.nextLine();
				}
				if (quantity == 0) {
					System.out.println("You did not add any " + color.toLowerCase() + " paint.");
				} else if (color.equalsIgnoreCase("red")) {
					System.out.printf("You bought " + quantity + " gallons of red paint, adding $%.2f to your total.%n",
							getRedCost(quantity));

					red += quantity;
				} else {
					System.out.printf(
							"You bought " + quantity + " gallons of green paint, adding $%.2f to your total.%n",
							getGreenCost(quantity));

					green += quantity;
				}
			}

		}
		
		

		
		System.out.printf("Your total is: %.2f%n", 1.09 * (getRedCost(red) + getGreenCost(green)));
		// get the price, then multiply by 1.09 to get sum plus tax.
		System.out.println("Thank you for shopping at Mr. Kulla's Paint Store.");
		System.out.print("\n");
		Str.repeatChar('*', 31);
		System.out.println("*** Mr. Kulla's Paint Store ***");
		Str.repeatChar('*', 31);
		//only 10 digits of space is allotted because the max int size for java is 2,147,483,647(https://stackoverflow.com/questions/15004944/max-value-of-integer). Any more and the var type would have to be a long
		//actually the double size is a lot more[citation needed], so it would need to be 20 x bigger. To be safe, 13 digits should be enough.
		System.out.printf("*  Red Paint   %13.2f  *%n", getRedCost(red));
		System.out.printf("*  Green Paint %13.2f  *%n", getGreenCost(green));
		System.out.println("*                             *");
		System.out.printf("*  Subtotal    %13.2f  *%n", (getRedCost(red) + getGreenCost(green)));
		System.out.println("*                             *");
		System.out.printf("* 9%% Sales Tax %10.2f     *%n",
				(double) (0.09 * (getRedCost(red) + getGreenCost(green))));
		System.out.printf("*  Total         %13.2f  *%n", (1.09 * (getRedCost(red) + getGreenCost(green))));
		printThankYou();
		in.close();
	}

	private static double getRedCost(int quantity) {
		return 21.95 * quantity;
	}
	public static void printHeader() {
		Str.repeatChar('*', 31);
		System.out.println("*   Mr. Kulla's Paint Store   *");
		Str.repeatChar('*', 31);
	}
	public static void printThankYou() {
		System.out.println("*   Thank you for choosing    *");
		System.out.println("*  Mr. Kulla's Paint Store    *");
		Str.repeatChar('*', 31);
		
	}
	private static double getGreenCost(int quantity) {
		return 19.95 * quantity;
	}

}
