/*
 * Programmer: Jeffrey Meng
 * Date: Dec 13, 2017
 * Purpose:
 */

package checkingAccountStatic;

public class CheckingAccount {
	private static double balance = 0.0;

	public static double getBalance() {
		return balance;
	}

	public static void processDeposit(double amt) {
		balance += amt;
	}

	public static void processCheck(double amt) {
		balance -= amt;
	}
}
