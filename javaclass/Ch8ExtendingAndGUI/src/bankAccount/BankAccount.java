/*
 * Programmer: Jeffrey Meng
 * Date: Jan 25, 2018
 * Purpose:
 */

package bankAccount;

public class BankAccount {
	protected Customer owner;
	protected double balance;
	private int accountNumber;
	//TODO: in Utils, create a confirmation class.
	//in utils, also make a setter confirmation class that extends confirmation.
	//then, in bank account, make withdraw and deposit confirmations.
	public BankAccount() {
		owner = new Customer();
		balance = 0.0;
	}
	
	public BankAccount(Customer owner, double startingBalance) {
		this.owner = owner;
		this.balance = startingBalance;
	}
	
	public Customer getOwner() {
		return owner;
	}
	
	public double reportBalance() {
		return balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public WithdrawConfirmation withdraw(double amount) {
		
		this.balance -= amount;
		return new WithdrawConfirmation(true, owner, amount + balance, balance, balance);
		
	}
	
	public void deposit(double amount) {
		this.balance =+ amount;
	}
	
}
