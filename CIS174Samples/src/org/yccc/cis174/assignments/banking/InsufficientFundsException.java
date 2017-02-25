package org.yccc.cis174.assignments.banking;

public class InsufficientFundsException extends Exception
{
	private static final long serialVersionUID = 1L;

	public InsufficientFundsException()
	{
		super();
	}
	
	public InsufficientFundsException(String message)
	{
		super(message);
	}
	
	public InsufficientFundsException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
