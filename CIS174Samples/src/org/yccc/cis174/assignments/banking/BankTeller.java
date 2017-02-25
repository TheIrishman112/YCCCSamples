package org.yccc.cis174.assignments.banking;

import org.yccc.cis174.dto.User;

public class BankTeller {
	
	public static void main(String[] args) throws InsufficientFundsException
	{
		CheckingAccount ca = new CheckingAccount(546892311);
		ca.setAccountHolder(new User("Donald", "Trump"));
		ca.setInterestRate(1.2);
		ca.setBalance(500);
		ca.withdrawMoney(100);
		ca.applyInterest();
		System.out.println(ca);
		
		
		CreditCard cc = new CreditCard(784521999);
		cc.setAccountHolder(new User("Warren", "Buffet"));
		cc.setInterestRate(9);
		cc.setBalance(4000);
		cc.withdrawMoney(1000);
		cc.applyInterest();
		System.out.println(cc);
	}
}
