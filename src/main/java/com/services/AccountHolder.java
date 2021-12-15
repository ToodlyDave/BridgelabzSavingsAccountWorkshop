package com.services;

import com.entities.SavingsAccount;

public class AccountHolder {

	public static void main(String[] args) {

		SavingsAccount john = new SavingsAccount(2000);
		SavingsAccount doe = new SavingsAccount(3000);
		
		SavingsAccount.modifyInterestRate(4);
		john.calculateMonthlyInterest();
		doe.calculateMonthlyInterest();
		
		System.out.println();
		SavingsAccount.modifyInterestRate(5);
		john.calculateMonthlyInterest();
		doe.calculateMonthlyInterest();
		
	}

}
