/*
 * Programmer: Jeffrey Meng
 * Date: Dec 15, 2017
 * Purpose:
 */

package checkingAccount;

import java.util.Scanner;

public class CheckingAccountUI {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input = 0;
		double amount;
		int id = 0;
		CheckingAccount[] checkingAccounts = new CheckingAccount[2];
		for (int i = 0; i < checkingAccounts.length; i++) {
			checkingAccounts[i] = new CheckingAccount();
		}
		//System.out.println(checkingAccounts.length);
		
		//There is no account zero.
		System.out.println("Enter the ID of the account you wish to access:");
		id = in.nextInt() - 1;
		while (id >= checkingAccounts.length){
			System.out.println("Enter a valid ID: ");
			id = in.nextInt() - 1;
		}
		
		while (input != 5) {
			System.out.println("ATM");
			System.out.println("Menu:");
			System.out.println("  1. View Balance");
			System.out.println("  2. Deposit");
			System.out.println("  3. Withdraw");
			System.out.println("  4. Swith Accounts");
			System.out.println("  5. Quit");
			System.out.print("Enter a menu number: ");
			input = in.nextInt();
			while (input < 1 || input > 5) {
				System.out.print("Enter a valid menu number(1-5): ");
				input = in.nextInt();
			}
			switch (input) {
			case 1:
				System.out.printf("Your account has $%.2f%n",
						checkingAccounts[id].getBalance());
				break;
			case 2:
				System.out.println("Enter the amount of the deposit:");
				amount = in.nextDouble();
				while (amount < 0) {
					System.out
							.println("Enter a positive number or zero to cancel:");
					amount = in.nextDouble();
				}
				if (amount == 0.0) {
					System.out.println("Deposit Cancelled");
				} else {
					checkingAccounts[id].processDeposit(amount);
					System.out
							.printf("You have made a check for $%.2f. Your balance is now $%.2f%n",
									amount, checkingAccounts[id].getBalance());
				}
				break;
			case 3:
				System.out.println("Enter the amount of the check:");
				amount = in.nextDouble();
				while (amount < 0 || amount > checkingAccounts[id].getBalance()) {
					System.out
							.printf("Enter a positive number less than your balance of $%.2f or zero to cancel:",
									checkingAccounts[id].getBalance());
					amount = in.nextDouble();
				}
				if (amount == 0.0) {
					System.out.println("Check Cancelled");
				} else {
					checkingAccounts[id].processCheck(amount);
					System.out
							.printf("You have made a check for $%.2f. Your balance is now $%.2f%n",
									amount, checkingAccounts[id].getBalance());
				}
				break;
			case 4:
				System.out.println("Enter the ID of the account you wish to access:");
				id = in.nextInt() - 1;
				while (id >= checkingAccounts.length){
					System.out.println("Enter a valid ID: ");
					id = in.nextInt() - 1;
				}
				break;

			}

		}
		System.out.println("Exited ATM");
		in.close();
	}

}
