package org.yccc.cis174.interfaces;

import javax.swing.JPanel;

public class RubiksCube implements Puzzle{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Called.");
	}

	@Override
	public boolean isSolved() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void describe() {
		System.out.println("RUBIKS CUBE: Kinda hard, unless you know patterns!");
		
	}

	@Override
	public JPanel getUI() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
