/*
 * Programmer: Jeffrey Meng
 * Date: Nov 14, 2017
 * Purpose:
 */

package arraysWorksheet1;

public class ArrayAverage {

	public static void main(String[] args) {
		double[] finalGrade = {85.8, 93.7, 76, 88.5, 100, 91.3};
		double sum = 0.0;
		for (int i = 0; i < finalGrade.length; i ++) {
			sum = sum + finalGrade[i];
		}
		System.out.println(sum / finalGrade.length);

	}
	

}
