/*
 * Programmer: Jeffrey Meng
 * Date: Oct 10, 2017
 * Purpose:
 */

package commandLine;

import java.util.Scanner;

public class CommandLine {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("In Development.");
		System.out.println("Autorun EquationSolver Module");
		EquationSolver.run(in.nextLine());
		in.close();
		
	}

}
