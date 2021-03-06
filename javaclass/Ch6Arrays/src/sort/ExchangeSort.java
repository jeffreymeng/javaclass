/*
 * Programmer: Jeffrey Meng
 * Date: Nov 30, 2017
 * Purpose:
 */

package sort;

public class ExchangeSort {
	public static double[] asec(double[] array) {
		double temp;
		// go through each element
		for (int i = 0; i < array.length - 1; i++) {
			// for each element, go through each following element and swap
			for (int j = i + 1; j < array.length; j++) {
				// check if this is bigger than the last
				if (array[i] > array[j]) {
					// if it is, swap the two elements.
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}
			}
		}

		return array;

	}
	
	
	
	
	
	
	
	
	
	
	public static int[] asec(int[] array) {
		int temp;
		// go through each element
		for (int i = 0; i < array.length - 1; i++) {
			// for each element, go through each following element and swap
			for (int j = i + 1; j < array.length; j++) {
				// check if this is bigger than the last
				if (array[i] > array[j]) {
					// if it is, swap the two elements.
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}
			}
		}

		return array;

	}

	public static int[] dsec(int[] array) {
		int temp;
		// go through each element
		for (int i = 0; i < array.length - 1; i++) {
			// for each element, go through each following element and swap
			for (int j = i + 1; i < array.length - 1; j++) {
				if (j < 0) System.out.println(j);//Suppress j is never used warning
				// check if this is SMALLER than the last
				if (array[i] < array[i + 1]) {
					// if it is, swap the two elements.
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;

				}
			}
		}

		return array;

	}
}
