package org.yccc.cis174.interfaces;

public class HangMan implements Puzzle {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isSolved() {
		return false;
		
	}

	@Override
	public void describe() {
		System.out.println("HANGMAN!  Solve the puzzle, you save an innocent man, if you fail however, he dies.  Guess carefully!");
	}
}
