package org.yccc.cis174.paulsgameinterface;

//import javax.swing.JPanel;
import java.*;

public class Craps implements Puzzle 
{
	boolean isSolved = false;
	@Override
	public void play() {
		// Generate a random number between 1 and 6 for each die
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;
			// Add the two Die to get your number
			int roll = dice1 + dice2;
			System.out.println();
			System.out.println("You rolled " +roll+ ".");
			// If you roll a 2,3, or 12 on the first roll, you lose
			if(roll == 2 || roll == 2 || roll == 12) {
				System.out.println("You Lose !!");
				isSolved = true;
				//If you roll a 7 or 11 on first roll, you win
			}else if(roll == 7 || roll == 11){
				System.out.println("You Win !!");
				isSolved = true;
			}else{
				//else you try to make your point
				System.out.println("Point is " + roll +"\n");
				dice1 = (int) (Math.random() * 6) + 1;
				dice2 = (int) (Math.random() * 6) + 1;
				int roll2 = dice1 + dice2;
				System.out.println("You rolled " + roll2 + ".");
			
				while (roll2 != 7) {
					if (roll == roll2) {
						System.out.println("You Win !!");
						isSolved = true;
						break;
					}else{
						System.out.println("Point is " + roll + "\n");
					}
					dice1 = (int) (Math.random() * 6) + 1;
					dice2 = (int) (Math.random() * 6) + 1;
					roll2 = dice1 + dice2;
					System.out.println("You rolled " + + roll2 + ". ");
				}
				// while trying to make your point if you roll a 7 you lose
				if (roll2 == 7) {
					System.out.println("You Lose !!");
					isSolved = true;
				}
			}
			System.out.println("Game Over !!");
			return;
		
	}

	@Override
	public void describe() {
		System.out.println("Craps!  Roll 7 or 11 on first roll, you win !");
		System.out.println("Roll 2,3, or 12 on first roll, you lose !! ");
		System.out.println("Any other number is your point and you roll until you make your point and win");
		System.out.println(" Roll a 7 before making your point and you lose");
	}

	@Override
	public boolean isSolved() {
		return isSolved;
	}

	//@Override
	//public JPanel getUI() {
		// TODO Auto-generated method stub
		//return null;
	//}
}

