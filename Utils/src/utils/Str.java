/*
 * Programmer: Jeffrey Meng
 * Date: Oct 25, 2017
 * Purpose:
 */

package utils;

public class Str {
	// to save some space instead of copying and pasting I'll invoke this base
	// method
	public static void repeatCharBase(String s, int count, boolean newLine) {
		for (int i = 0; i < count; i++) {
			System.out.print(s);
		}
		if (newLine) {
			System.out.println("");
		}
	}

	public static void repeatChar(char c, int count) {
		repeatCharBase(String.valueOf(c), count, true);
	}

	public static void repeatChar(String c, int count) {
		repeatCharBase(c, count, true);
	}

	public static void repeatChar(char c, int count, boolean newLine) {
		repeatCharBase(String.valueOf(c), count, newLine);
	}

	public static void repeatChar(String c, int count, boolean newLine) {
		repeatCharBase(c, count, newLine);
	}

}
