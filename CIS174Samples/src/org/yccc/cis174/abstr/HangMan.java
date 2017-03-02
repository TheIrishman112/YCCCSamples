package org.yccc.cis174.abstr;

public class HangMan extends AbstractGame
{

	@Override
	public boolean isSolved() {
		System.out.println("Not solved");
		return false;
	}

	@Override
	public void play() {
		
		System.out.println("Playing");
	}
}
