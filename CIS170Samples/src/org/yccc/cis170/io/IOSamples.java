package org.yccc.cis170.io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class IOSamples {

	Scanner console = new Scanner(System.in);

	// Interacting on the console.
	public void smallTalk() {
		System.out.println("Hi, what's your name? ");
		String name = console.next();
		System.out.println("Thanks " + name + ", how old are you?");
		int age = console.nextInt();
		System.out.println("Wow, " + name + " you look great for " + age + "!");
	}

	// Reading from a file
	public void readFile() {
		try {
			Scanner inFile = new Scanner(new FileReader("data.txt"));

			while (inFile.hasNext()) {
				System.out.println(inFile.next());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// File Writing sample
	public void writeFile() {
		BufferedWriter out = null;
		try {
			FileWriter fstream = new FileWriter("out.txt", true);
			out = new BufferedWriter(fstream);
			out.write("Hello Java, ");
			out.write("how have you been?");
			for(int i = 0; i < 10; i++)
			{
				out.write(String.valueOf(i));
				out.write(",");
			}
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
