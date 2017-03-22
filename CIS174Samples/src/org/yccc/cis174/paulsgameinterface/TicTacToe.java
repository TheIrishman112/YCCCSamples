package org.yccc.cis174.paulsgameinterface;

//import javax.swing.JPanel;
import java.io.*;
import java.util.*;

public class TicTacToe implements Puzzle{
	
	final static private char [] pieces = {'x', 'o'};
	private String [][] board;
	private int whoseTurn;
	int movesMade;
	boolean isSolved = false;
	private static ArrayList<String> playerArray = new ArrayList<String>();
	
	
	@Override
	public void play() {
		TicTacToe myGame = new TicTacToe();
		board = new String [3][3];
		Scanner stdin = new Scanner (System.in);
		
		//Enter the payer's names
		System.out.println("Player #1, Enter your name. ");
		myGame.playerArray.add(stdin.next());
		
		System.out.println("Player #2, Enter your name. ");
		//myGame.players[1] = stdin.next();
		myGame.playerArray.add(stdin.next());
		
		myGame.CreateBoard();
		myGame.printBoard();
		
		//Start Playing the Game  by making sure there is no winner		
		while (myGame.winner() == "_" ) {
			int r, c;
			boolean done = false;
			
			do {
		
		        // Print the Current Player's name and ensure square selected is valid and available		
				System.out.println(myGame.getCurrentPlayer());
				System.out.print("Enter the row(0-2); and the column(0-2)");
				System.out.println(" of your move. ");
				
				r = stdin.nextInt();
				c = stdin.nextInt();
				if (!myGame.inbounds(r, c))
					System.out.println("Sorry, those are invalid entries.");
				else {
				if (!myGame.Move(r, c)) 
						System.out.println("Sorry, that square is taken.");
				else
						done = true;
						myGame.printBoard();
				}
			}while (!done);
			
			myGame.changePlayer();
		}
		
		myGame.printBoard();
		String win = myGame.winner();
		
		if (win == "T"){
			System.out.println(" Both of you played to a draw. ");
			isSolved = true;
		}else{ 
			System.out.println("Congratulations, " + playerArray.get(whoseTurn));
			System.out.println(" you have won the game.");
			isSolved = true;
			}
		}
	
	// create and initialize squares
	public void CreateBoard() {
		board = new String [3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = "_";
		playerArray.get(0);
		playerArray.get(1);
		
				}
			}
		whoseTurn = 0;
		movesMade = 0;
		}
	
		public boolean Move (int row, int column) {
			if ( (board[row][column] ==  "_") && inbounds (row, column)) {
				if (whoseTurn == 0)
					board[row][column] = "x";
				if (whoseTurn == 1)
					board[row][column] = "o";
				movesMade++;
				return true;
			}
			else{
				return false;
			}
		}
		// returns TRUE is the selections are valid squares
		public boolean inbounds (int row, int column) {
			if ((row < 0) || (column < 0))
					return false;
			if ((row > 2) || (column > 2)) 
					return false;
			return true;
		}
		
		public void changePlayer() {
			whoseTurn = (whoseTurn +1) %2;
			//System.out.println("Whose Turn = " + whoseTurn);
			
		}
				
		public String getCurrentPlayer() {
			return playerArray.get(whoseTurn);
			
		}
		
		
		// Print the Board showing the values for aall squares
		public void printBoard() {
			System.out.println();
			
			for (int i = 0; i < 3; i++) {
				//System.out.println("   | "); 
				for (int j = 0; j < 3; j++) {
					if (board[i][j] == null) {
						System.out.println("_");
					}else{
						System.out.print(board[i][j]);
					}
						if (j < 2) {
							System.out.print("|");
						}else{
							System.out.println();
						}
					}
				}
		}

		//Checking square values for a winner
		public String winner() {
			//Rows
				if(board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][2] != "_")
					return board[0][0];
				
				if ((board[1][0] == board[1][1]) && (board[1][1] == board[1][2] & board[1][2] != "_"))
						return board[1][0];

				if ((board[2][0] == board[2][1]) && (board[2][1] == board[2][2] && board[2][2] != "_"))
					return board[2][0];
				
				//Columns
				if(board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[2][0] != "_")
					return board[0][0];
				
				if ((board[0][1] == board[1][1]) && (board[1][1] == board[2][1] && board[2][1] != "_"))
						return board[0][1];

				if ((board[0][2] == board[1][2]) && (board[1][2] == board[1][2] && board[2][2] != "_"))
					return board[0][2];
				
				//Diagonal
			if ((board[2][0] == board [1][1] && board [1][1] == board[0][2] && board[0][2] != "_"))
				return board[2][0];	
		
			if ((board[0][0] == board [1][1] && board [1][1] == board[2][2] && board[2][2] !="_"))
				return board[0][0];	
		
	    // Check for a Tie
		if (movesMade == 9)
			return "T";
		else
			return "_";
		}
		
		
	@Override
	public boolean isSolved() {
		return true;
		
	}

	@Override
	public void describe() {
		System.out.println("TIC-TAC-TOE!  Kinda boring, but kids love it!");
		System.out.println("In order to win you must get 3 x's or o's in a row, a column, or diagionally");
		
	}

}
