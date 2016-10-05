package org.yccc.cis170.logic;

public class LogicSamples {
	
	/**
	 * Control program flow with if\else if\else logic.
	 * @param word
	 * @param guesses
	 * @param description
	 */
	private void ifLesson(String word, String guesses, String description )
	{
		System.out.println(description);
		// if(true) the code in the if\else if block executes.
		// if none of the tests are true, the else block will always execute.
		if(guesses == null)
		{
			System.out.println("- User has not guessed yet.");
		}
		else if(word.length() > 5)
		{
			System.out.println("- This word will be challenging to solve.");
		}
		else
		{
			System.out.println("- Should be easy to solve.");
		}		
	}
	
	/**
	 * Iterate over things with a for loop.
	 * The first part is the counter; 
	 * The second is the logic condition that will break out of the for loop;
	 * The third is the incrementer.
	 * 
	 * @param word
	 */
	private void forLesson(String word)
	{
		for(int i = 0; i < word.length(); i++)
		{
			System.out.println(" Char at slot " + i + " is " + word.charAt(i));
		}
	}
	
	private void whileLesson()
	{
		// Loops until the tooLong method returns false.
		while(!tooLong()){
			System.out.println("Are we there yet? ");
		}
		
		
		// Can also be written as a do while.  Main difference is that the condition is tested at the 
		// end of the loop, and the block will execute atleast once.
		do
		{
			System.out.println("FINALLY!!!");
		}
		while(!tooLongSimplified());
	}
	
	// will return false after 2 seconds.
	private boolean tooLong()
	{
		long currentTime = System.currentTimeMillis();
		
		if(currentTime - startTime > 2000)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// Since the test on current time and start time resolves to a boolean, we can simply return that result.
	private boolean tooLongSimplified()
	{
		long currentTime = System.currentTimeMillis();
		return currentTime - startTime > 2000;
	}
	
	// Class level variable to store the start time.
	private static long startTime;
	
	public static void main(String[] args){
		
		LogicSamples ls = new LogicSamples();
		System.out.println("******** IF LESSON **************");
		ls.ifLesson("Cat", null, "Null guesses hits the first if block.");
		ls.ifLesson("Giraffe", "abcf", "Longer word, with some user guesses, will hit the second if block.");
		ls.ifLesson("Dog", "abc", "Short word, with some guesses, will hit the else condition.");
		
		System.out.println("********* FOR LESSON ***************");
		ls.forLesson("Hippopotomonstrosesquipedaliophobia");
		
		startTime = System.currentTimeMillis();
		ls.whileLesson();
	}

}
