/*
 * Utility Package: Numbers
 * Jeffrey Meng
 */

package utils;

import java.text.DecimalFormat;

public class Num {
	/*
	 * The utils.Num class supports Doubles and Integers
	 * 
	 * 
	 */

	/*
	 * Formatting rules:
	 * If the number in the tens place is 1, return th(113th, 111th)
	 * Else, if the number in the ones place is 1, 2, or 3 return a special string(st, nd, or rd) else return th.
	 */
	/**
	 * Returns the string suffix for an number.
	 * 
	 * @param num - the number to get the suffix for.
	 * @return string suffix(st, nd, rd, or th)
	 */
	public static String getSuffix(int num) {
		// if the number in the 10's digit is 1, return th(11th, 111th, 4812th)
		if (num % 100 - num % 10 == 10) {
			return "th";
		} else {
			// check the number in
			switch (num % 10) {
			case 1:
				return "st";
			case 2:
				return "nd";
			case 3:
				return "rd";
			default:
				return "th";
			}
		}

	}
	
	public static String formatToString(double number, String format) {
		return new DecimalFormat(format).format(number);
	}
	public static String formatToString(int number, String format) {
		return new DecimalFormat(format).format(number);
	}

	public static String formatToString(double number) {
		return Double.toString(number);
	}
	public static String formatToString(int number) {
		return Integer.toString(number);
	}

	public static String formatDollar(double num) {

		return Num.formatToString(num, "0.00");
	}
	public static String formatDollar(int num) {

		return Num.formatToString(num, "0.00");
	}


	public static double getAverage(int... numbers) {

		double sum = 0;
		for (int i = 0; i < numbers.length; i ++) {
			sum = sum + numbers[i];
		}
		return sum / numbers.length;
	}
	public static double getAverage(double... numbers) {
		double sum = 0;
		for (int i = 0; i < numbers.length; i ++) {
			sum = sum + numbers[i];
		}
		return sum / numbers.length;
	}
	public static int max(int... numbers) {
		int max = numbers[0];
		for (int i = 0; i < numbers.length; i ++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}
	public static double max(double... numbers) {
		double max = numbers[0];
		for (int i = 0; i < numbers.length; i ++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}
	public static double min(double... numbers) {
		double min = numbers[0];
		for (int i = 0; i < numbers.length; i ++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}
	public static int min(int... numbers) {
		int min = numbers[0];
		for (int i = 0; i < numbers.length; i ++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}

}
