package org.yccc.cis170.hangman;

import java.util.Scanner;

public class GameController {
	
	Game[] games;
	Scanner console = new Scanner(System.in);

	public GameController()
	{
		games = new Game[]{new Game("meow", "cat"), new Game("woof", "dog"), new Game("long neck", "giraffe"), new Game("fun language", "java")};
	}
	
	public void playGame()
	{
		for(int i = 0; i < games.length; i++)
		{
			while(!games[i].isSolved() && !games[i].isDead())
			{
				System.out.println("Hint: " + games[i].getHint());
				System.out.println("Mask: " + games[i].calculateMask());
				System.out.println("Guess a letter: ");
				games[i].addGuess(console.next());	
			}
		}
		
		System.out.println("Thanks for playing!");
	}
	
	public static void main(String[] args)
	{
		GameController gc = new GameController();
		gc.playGame();
	}
}
