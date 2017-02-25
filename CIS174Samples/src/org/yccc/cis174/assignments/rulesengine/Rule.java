package org.yccc.cis174.assignments.rulesengine;

import org.yccc.cis174.dto.Quote;

public interface Rule 
{
	// Sets the quote on the rule so you can access the parameters needed for your rule.
	public void config(Quote quote);
	
	// Executes the rule, updating the quote as desired.
	public boolean execute();
	
	// User friendly message about why you gave the result you did.
	public boolean getMessage();
}
