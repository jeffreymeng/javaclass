/*
 * Programmer: Jeffrey Meng
 * Date: Sep 22, 2017
 * Purpose: Gets the lengths of the sides of a triangle from the user, then tells the type of the triangle.
 */

package logicalOperators;

import java.util.Scanner;

public class TriangleType {

	public static void main(String[] args) {
		int s1, s2, s3;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the length of the first side of the triangle:");
		s1 = in.nextInt();
		System.out.println("Enter the length of the second side of the triangle:");
		s2 = in.nextInt();
		System.out.println("Enter the length of the third side of the triangle:");
		s3 = in.nextInt();
		
		if (s1 + s2 > s3 && s2 + s3 > s1 && s3 + s1 > s2) {
			if (s1 == s2 && s2 == s3) {
				System.out.println("You have an equilateral triangle.");
			} else if (s1 == s2 || s2 == s3 || s1 == s3) {
				System.out.println("You have an isosceles triangle.");
			} else {
				System.out.println("You have an scalene triangle.");
			}
		} else {
			System.out.println("That's not a triangle!");
		}
		
		in.close();

	}	

}
