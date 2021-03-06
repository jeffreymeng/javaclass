/*
 * Programmer: Jeffrey Meng
 * Date: Jan 10, 2018
 * Purpose:
 */

package box;

import java.util.Scanner;

public class BoxTest {

	public static void main(String[] args) {
		String newBox = "yes";

		String units, name;
		int length, width, height;
		Box[] boxes = new Box[100];
		int index = 0;
		String input;
		Scanner in = new Scanner(System.in);
		System.out.println("BoxMaker");
		while (newBox.equalsIgnoreCase("yes")) {
			System.out.println("Enter the length of your box:");
			length = in.nextInt();
			System.out.println("Enter the height of your box:");
			height = in.nextInt();
			System.out.println("Enter the width of your box:");
			width = in.nextInt();
			in.nextLine();
			System.out.println("Enter the units you used for your box:");
			units = in.nextLine();
			System.out.println("Enter the name of your box:");
			name = in.nextLine();
			boxes[index] = new Box(length, width, height, units, name);
			System.out.println(name + " is " + length + units + " by " + width
					+ units + " by " + height + units + ".");
			System.out.println("The volume of your box is: "
					+ boxes[index].volume());
			System.out.println("The surface area of your box is: "
					+ boxes[index].surfaceArea());
			if (index == boxes.length) {
				System.out
						.println("You have excedded your box storage quota. Enter yes to clear all boxes and create a new one, or no to quit.");
				input = in.nextLine();
				while (!input.equalsIgnoreCase("yes")
						&& !input.equalsIgnoreCase("no")) {
					System.out.println("Enter yes or no");
					input = in.nextLine();
				}
				if (input == "yes")
					boxes = new Box[100];
			} else {
				System.out
						.println("Would you like to make another box(yes/no)?");
				input = in.nextLine();
				while (!input.equalsIgnoreCase("yes")
						&& !input.equalsIgnoreCase("no")) {
					System.out.println("Enter yes or no");
					input = in.nextLine();
				}
			}

		}
		in.close();

	}

}
