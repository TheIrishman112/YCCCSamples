package org.yccc.cis174.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameConsole {
	List<Puzzle> puzzles = new ArrayList<Puzzle>();
	String selection;
	public static void main(String[] args)
	{
		GameConsole gc = new GameConsole();
		gc.loadPuzzles();
		gc.selectAPuzzle();
		gc.solvePuzzle();	
	}
	
	private void solvePuzzle()
	{
		Puzzle p = puzzles.get(Integer.valueOf(selection).intValue());
		p.describe();
		
		while(!p.isSolved())
		{
			p.play();
		}
	}
	
	private void selectAPuzzle()
	{
		int count = 0;
		for(Puzzle p : puzzles)
		{
			System.out.print(count++ + ": ");
			p.describe();
		}
		
		System.out.println("Select a game!");
		Scanner console = new Scanner(System.in);
		selection = console.next();
	}
	
	private void loadPuzzles()
	{
		puzzles.add(new HangMan());
		puzzles.add(new RubiksCube());
		puzzles.add(new TicTacToe());
	}
}
