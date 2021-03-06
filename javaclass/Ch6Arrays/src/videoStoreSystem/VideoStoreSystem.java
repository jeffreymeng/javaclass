/*
 * Programmer: Jeffrey Meng
 * Date: Dec 6, 2017
 * Purpose:
 */

package videoStoreSystem;

public class VideoStoreSystem {
	
	public static void main(String[] args) {

		// should use global vars but Mr. Kulla wont let us
		String[] name = { "Stefan", "Dylan", "Nathan", "Kevin", "Ian", "Edgar",
				"Jane", "Mary", "Brian", "Jason" };
		int[] customerId = { 871, 2, 873, 874, 875, 876, 8, 879, 880, 881 };
		int[] movieId = { 1047, 1092, 1037, 1026, 1025, 9186, 9287, 4639, 7593,
				4791 };
		int[] rentalCode = { 1, 5, 1, 5, 5, 1, 1, 5, 1, 5 };
		int[] daysCustomerHadMovie = { 0, 4, 2, 6, 5, 1, 3, 3, 2, 6 };
		boolean[] late = new boolean[10];// primitive boolean initializes as
											// false
		double[] lateFee = new double[10];

		calculateLateFees(name, daysCustomerHadMovie, rentalCode, lateFee, late);
		
		printCustomers(name, customerId, movieId, rentalCode, daysCustomerHadMovie, late, lateFee);

	}

	public static void printCustomers(String[] name, int[] customerId,
			int[] movieId, int[] rentalCode, int[] daysCustomerHadMovie,
			boolean[] late, double[] lateFee) {
		System.out.println("====== Late Customers ======");
		System.out.printf("Customer     Days Late   Late Fees%n");
		for (int i = 0; i < name.length; i++) {
			if (late[i]) {
				System.out.printf("%-10s   %-10d  %-9.2f%n", name[i],
						daysCustomerHadMovie[i] - rentalCode[i], lateFee[i]);
			}
		}
		System.out.println("===== Non Late Customers =====");
		System.out.printf("Customer     Days Left  %n");
		for (int i = 0; i < name.length; i++) {
			if (!late[i]) {
				System.out.printf("%-10s   %-10d  %n", name[i], rentalCode[i]
						- daysCustomerHadMovie[i]);
			}
		}
	}

	public static void calculateLateFees(String[] name,
			int[] daysCustomerHadMovie, int[] rentalCode, double[] lateFee,
			boolean[] late) {
		for (int i = 0; i < name.length; i++) {
			if (daysCustomerHadMovie[i] > rentalCode[i]) {
				lateFee[i] = (daysCustomerHadMovie[i] - rentalCode[i])
						* (rentalCode[i] > 1 ? 0.69 : 1.49);
				// java ternary operator- condition ? value if true : value if false

				late[i] = true;
			}
		}

	}

	public static void sortByCustomerId(String[] name, int[] customerId,
			int[] movieId, int[] rentalCode, int[] daysCustomerHadMovie,
			boolean[] late, double[] lateFee) {
		boolean swapped = true;

		while (swapped) {
			swapped = false;
			// go through the array. We will not go through the last element of
			// the array.
			for (int i = 0; i < name.length - 1; i++) {
				// check if the current element is greater than the next
				// element.
				if (customerId[i] > customerId[i + 1]) {
					// if it is, swap the two elements and all parallel
					// elements.

					swap(i, name, customerId, movieId, rentalCode,
							daysCustomerHadMovie, late, lateFee);

					// set swapped to true so the program knows to make another
					// pass through the array.
					swapped = true;
				}

			}
		}
	}

	public static void swap(int i, String[] name, int[] customerId,
			int[] movieId, int[] rentalCode, int[] daysCustomerHadMovie,
			boolean[] late, double[] lateFee) {
		int intTemp;// for swapping
		String stringTemp;// one temp for each data type
		boolean booleanTemp;
		double doubleTemp;
		// not sure if this is the most efficient way
		stringTemp = name[i];
		name[i] = name[i + 1];
		name[i + 1] = stringTemp;

		intTemp = customerId[i];
		customerId[i] = customerId[i + 1];
		customerId[i + 1] = intTemp;

		intTemp = movieId[i];
		movieId[i] = movieId[i + 1];
		movieId[i + 1] = intTemp;

		intTemp = rentalCode[i];
		rentalCode[i] = rentalCode[i + 1];
		rentalCode[i + 1] = intTemp;

		intTemp = daysCustomerHadMovie[i];
		daysCustomerHadMovie[i] = daysCustomerHadMovie[i + 1];
		daysCustomerHadMovie[i + 1] = intTemp;

		booleanTemp = late[i];
		late[i] = late[i + 1];
		late[i + 1] = booleanTemp;

		doubleTemp = lateFee[i];
		lateFee[i] = lateFee[i + 1];
		lateFee[i + 1] = doubleTemp;
	}
}
