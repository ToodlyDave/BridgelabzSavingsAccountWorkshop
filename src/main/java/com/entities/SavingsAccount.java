package com.entities;

public class SavingsAccount {

	public static double annualInterestRate;
	private double savingsBalance;

	// Initialize savings balance amount
	public SavingsAccount(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	// Calculate the interest and add to savings
	public void calculateMonthlyInterest() {
		double interest = savingsBalance * (annualInterestRate / 100) / 12;
		savingsBalance += interest;
		display(interest);
	}

	// Display interest and account balance
	public void display(double interest) {
		System.out.println(" This account has a monthly interest rate of " + interest);
		System.out.println(" The new balance of this account is now $" + savingsBalance);
	}

	// Modify interest rate
	public static void modifyInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;
	}
	
	public static void setAnnualInterestRate(double newInterestRate) {
		annualInterestRate = newInterestRate;
	}

}
