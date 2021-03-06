/*
 * Programmer: Jeffrey Meng
 * Date: Sep 26, 2017
 * Purpose: Determine if the user is elegible to see a movie based on age.
 */

package moreConditionalWork;

import java.util.Scanner;

public class MovieAdmission {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name;
		int age;
		System.out.println("Enter your first name:");
		name = in.nextLine();
		System.out.println("Enter your age:");
		age = in.nextInt();
		if (age < 17) 
			System.out.println("Sorry, this movie is rated \"R\". Admission denied, " + name);
		else
			System.out.println("Welcome to the movie, " + name);
		in.close();
	}

}
