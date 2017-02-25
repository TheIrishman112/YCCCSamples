package org.yccc.cis174.assignments.banking;

public class CheckingAccount extends AbstractAccount{

	public CheckingAccount(int id)
	{
		super();
		setAccountType("Checking");
		setAccountID(id);
	}
	
	/**
	 * Checks do not add interest, so just withdraw the amount requested, 
	 * so long as they have it available.
	 * @throws InsufficientFundsException 
	 */
	@Override
	public void withdrawMoney(double amount) throws InsufficientFundsException {
		if(getBalance() > amount)
		{
			setBalance(getBalance() - amount);	
		}
		else
		{
			throw new InsufficientFundsException("Insufficient funds available in checking account");
		}
	}
	
	/**
	 * Checking accounts accrue interest, which adds to the balance.
	 */
	@Override
	public void applyInterest() {
		setBalance(balance += balance * (interestRate / 100));
	}
}
