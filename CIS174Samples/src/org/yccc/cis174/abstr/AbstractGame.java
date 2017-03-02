package org.yccc.cis174.abstr;

public abstract class AbstractGame {
	
	public abstract boolean isSolved();
	public abstract void play();
	
	public void quit(){
		System.out.println("Quitting");	
	}
}
