package org.yccc.cis170.errors;

public class MyError extends Exception
{
	private static final long serialVersionUID = 1L;
	
	public MyError()
	{
		super();
	}
	
	public MyError(String message)
	{
		super(message);
	}
	
	public MyError(String message, Throwable cause)
	{
		super(message, cause);
	}
	
	public MyError(Throwable cause)
	{
		super(cause);
	}	

}
