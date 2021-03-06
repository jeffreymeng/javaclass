/*
 * Programmer: Jeffrey Meng
 * Date: Nov 30, 2017
 * Purpose:
 */

package sort;

public class BubbleSort {

	public static int[] asec(int[] array) {

		boolean swapped = true;
		int temp;// for swapping
		while (swapped) {
			swapped = false;
			// go through the array. We will not go through the last element of
			// the array.
			for (int i = 0; i < array.length - 1; i++) {
				// check if the current element is greater than the next
				// element.
				if (array[i] > array[i + 1]) {
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

	public static int[] dsec(int[] array) {

		boolean swapped = true;
		int temp;// for swapping
		while (swapped) {
			swapped = false;
			// go through the array. We will not go through the last element of
			// the array.
			for (int i = 0; i < array.length - 1; i++) {
				// check if the current element is LESS than the next element.
				if (array[i] < array[i + 1]) {
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

}
