/*
 * Programmer: Jeffrey Meng
 * Date: Dec 1, 2017
 * Purpose:
 */
package sortingArray2;


public class AlphabeticalOrder {

	public static void main(String[] args) {
		String[] array = {"camel", "ant", "dog", "cat", "horse", "mule", "java", "goose"};
		printArray(array);
		printArray(stringBubbleSort(array));
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
