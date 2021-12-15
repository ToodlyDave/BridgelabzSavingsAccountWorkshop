package com.entities;

public class SavingsAccount {

	private static double annualInterestRate = 0d;
	private double savingsBalance;

	public SavingsAccount(double savingsBalance) {
		super();
		this.savingsBalance = savingsBalance;
	}

	public void calculateMonthlyInterest() {
		double interest = savingsBalance * (annualInterestRate / 100) / 12;
		savingsBalance += interest;
		display(interest);
	}
	
	public void display(double interest) {
		System.out.println(" This account has a monthly interest rate of " + interest);
		System.out.println(" The new balance of this account is now $" + savingsBalance);
	}
	
	public static void modifyInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;
	}

}
