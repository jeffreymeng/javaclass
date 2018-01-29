/*
 * Programmer: Jeffrey Meng
 * Date: Jan 29, 2018
 * Purpose:
 */

package bankAccount;

public class CheckingAccount extends BankAccount {

	public CheckingAccount() {
		super();
	}

	public CheckingAccount(Customer owner, double startingBalance) {
		super(owner, startingBalance);
	}

	public void withdraw(double amount) {
		if (balance < amount) {
			if (super.getOwner().getSavingAccount().reportBalance() > amount) {
				// if the owner's checking account has enough, withdraw from there.
				super.getOwner().getSavingAccount().withdraw(amount);
			} else {
				super.withdraw(amount);
			}
		} else {
			super.withdraw(amount);
		}
	}
}
