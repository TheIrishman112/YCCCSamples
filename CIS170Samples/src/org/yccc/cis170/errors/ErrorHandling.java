package org.yccc.cis170.errors;

public class ErrorHandling {
	
	
	public void throwsAnError() throws MyError
	{
		throw new MyError("An error occurred!");
	}
	
	public void catchErrors()
	{
		try 
		{
			throwsAnError();
		} 
		catch (MyError e) 
		{
			e.printStackTrace();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
