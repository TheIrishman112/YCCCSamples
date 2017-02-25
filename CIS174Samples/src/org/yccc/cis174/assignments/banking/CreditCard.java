package org.yccc.cis174.assignments.banking;

public class CreditCard extends AbstractAccount{
	
	private double creditLimit;

	public CreditCard(int id)
	{
		super();
		setAccountType("Credit Card");
		setAccountID(id);
	}
	/**
	 * Credit cards 'withdrawal' adds to the balance of the account.
	 */
	@Override
	public void withdrawMoney(double amount) throws InsufficientFundsException{
		
		setBalance(getBalance() + amount);	
	}

	/**
	 * Credit cars applyInterest deducts from the account balance.
	 * We assume the caller will determine the right interval to call this.
	 */
	@Override
	public void applyInterest() {
		setBalance(balance += balance * (interestRate / 100));	
	}
}
