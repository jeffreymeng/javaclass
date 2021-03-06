/*
 * Programmer: Jeffrey Meng
 * Date: Oct 25, 2017
 * Purpose: Print dollar signs and an address.
 */

package methodsWorksheet2;

public class Address {

	public static void main(String[] args) {
		repeatChar('$', 30);
		repeatChar('$', 30);
		printAddress();
		repeatChar('$', 30);
		repeatChar('$', 30);
		repeatChar('$', 30);

	}
	public static void repeatChar(char charcter, int count) {
		for (int i = 0; i < count; i ++) {
			System.out.print(charcter);
		}
		System.out.println("");
	}
	public static void printAddress() {
		System.out.println("Johnny Appleseed");
		System.out.println("19753 Apple Dr.");
		System.out.println("Merced, CA, 95015");
	}

}
