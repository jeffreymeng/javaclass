/*
 * Programmer: Jeffrey Meng
 * Date: Jan 12, 2018
 * Purpose:
 */

package cardGame;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		playGame();
		

	}

	public static void playGame() {
		
		Scanner in = new Scanner(System.in);
		String unprocessedInput;
		boolean playing = true;
		int turnScore = 0, gameScore = 0;
		
		while(playing) {
			//play the game
			turnScore = calculateTurnScore();
			gameScore += turnScore;
			System.out.println("You earned " + turnScore + " points!");
			System.out.println("Would you like to play another round? Your score is currently " + gameScore + "(yes/no).");
			unprocessedInput = in.nextLine();
			while(!unprocessedInput.equalsIgnoreCase("yes") || !unprocessedInput.equalsIgnoreCase("yes")) {
				System.out.println("Choose yes or no");
				unprocessedInput = in.nextLine();
			}
			if (unprocessedInput.equalsIgnoreCase("no")) {
				
				playing = false;
			}
		}
		System.out.println("You ended the game with " + gameScore + " points.");
		
		in.close();
	}

	public static int calculateTurnScore() {
		Flip flipper = new Flip();
		DisplayCards display = new DisplayCards();
		
		//boolean stores whether cards are black or not.
		int countRed = 0, countBlack = 0;
		boolean card;
		boolean[] cards = new boolean[4];
		for (int i = 0; i < 4; i ++) {
			card = flipper.turnOverCard();
			cards[i] = card;
			
			
			if (card) {
				countBlack ++;
			} else {
				countRed ++;
			}
		}
		display.showCardArr(cards);
		if (countBlack == 4 || countRed == 4) {
			return 5;
		} else if (countBlack == 2 && countRed == 2){
			return 1;
		} else {
			return 0;
		}
	}

}
