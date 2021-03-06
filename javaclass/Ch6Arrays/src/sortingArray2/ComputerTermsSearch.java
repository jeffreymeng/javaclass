/*
 * Programmer: Jeffrey Meng
 * Date: Dec 1, 2017
 * Purpose:
 */
package sortingArray2;

import java.util.Scanner;

import utils.Num;

public class ComputerTermsSearch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] array = new String[10];
		for (int i = 0; i < 10; i ++) {
			System.out.println("Please enter the name of the " + (i + 1) + Num.getSuffix(i+1) + " computer term:");
			array[i] = in.nextLine();
		}
		
		printArray(array);
		printArray(stringBubbleSort(array));
		binarySearch(array, 0, array.length, "keyboard");
		in.close();
	}

	public static String[] stringBubbleSort(String[] array) {
		//modified for use with chars from sort.BubbleSort;

		boolean swapped = true;
		String temp;// for swapping
		while (swapped) {
			swapped = false;
			// go through the array. We will not go through the last element of
			// the array.
			for (int i = 0; i < array.length - 1; i++) {
				// check if the current element is greater than the next
				// element.
				if (array[i].compareTo(array[i + 1]) > 0) {//compares two strings lexicographically
					// if it is, swap the two elements.
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					// set swapped to true so the program knows to make another
					// pass through the array.
					swapped = true;
				}

			}
		}
		return array;
	}
	//from Mr. Kulla
	public static void binarySearch(String[] array,int lowerbound, int upperbound, String key)
	{
		int position;
		// To start, find the subscript of the middle position.
		position = ( lowerbound + upperbound) / 2;
		while((!array[position].equals(key) ) && (lowerbound <= upperbound))
		{
			if (array[position].compareTo(key) > 0)// If the number is > key, decrease position by one.
			{
				upperbound = position - 1;
			}
			else
			{
				lowerbound = position + 1; // else, increase position by one.
			}
			position = (lowerbound + upperbound) / 2;
		}
		if (lowerbound <= upperbound)
		{
			System.out.println("The word keyboard was found in array subscript " + position);

		}
		else
			System.out.println("keyboard was not found in the array.");
	}
	public static void printArray(String... arr) {
		System.out.print("{");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i]);

			} else {
				System.out.print(arr[i] + ", ");
			}

		}
		System.out.println("}");
	}
}
