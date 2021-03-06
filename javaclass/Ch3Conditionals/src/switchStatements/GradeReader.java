/*
 * Programmer: Jeffrey Meng
 * Date: Sep 29, 2017
 * Purpose: Print a message according to the user's grade.
 */

package switchStatements;

import java.util.Scanner;

public class GradeReader {

	public static void main(String[] args) {
		char grade;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your grade:");
		grade = in.next().toUpperCase().charAt(0);
		
		switch (grade) {
			case 'A':
				System.out.println("Your work is outstanding!");
				break;
			case 'B':
				System.out.println("You are doing good work!");
				break;
			case 'C':
				System.out.println("Your work is satisfactory.");
				break;
			case 'D':
				System.out.println("You need to work a little harder.");
				break;
			case 'F':
				System.out.println("Please see me for extra help!");
				break;
			default:
				System.out.println("You did not enter A, B, C, D, or F");
		}
		in.close();
	}

}
