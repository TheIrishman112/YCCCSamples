package org.yccc.cis174.interfaces;

import javax.swing.JPanel;

public interface Puzzle 
{
	public void play();
	public boolean isSolved();
	// Describe should print line the description of the puzzle.
	public void describe();
	public JPanel getUI();
}
