/*
 * Programmer: Jeffrey Meng
 * Date: Oct 30, 2017
 * Purpose:
 */

package methodsWorksheet4;

import java.util.Scanner;

public class SeperateName {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name;
		System.out.println("What is your name?");
		name = in.nextLine();
		
		for (int i = 0; i < name.length(); i ++) {
			System.out.println(name.charAt(i));
		}
		System.out.println("Goodbye, " + name);
		
		in.close();

	}

}
