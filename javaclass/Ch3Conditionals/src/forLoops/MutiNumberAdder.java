/*
 * Programmer: Jeffrey Meng
 * Date: Oct 11, 2017
 * Purpose:
 */

package forLoops;

import java.util.Scanner;

public class MutiNumberAdder {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count, result = 0;
		String suffix;
		
		System.out.print("=======Muti number adder========\nHow many numbers to add?:");
		count = in.nextInt();
		System.out.print("\n");
		for (int i = 1; i < count + 1; i ++) {
			
			if (i % 100 - i % 10 == 10) {//checks if the value of the digit in the 10s place is 10,
				//because 11-13 also end in th
				suffix = "th";
			} else {
				switch (i % 10) {//get the first digit of a number
				case 1:
					suffix = "st";
					break;
				case 2:
					suffix = "nd";
					break;
				case 3:
					suffix = "rd";
					break;
				default:
					suffix = "th";
				}
			}
			System.out.print("Enter the " + i + suffix + " number:");
			result += in.nextInt();
		}
		System.out.println("Sum: " + result);
		in.close();

	}

}
