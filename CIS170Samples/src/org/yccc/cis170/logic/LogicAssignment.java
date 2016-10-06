package org.yccc.cis170.logic;



public class LogicAssignment {
	
	/**
	 * Edit this method so that it returns a mask the same length as the 
	 * word it is passed.  I.e. word = CAT, mask = ***.
	 * 
	 * Not checking that it's correct, just that its not equal to the word
	 * passed, and that what you return is the same lenght as the word.
	 * 
	 */
	protected String generateMask(String word)
	{
		String mask = "";
		for(int i = 0; i < word.length(); i++)
		{
			mask += "*";	
		}

		return mask;
	}
	
	/**
	 * Edit this method so that it returns an appropriate mask for the
	 * word it is passed, based on the guesses the user has made.
	 * 
	 */
	protected String generateMask(String word, String guesses)
	{
		String mask = "";
		String tempWord = word.toUpperCase();
		String tempGuesses = guesses.toUpperCase();
		
		for(int i = 0; i < word.length(); i++)
		{
			char c = tempWord.charAt(i);
			String s = String.valueOf(c);
			boolean wasItGuessed = tempGuesses.contains(s);
			// Same as above. if(guesses.contains(String.valueOf(word.charAt(i)))){ ... }
			
			if(wasItGuessed)
			{
				mask += word.charAt(i);
			}	
			else
			{
				mask += "*";
			}
		}
		return mask;
	}
}
