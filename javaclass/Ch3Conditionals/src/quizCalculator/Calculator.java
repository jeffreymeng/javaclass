/*
 * Programmer: Jeffrey Meng
 * Date: Oct 10, 2017
 * Purpose:
 */

package quizCalculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int num1, num2, result = 0;
		String operation;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a positive number");
		num1 = in.nextInt();
		System.out.println("Enter another positive number");
		num2 = in.nextInt();
		in.nextLine();
		if (num1 <= 0 || num2 <= 0) {
			System.out.println("One or both numbers are less than zero.");
		} else {
			System.out.println("Choose an operation(add, subtract, mutiply, divide):");
			operation= in.nextLine();
			switch (operation) {
			case "add":
				result= num1 - num2;
				break;
			case "subtract":
				result = num1 - num2;
				break;
			case "mutiply":
				result = num1 * num2;
				break;
			case "divide":
				result = num1/num2;
			default:
				System.out.println("You did not enter an avaliable operation.");
			}
			System.out.println("Your result is: " + result); 
			
			
		}
		in.close();

	}

}
