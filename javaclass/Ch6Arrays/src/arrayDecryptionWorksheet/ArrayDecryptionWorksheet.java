/*
 * Programmer: Jeffrey Meng
 * Date: Nov 27, 2017
 * Purpose: "decrypt" a string of characters.
 */

package arrayDecryptionWorksheet;

public class ArrayDecryptionWorksheet {

	public static void main(String[] args) {
		// Decrypting information
		// first word is in the 0th position
		// odd words use third and fourth characters
		// even words use only the fifth character
		String[] data = {"Nexa2f5",
				"z52Bizlm",
				"Diskapr",
				"emkem9sd",
				"LaWYr4Us",
				"dAStn78L",
				"mPTuriye",
				"aaeeiuUu",
				"IL8Ctmpn"};
		String result = "";
		
		
		for (int i = 0; i < data.length; i ++) {
			if (i % 2 == 1) {//number is odd
				//start counting at zero
				result += data[i].substring(2, 4);//(inclusive, exclusive)
				
			} else {
				//number is not odd
				result += data[i].charAt(4);

			}
		}
		
		System.out.println(result);

	}

}
