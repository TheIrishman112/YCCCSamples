package org.yccc.cis170.hangman;

public class Game {
	private String hint;
	private String word;
	private String guesses = "";
	
	public Game(String hint, String word)
	{
		this.hint = hint;
		this.word = word;
	}
	
	public String getHint() {
		return hint;
	}
	public void setHint(String hint) {
		this.hint = hint;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	
	public void addGuess(String guesse) {
		this.guesses += guesse;
	}
	
	public String calculateMask()
	{
		String mask = "";
		
		for(int i = 0; i < this.word.length(); i++)
		{
			if(guesses.contains(String.valueOf(word.charAt(i))))
			{
				mask += String.valueOf(word.charAt(i));
			}
			else
			{
				mask += "*";
			}
		}
		
		return mask;
	}
	
	public boolean isSolved()
	{
		return !calculateMask().contains("*");
	}
	
	public boolean isDead()
	{
		boolean isDead = !isSolved() && guesses.length() >=5;
		if(isDead)
		{
			System.out.println("Sorry, you are dead!");
			System.out.println();
		}
		return isDead;
	}
}
