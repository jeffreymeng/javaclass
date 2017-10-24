/*
 * Programmer: Jeffrey Meng
 * Date: Oct 24, 2017
 * Purpose: Write a method that takes 3 arguments. and print a char a certain number of times.
 */

package methodsWorksheet1;

public class RepeatPrintChar {

	public static void main(String[] args) {
		printChar('J', 12, 6);

	}
	public static void printChar(char letter, int timesPerLine, int lines) {
		for (int rows = 0; rows < lines; rows++ ) {
			for (int lineIndex = 0; lineIndex < timesPerLine; lineIndex ++) {
				System.out.print(letter);
			}
			System.out.println();
		}
	}

}
