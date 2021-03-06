/*
 * Programmer: Jeffrey Meng
 * Date: Nov 1, 2017
 * Purpose:
 */

package methodsWorksheet5Extra;

import java.util.Scanner;
import utils.Num;

public class GradeData {

	public static void main(String[] args) {
		int students;
		double total = 0, min = 0, max = 0, tempGrade;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		students = in.nextInt();
		//this is unnecessary, but its in the directions. I'm going to assume you can not have zero students.
		while (students > 100 && students <	1) {
			System.out.print("Enter a integer between 1 and 100(inclusive): ");
			students = in.nextInt();
		}
		
		for (int i = 0; i < students; i ++) {
			
			System.out.print("Enter the grade for student " + (i + 1) + ": ");
			tempGrade = in.nextDouble();
			//not going to make sure because it's hard to tell between extra credit and percentages.
			while (tempGrade < 0) {
				System.out.print("Enter a number greater than zero as a percentage for student " + 
						(i + 1) + ": ");
				tempGrade = 0;
			}
			if (tempGrade < min || i == 0) {
				min = tempGrade;
			}
			if (tempGrade > max || i ==0) {
				max = tempGrade;
			}
			total = total + tempGrade;

			
		}
		System.out.println("The average is:" + Num.formatToString(total / students, "#.00"));
		System.out.println("The minimum is:" + Num.formatToString(min, "0.##"));
		System.out.println("The maximum is:" + Num.formatToString(max, "0.##"));

		in.close();
	}

}
