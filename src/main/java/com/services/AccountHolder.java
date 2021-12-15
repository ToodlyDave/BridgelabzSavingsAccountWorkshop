package com.services;

import com.entities.SavingsAccount;

public class AccountHolder {

	public static void main(String[] args) {

		// Initialize two accounts with new balances
		SavingsAccount john = new SavingsAccount(2000);
		SavingsAccount doe = new SavingsAccount(3000);

		// Set the interest rate to 4% and calculate the new values
		SavingsAccount.setAnnualInterestRate(4);
		john.calculateMonthlyInterest();
		doe.calculateMonthlyInterest();

		// Set the interest rate to 5% and calculate the new values
		System.out.println();
		SavingsAccount.modifyInterestRate(5);
		john.calculateMonthlyInterest();
		doe.calculateMonthlyInterest();

	}

}
