/*
 * Programmer: Jeffrey Meng
 * Date: Jan 4, 2018
 * Purpose:
 */

package dice;

public class DiceTest {

	public static void main(String[] args) {
		Dice standard = new Dice();
		Dice bigDice = new Dice(100);
		for (int i = 0; i < 10; i ++) {
			System.out.println(standard.getSides() + "-sided dice roll number " + i + ": "  + standard.roll());
			
		}
		System.out.println("Dice rolled 10 times.");
		for (int i = 0; i < 10; i ++) {
			System.out.println(bigDice.getSides() + "-sided dice roll number " + i + ": "  + bigDice.roll());
		}
		System.out.println("Standard rolled " + standard.getRolls() + " times");
		System.out.println("Big Dice rolled " + bigDice.getRolls() + " times");

	}

}
