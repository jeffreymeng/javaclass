/*
 * Programmer: Jeffrey Meng
 * Date: Jan 29, 2018
 * Purpose:
 */

package bankAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		Customer owner = new Customer("John", 1, 1);
		SavingsAccount savingsAccount = new SavingsAccount(owner, 0.0);
		CheckingAccount checkingAccount = new CheckingAccount(owner, 0.0);
		owner.setSavingsAccount(savingsAccount);
		owner.setCheckingAccount(checkingAccount);
		
		savingsAccount.deposit(100.0);
		checkingAccount.deposit(25.25);
		
		

	}

}
