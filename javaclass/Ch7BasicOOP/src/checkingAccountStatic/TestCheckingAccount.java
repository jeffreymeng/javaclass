/*
 * Programmer: Jeffrey Meng
 * Date: Dec 13, 2017
 * Purpose:
 */

package checkingAccountStatic;

import java.util.Scanner;

public class TestCheckingAccount {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input = 0;
		double amount;
		while (input != 4) {
			System.out.println("ATM");
			System.out.println("Menu:");
			System.out.println("  1. View Balance");
			System.out.println("  2. Deposit");
			System.out.println("  3. Withdraw");
			System.out.println("  4. Quit");
			System.out.print("Enter a menu number: ");
			input = in.nextInt();
			while(input < 1 || input > 4) {
				System.out.print("Enter a valid menu number(1-4): ");
				input = in.nextInt();
			}
			switch (input) {
				case 1:
					System.out.printf("Your account has $%.2f%n", CheckingAccount.getBalance());
					break;
				case 2:
					System.out.println("Enter the amount of the deposit:");
					amount = in.nextDouble();
					while (amount < 0) {
						System.out.println("Enter a positive number or zero to cancel:");
						amount = in.nextDouble();
					}
					if (amount == 0.0) {
						System.out.println("Deposit Cancelled");
					} else {
						CheckingAccount.processDeposit(amount);
						System.out.printf("You have made a check for $%.2f. Your balance is now $%.2f%n", amount, CheckingAccount.getBalance());
					}
					break;
				case 3:
					System.out.println("Enter the amount of the check:");
					amount = in.nextDouble();
					while (amount < 0 || amount > CheckingAccount.getBalance()) {
						System.out.printf("Enter a positive number less than your balance of $%.2f or zero to cancel:", CheckingAccount.getBalance());
						amount = in.nextDouble();
					}
					if (amount == 0.0) {
						System.out.println("Check Cancelled");
					} else {
						CheckingAccount.processCheck(amount);
						System.out.printf("You have made a check for $%.2f. Your balance is now $%.2f%n", amount, CheckingAccount.getBalance());
					}
					break;
					
			}
			
			
		}
		System.out.println("Exited ATM");
		in.close();
	}
}
