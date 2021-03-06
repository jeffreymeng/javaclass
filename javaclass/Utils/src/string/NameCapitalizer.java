/*
 * Programmer: Jeffrey Meng
 * Date: Oct 6, 2017
 * Purpose:
 */

package string;

public class NameCapitalizer {

	public static void main(String[] args) {
		// when we learn methods Ill make this into a method with these params
		// PARAMS
		String name = "";
		String full = "";

		// ===String Formatting===
		// Gets the first letter of the user's name, makes it uppercase if not
		// already, then adds it to the rest of the user's name string.
		name = full.substring(0, 1).toUpperCase()
				+ full.substring(1, full.indexOf(' '));
		// adds the user's first name, formatted above, to the first two letters
		// of the last name(space
		// and the first letter of their last name to the rest of their last
		// name)
		full = name
				+ (full.substring(full.indexOf(' '), full.indexOf(' ') + 2)
						.toUpperCase() + full.substring(full.indexOf(' ') + 2));
		// end string formatting
		
		//print output since this isnt a method
		System.out.println(name);
		System.out.println(full);
	}

}
