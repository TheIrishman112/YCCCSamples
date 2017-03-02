package org.yccc.cis174.interfaces;

import javax.swing.JPanel;

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

	@Override
	public JPanel getUI() {
		// TODO Auto-generated method stub
		return null;
	}
}
