package org.yccc.cis174.abstr;

public class GameConsole 
{	
	public static void main(String[] args)
	{
		AbstractGame game = new HangMan();
		game.play();
		game.isSolved();
		game.quit();	
	}
}
