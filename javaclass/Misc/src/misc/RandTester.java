/*
 * Programmer: Jeffrey Meng
 * Date: Oct 9, 2017
 * Purpose: tests weighting of random numbers.
 */

package misc;

public class RandTester {

	public static void main(String[] args) {
		//int randNum = (int) (Math.random() * 10) + 1;
		int tests = 10000;
		int min = 1;
		int max = 10;
		int rand = 0;
		int i = 0;
		int[] results = new int[max + 1];//the slots less than min will be empty.
		System.out.println(results.length);
		while (i < tests) {
			rand = (int) (Math.random() * max) + min;
			System.out.println(rand);
			results[rand] += 1;
			i ++;
		}
		i = 0;
		while (i < results.length) {
			System.out.println(i + ": " + results[i]);
			 i ++;
		}

	}

}
