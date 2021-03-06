/*
 * Programmer: Jeffrey Meng
 * Date: Jan 5, 2018
 * Purpose:
 */

package dice;

import utils.Num;

public class DistributionTester {

	public static void main(String[] args) {
		Dice testDice = new Dice(10);
		int[] results = new int[10];
		for (int i = 0; i < 1000000; i ++) {
			results[testDice.roll() - 1] ++;
		}
		System.out.println(Num.formatToString(results));
		System.out.println("Min: " + Num.min(results));
		System.out.println("Max: " + Num.max(results));
		

	}

}
