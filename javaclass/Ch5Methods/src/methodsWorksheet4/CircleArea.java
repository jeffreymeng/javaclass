/*
 * Programmer: Jeffrey Meng
 * Date: Oct 30, 2017
 * Purpose: Prints the area and radi of circles with int radi 1 - 10
 */

package methodsWorksheet4;

import java.text.DecimalFormat;

public class CircleArea {

	public static void main(String[] args) {
		DecimalFormat df1 = new DecimalFormat("0.#");
		
		for (int i = 1; i <= 10; i ++) {
			System.out.println(i + ": " + df1.format(getArea(i)));
		}
	}
	public static double getArea(int radius) {
		return Math.PI * Math.pow(radius, 2);
	}

}
