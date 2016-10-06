package org.yccc.cis170.io;

import java.util.Scanner;

public class IOSampleRunner 
{
	// Program entry point.
	public static void main(String[] args)
	{
		// Get users lesson selection.
		Scanner console = new Scanner(System.in);
		System.out.println("Which lesson number would you like to execute?");
		System.out.println("Lesson 1: Scanner input");
		System.out.println("Lesson 2: File input");
		System.out.println("Lesson 3: File output");
		int exampleNum = console.nextInt();
		
		IOSamples ios = new IOSamples();
		
		// Bring the user to the lesson they selected.
		switch(exampleNum)
		{
			case 1: //Create the ConsoleScanner object, and execute the smalltalk method.
				ios.smallTalk();
				break;
			case 2:
				ios.readFile();
				break;
			case 3:
				ios.writeFile();
				break;
			default: 
				System.out.println("Sorry, that lesson has not been prepared yet!!!");
				break;
		}
	}
}


