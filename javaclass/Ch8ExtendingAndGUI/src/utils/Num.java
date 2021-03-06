/*
 * Utility Package: Numbers
 * Jeffrey Meng
 */

package utils;

import java.text.DecimalFormat;

public class Num {
	/*
	 * The utils.Num class generally supports Doubles, Integers, and floats.
	 * Also in some cases Double[], Int[], and Float[]
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
	
	/**
	 * Formats a decimal as a string.
	 * @param number - A double to format
	 * @param format - A DecimalFormat string
	 * @return a decimal formatted double.
	 */
	public static String formatToString(double number, String format) {
		return new DecimalFormat(format).format(number);
	}
	
	/**
	 * Formats an integer as a string with the given format
	 * @param number - A integer to format
	 * @param format - A DecialFormat string
	 * @return a decimal formatted integer
	 */
	public static String formatToString(int number, String format) {
		return new DecimalFormat(format).format(number);
	}
	
	/**
	 * Formats an float as a string with the given format
	 * @param number - A float to format
	 * @param format - A DecialFormat string
	 * @return a decimal formatted float
	 */
	public static String formatToString(float number, String format) {
		return new DecimalFormat(format).format(number);
	}
	
	/**
	 * Formats an array of doubles into a string.
	 * @param start - A string to place at the start "cap" of the array(e.g. in {5, 6} start would be "{"
	 * @param seperator - A string to use to separate individual elements(e.g. in {5, 6} separator would be ", "
	 * @param end - A string to place at the end "cap" of the array(e.g. in {5, 6} end would be "]"
	 * @param arr - Either an double array or an infinite number of doubles to be put into an array. This is the array that will be formatted.
	 * @return An string formatted based on the parameters and array data.
	 */
	public static String formatToString(String start, String seperator, String end, double... arr) {
		String toReturn = "[";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				toReturn += arr[i];

			} else {
				toReturn += (arr[i] + ", ");
			}
			
		}
		return toReturn + "]";
	}

	/**
	 * Formats an array of doubles into a string.
	 * @param arr - Either an double array or an infinite number of parameters to format
	 * @return An string formatted based on array data like this: [3, 5, 1, 4]
	 */
	public static String formatToString(double... arr) {
		return formatToString("[", ", ", "]", arr);
	}
	/**
	 * Formats an array of integers into a string.
	 * @param start - A string to place at the start "cap" of the array(e.g. in {5, 6} start would be "{"
	 * @param seperator - A string to use to separate individual elements(e.g. in {5, 6} separator would be ", "
	 * @param end - A string to place at the end "cap" of the array(e.g. in {5, 6} end would be "]"
	 * @param arr - Either an integer array or any number of integer parameters, to be formatted as a string representation of the array.
	 * @return An string formatted based on the parameters and array data.
	 */
	public static String formatToString(String start, String seperator, String end, int... arr) {
		String toReturn = "[";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				toReturn += arr[i];

			} else {
				toReturn += (arr[i] + ", ");
			}
			
		}
		return toReturn + "]";
	}
	
	
	/**
	 * Formats an array of integers into a string.
	 * @param arr - Either an integer array or any number of integer parameters, to be formatted as a string representation of the array.
	 * @return A string representation of the integer array.
	 */
	public static String formatToString(int... arr) {
		return formatToString("[", ", ", "]", arr);
	}
	
	/**
	 * Formats an array of floats into a string.
	 * @param start - A string to place at the start "cap" of the array(e.g. in {5, 6} start would be "{"
	 * @param seperator - A string to use to separate individual elements(e.g. in {5, 6} separator would be ", "
	 * @param end - A string to place at the end "cap" of the array(e.g. in {5, 6} end would be "]"
	 * @param arr - Either an float array or any number of float parameters, to be formatted as a float representation of the array.
	 * @return An string formatted based on the parameters and array data.
	 */
	public static String formatToString(String start, String seperator, String end, float... arr) {
		String toReturn = "[";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				toReturn += arr[i];

			} else {
				toReturn += (arr[i] + ", ");
			}
			
		}
		return toReturn + "]";
	}
	
	
	/**
	 * Formats an array of floats into a string.
	 * @param arr - Either an float array or any number of float parameters, to be formatted as a string representation of the array.
	 * @return A string representation of the integer array.
	 */
	public static String formatToString(float... arr) {
		return formatToString("[", ", ", "]", arr);
	}
	
	/**
	 * Formats a double as a string.
	 * @param number - The double to format.
	 * @return A string representation of the double.
	 */
	public static String formatToString(double number) {
		return Double.toString(number);
	}
	
	/**
	 * Formats an integer as a string.
	 * @param number - The integer to format.
	 * @return A string representation of the integer.
	 */
	public static String formatToString(int number) {
		return Integer.toString(number);
	}
	/**
	 * Formats an float as a string.
	 * @param number - The float to format.
	 * @return A string representation of the float.
	 */
	public static String formatToString(float number) {
		return Float.toString(number);
	}

	/**
	 * Formats a double as money, forcing two decimal places and rounding off any further decimal places, without the dollar sign.
	 * @param num - The double to format as money.
	 * @return A string representation of the double as money.
	 */
	public static String formatDollar(double num) {

		return Num.formatToString(num, "0.00");
	}
	
	/**
	 * Formats an integer as money, forcing two decimal places and rounding off any further decimal places, without the dollar sign.
	 * @param num - The integer to format as money.
	 * @return A string representation of the integer as money.
	 */
	public static String formatDollar(int num) {

		return Num.formatToString(num, "0.00");
	}
	
	/**
	 * Formats an float as money, forcing two decimal places and rounding off any further decimal places, without the dollar sign.
	 * @param num - The float to format as money.
	 * @return A string representation of the float as money.
	 */
	public static String formatDollar(float num) {

		return Num.formatToString(num, "0.00");
	}

	/**
	 * Gets the average of an array of integers.
	 * @param numbers - Either an array of integers of any number of arguments containing integers.
	 * @return a double containing the average of the above parameter.
	 */
	public static double getAverage(int... numbers) {

		double sum = 0;
		for (int i = 0; i < numbers.length; i ++) {
			sum = sum + numbers[i];
		}
		return sum / numbers.length;
	}
	
	/**
	 * Gets the average of an array of doubles.
	 * @param numbers - Either an array of doubles of any number of arguments containing doubles.
	 * @return a double containing the average of the above parameter.
	 */
	public static double getAverage(double... numbers) {
		double sum = 0;
		for (int i = 0; i < numbers.length; i ++) {
			sum = sum + numbers[i];
		}
		return sum / numbers.length;
	}
	
	/**
	 * Gets the average of an array of float.
	 * @param numbers - Either an array of float of any number of arguments containing doubles.
	 * @return a float containing the average of the above parameter.
	 */
	public static float getAverage(float... numbers) {
		float sum = 0;
		for (int i = 0; i < numbers.length; i ++) {
			sum = sum + numbers[i];
		}
		return sum / numbers.length;
	}
	
	/**
	 * Gets the greatest element out of an array of integers.
	 * @param numbers - Either an array of integers of any number of arguments containing integers.
	 * @return an integer, the index of the element containing the greatest integer in the array.
	 */
	public static int max(int... numbers) {
		int max = 0;
		for (int i = 0; i < numbers.length; i ++) {
			if (numbers[i] > numbers[max]) {
				max = i;
			}
		}
		return max;
	}
	
	/**
	 * Gets the greatest element out of an array of doubles.
	 * @param numbers - Either an array of doubles of any number of arguments containing doubles.
	 * @return an integer, the index of the element containing the greatest integer in the array.
	 */
	public static double max(double... numbers) {
		int max = 0;
		for (int i = 0; i < numbers.length; i ++) {
			if (numbers[i] > numbers[max]) {
				max = i;
			}
		}
		return max;
	}
	//TODO: overload to accept start and stop index.
	/**
	 * Gets the lowest element out of an array of doubles.
	 * @param numbers - Either an array of doubles of any number of arguments containing doubles.
	 * @return an integer, the index of the element containing the lowest integer in the array.
	 */
	public static double min(double... numbers) {
		int min = 0;
		for (int i = 0; i < numbers.length; i ++) {
			if (numbers[i] < numbers[min]) {
				min = i;
			}
		}
		return min;
	}
	

	/**
	 * Gets the lowest element out of an array of integers.
	 * @param numbers - Either an array of doubles of any number of arguments containing doubles.
	 * @return an integer, the index of the element containing the lowest integer in the array.
	 */
	public static int min(int... numbers) {
		int min = 0;
		for (int i = 0; i < numbers.length; i ++) {
			if (numbers[i] < numbers[min]) {
				min = i;
			}
		}
		return min;
	}

}
