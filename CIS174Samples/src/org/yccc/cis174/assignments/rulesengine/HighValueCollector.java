package org.yccc.cis174.assignments.rulesengine;

import org.yccc.cis174.dto.Quote;

public class HighValueCollector implements Rule{

	private Quote quote;
	
	@Override
	public void config(Quote quote) {
		this.quote = quote;
		
	}

	@Override
	public boolean execute() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getMessage() {
		// TODO Auto-generated method stub
		return false;
	}

}
