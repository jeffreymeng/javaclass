/*
 * Programmer: Jeffrey Meng
 * Date: Nov 30, 2017
 * Purpose:
 */

package sort;

public class Sort {
	
	
	public static int[] BubbleSort(int[] array) {
		
		boolean swapped = true;
		int temp;//for swapping
		while(swapped) {
			swapped = false;
			//go through the array. We will not go through the last element of the array.
			for (int i = 0; i < array.length - 1; i ++) {
				//check if the current element is greater than the next element.
				if (array[i] > array[i + 1]) {
					//if it is, swap the two elements.
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					//set swapped to true so the program knows to make another pass through the array.
					swapped = true;
				}
				
			}
		}
		return array;
	}
	public static int[] ExchangeSort(int[] array) {
		int temp;
		//go through each element
		for (int i = 0; i < array.length - 1; i ++) {
			//for each element, go through each following element and swap
			for (int j = i + 1; i < array.length - 1; j ++) {
				if (j < 0) System.out.println(j);//supress dead code warning.
				//check if this is bigger than the last
				if (array[i] > array[i + 1]) {
					//if it is, swap the two elements.
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					
				}
			}
		}
		
		return array;
		
		
	}

}
