package org.yccc.cis174.assignments.banking;

import org.yccc.cis174.dto.User;

public abstract class AbstractAccount {
	
	protected double interestRate;
	private int accountID;
	protected double balance;
	private User accountHolder;
	private String accountType;
	
	/**
	 * Inheriting classes should provide a method to withdraw money, updating the balance when complete.
	 * @param amount
	 * @throws InsufficientFundsException
	 */
	public abstract void withdrawMoney(double amount) throws InsufficientFundsException;
	
	/**
	 * Inheriting classes should provide an applyInterest method, updating the balance when complete.
	 */
	public abstract void applyInterest();
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getAccountID() {
		return accountID;
	}

	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public User getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(User accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public String toString(){
		return new StringBuilder(" Account ID: ").append(this.accountID)
				.append(" | Account Type: ").append(this.accountType)
				.append(" | Balance: ").append(this.balance)
				.append(" | Account Holder: ").append(this.accountHolder)
				.append(" | Interest Rate: ").append(this.interestRate).toString();
	}
}
