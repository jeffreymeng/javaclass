/*
 * Programmer: Jeffrey Meng
 * Date: Dec 1, 2017
 * Purpose:
 */
package sortingArray2;

import java.util.Scanner;

import utils.Num;

public class FriendsSortAndSearch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean found = false;
		String[] array = new String[5];
		for (int i = 0; i < 5; i ++) {
			System.out.println("Please enter the name of your " + (i + 1) + Num.getSuffix(i+1) + " friend:");
			array[i] = in.nextLine();
		}
		
		printArray(array);
		printArray(stringBubbleSort(array));
		for (int i = 0; i < array.length; i ++) {
			if (array[i].equalsIgnoreCase("Bob")) {
				found = true;
				System.out.println("Bob was found at the " + (i) + Num.getSuffix(i) + "element.");
				break;
			}
			
		}
		if(!found) {
			System.out.println("Bob was not found.");
		}
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
