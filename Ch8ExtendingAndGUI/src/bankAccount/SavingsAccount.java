/*
 * Programmer: Jeffrey Meng
 * Date: Jan 25, 2018
 * Purpose:
 */

package bankAccount;

public class SavingsAccount extends BankAccount {
	double intrest = 0.0;
	
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(Customer owner, double startingBalance) {
		super(owner, startingBalance);
	}
	
	
	
	public void payIntrest() {
		deposit(balance * intrest);
	}
	
	public void setIntrestRate(double intrest) {
		//TODO make sure intrest < 1
		this.intrest = intrest;
	}
	
	
	
}