/*
 * Programmer: Jeffrey Meng
 * Date: Oct 23, 2017
 * Purpose: Allow the user to flip a coin, then analyze the result.
 */

package eclipseQuiz;

import java.util.Scanner;

public class EclipseQuiz {

	public static void main(String[] args) {
		int headCount = 0, tailCount = 0, flips;// Flips: number of requested flips
		String flip;//Flip: the result of the flip.
 		Scanner in = new Scanner(System.in);
 		double percentHeads, percentTails;

		System.out.print("How many flips to analyze? ");
		flips = in.nextInt();
		while (flips < 1) {
			System.out.print("Please enter a number greater or equal to one: ");
			flips = in.nextInt();
		}
		System.out.print("\n");

		// loop the amount of times the user requested.
		for (int i = 1; i <= flips; i++) {
			if ( ((int) (Math.random() * 2) + 1) == 1) { 
				// to more properly weight the numbers(I think), use more numbers. Even numbers are heads.
				flip = "H";
				headCount ++;
			} else {
				flip = "T";
				tailCount ++;
			}
			System.out.println(i + ". Flip coin and enter result (H or T) #" + i + ": " + flip);
		}
		
		percentHeads = (headCount / ((double) headCount + tailCount)) * 100;
		percentTails = (tailCount / ((double) headCount + tailCount)) * 100;
						
						
		System.out.println("\nResults:");
		System.out.printf("%d heads, or %.2f%%", headCount,  percentHeads);
		System.out.printf("%n%d tails, or %.2f%%", tailCount,  percentTails);
		//going to just truncate up to 2 decimal places(So program 
		//will look similar to instructions(but with a little more information)

		in.close();

	}

}
