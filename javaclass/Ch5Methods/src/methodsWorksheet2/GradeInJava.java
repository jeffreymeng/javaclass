/*
 * Programmer: Jeffrey Meng
 * Date: Oct 25, 2017
 * Purpose:
 */

package methodsWorksheet2;

import java.util.Scanner;

public class GradeInJava {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int avg;
		
		System.out.println("What is your average in Java right now?");
		avg = in.nextInt();
		//I'm going to assume you can get negative grades and over a hundred grades.
		if (avg >= 65) {
			passing();
		} else {
			failing();
		}
		in.close();
	}
	
	public static void passing() {
		System.out.println("You're passing!");
	}
	public static void failing() {
		System.out.println("Hook up with a smart classmate and STUDY!");
	}

}
