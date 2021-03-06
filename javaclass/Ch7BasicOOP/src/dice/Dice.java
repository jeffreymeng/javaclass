/*
 * Programmer: Jeffrey Meng
 * Date: Jan 4, 2018
 * Purpose:
 */

package dice;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
	private int sides, rolls;
	
	public Dice(int sides) {
		this.sides = sides;
		rolls = 0;
	}
	public Dice() {
		this.sides = 6;
		rolls = 0;
	}
	public int roll() {
		rolls ++;
		return ThreadLocalRandom.current().nextInt(1, sides + 1);
		// https://stackoverflow.com/a/363692/5511561
		

	}
	public int getRolls() {
		return rolls;
	}
	public int getSides() {
		return sides;
	}
}
