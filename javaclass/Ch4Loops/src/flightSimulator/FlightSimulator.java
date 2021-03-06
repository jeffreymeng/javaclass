/*
 * Programmer: Jeffrey Meng
 * Date: Oct 17, 2017
 * Purpose: A flight simulator(sort of, not really)
 */

package flightSimulator;

import java.util.Scanner;

public class FlightSimulator {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int aircraft, adjustChoice, changeCount = 0;
		boolean skipChoose = false, firstTimeLooping = true;
		char alterAnother = 'y';
		// first time looping: if the do while
		// loop was run the first time or not. This will affect the statements
		// made.(an vs. another)
		String aircraftName = "";
		// exitLoop: whether to exit the loop which contains the
		// switch statement for the characteristic change menu
		// skipChoose: whether to skip the choose another characteristic
		// menu(set to true if the user does not enter a number between 1 and 4
		// while changing a charcteristic)

		// Whether characteristic one, two, three, etc. was changed.
		boolean charOne = false, charTwo = false, charThree = false, charFour = false, charFive = false, charSix = false, charAlreadyAdjusted = false;
		// char already adjusted is whether the characteristic has already been
		// adjusted(so we only print the messag once)

		// can't think of a better way to do this until we learn arrays.

		// 1. get aircraft model
		System.out
				.println("------------ NASA Vertical Motion Simulator -------------");
		System.out
				.print("\nSelect an aircraft model to simulate\n\t1. Blimp\n\t2. Helicopter\n\t"
						+ "3. Fighter Jet\n\t4. Space Shuttle\nEnter a choice(1-4): ");
		aircraft = in.nextInt();
		// error trap
		while (aircraft < 1 || aircraft > 4) {
			System.out.print("Please enter an number between 1 and 4: ");
			aircraft = in.nextInt();
		}
		// this will be useful later.
		switch (aircraft) {
		case 1:
			aircraftName = "Blimp";
		case 2:
			aircraftName = "Helicopter";
		case 3:
			aircraftName = "Fighter Jet";
		case 4:
			aircraftName = "Space Shuttle";
		}

		// 2 - 3. Select characteristic
		System.out
				.println("\n\nThe following charistics can be changed during this flight:");
		System.out
				.print("\t1. Position Trim(Trim)\n\t2. Force Breakout(Return-to-Center Force)");
		System.out
				.print("\n\t3. Force Gradient(Spring Force)\n\t4.Force Friction\n\t");
		System.out.print("5. Damping\n\t6. Hard Stop");

		// loop through characteristics to allow them to change it.
		do {
			// change the message based on whether they have already adjusted.
			if (firstTimeLooping) {
				System.out.print("\nSelect an option to adjust(1-6): ");
				firstTimeLooping = false;
			} else {
				System.out.print("\nSelect another option to adjust(1-6): ");
			}

			adjustChoice = in.nextInt();
			while (adjustChoice > 6 || adjustChoice < 1) {
				System.out.print("Please enter a number between one and six: ");
				adjustChoice = in.nextInt();
			}
			// we increment changeCount here. If there is an error, we'll deduct
			// one later.
			changeCount++;
			switch (adjustChoice) {
			case 1:

				System.out
						.println("Position Trim(Trim): Thr positon to which a flight control returns "
								+ "\nwith a pilot");
				if (charOne)
					charAlreadyAdjusted = true;// we set the charAlreadyAdjusted
												// variable so we can print a
												// message
												// at the bottom.
				else
					charOne = true;// characteristic one has been modified.

				break;
			case 2:
				System.out
						.println("Force Breakout(Return-To-Center Force):A force that returns a control to Trim."
								+ "\nThis is a constant force applied twords Trim which remains the same despite how far the "
								+ "\ncontrol is moved(displacement) and how fast a control is moved(velocity).");
				if (charTwo)
					charAlreadyAdjusted = true;
				else
					charTwo = true;

				break;
			case 3:
				System.out
						.println("Force Gradient(Spring Force): A force that returns a control to Trim"
								+ "\n, but one that varies with displacement. The farther the control is moved, "
								+ "\nthe stronger the force applied twords trim.");
				if (charThree)
					charAlreadyAdjusted = true;
				else
					charThree = true;

				break;
			case 4:
				System.out
						.println("Force Friction: A constant force that is opposite"
								+ "\n to the direction of movement.");
				if (charFour)
					charAlreadyAdjusted = true;
				else
					charFour = true;

				break;
			case 5:
				System.out
						.println("Damping: A force that is opposite to the direction of"
								+ "\n movement. Dampning varies with velocity. The faster a control is moved, the stronger the force.");
				if (charFive)
					charAlreadyAdjusted = true;
				else
					charFive = true;

				break;
			case 6:
				System.out
						.println("Hard Stop: A force that simulates a mechanical limit of travel. "
								+ "\nBy varing the Hard Stop, the range of travel can be adjusted.");
				if (charSix)
					charAlreadyAdjusted = true;
				else
					charSix = true;

				break;
			default:
				// they did not enter a valid number
				changeCount--;
				System.out
						.println("That was not a valid integer between 1 and 6:");
				skipChoose = true;

			}
			if (charAlreadyAdjusted) {
				System.out
						.println("(You've already adjusted this charcteristic, so it won't be counted again)");
				charAlreadyAdjusted = false;
				// we don't want to double count characteristics
				changeCount--;
			}
			if (skipChoose) {
				skipChoose = false;
			} else {
				in.nextLine();
				System.out
						.println("\nWould you like to alter another characteristic(y/n)?");
				alterAnother = in.nextLine().toLowerCase().charAt(0);
				while (alterAnother != 'n' && alterAnother != 'y') {
					System.out.println("Please enter either y or n:");
					alterAnother = in.nextLine().toLowerCase().charAt(0);
				}
			}
		} while (alterAnother != 'n');
		System.out.println("You altered " + changeCount + " characteristics"
				+ " for the " + aircraftName + ".");
		in.close();
	}

}
