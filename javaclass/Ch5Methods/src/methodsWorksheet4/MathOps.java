/*
 * Programmer: Jeffrey Meng
 * Date: Oct 30, 2017
 * Purpose:
 */

package methodsWorksheet4;

import java.util.Scanner;

public class MathOps {
	public static void main(String[] args) {
		int num1, num2;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		num1 = in.nextInt();
		System.out.println("Enter another number:");
		num2 = in.nextInt();
		printSum(num1, num2);
		printProduct(num1, num2);
		in.close();
	}
	public static void printSum(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	public static void printProduct(int num1, int num2) {
		System.out.println(num1 * num2);
	}
}
