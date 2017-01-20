package org.yccc.cis174.insurance.rules;

import org.yccc.cis174.insurance.dto.Quote;

public interface Rule 
{
	// Sets the quote on the rule so you can access the parameters needed for your rule.
	public void config(Quote quote);
	
	// Executes the rule.
	public boolean execute();
	
	// User friendly message about why you gave the result you did.
	public boolean getMessage();
}
