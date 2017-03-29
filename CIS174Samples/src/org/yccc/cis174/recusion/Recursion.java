package org.yccc.cis174.recusion;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The key to understanding recursion is understanding recursion!
 * Recursion is the repeated application of a procedure.
 * 
 * @author mbourgeois
 *
 */
public class Recursion {
	
	List<String> tokens = new ArrayList<String>();
	
	public static void main(String[] args) throws IOException
	{
		Recursion r = new Recursion();
		r.directoyRecursion("C:/Users");
		
		//r.recursiveDataProcessing("Mike Bourgeois mike.bourgeois@gmail.com");
		
	}
	
	// Recursive printing of directory contents.
	private void directoyRecursion(String filePath) throws IOException
	{
		File f = new File(filePath);
		if(f.isDirectory())
		{
			File[] contents = f.listFiles();
			if(contents != null)
			{
				for(int i = 0; i < contents.length; i++)
				{
					System.out.println(contents[i]);
					// If this file is a directory, call the directoryRecursion method again passing this directory.
					if(contents[i].isDirectory())
					{
						directoyRecursion(contents[i].getCanonicalPath());
					}
				}
			}
		}
	}
	
	// Tokenize the data into 3 separate objects
	private void recursiveDataProcessing(String dataToProcess)
	{
		int index = dataToProcess.indexOf(" ");
		if(index == -1)
		{
			index = dataToProcess.length();
		}
			
		String token = dataToProcess.substring(0, index);
		tokens.add(token);
		System.out.println(tokens);
		
		if(dataToProcess.length() > index)
		{
			recursiveDataProcessing(dataToProcess.substring(index + 1, dataToProcess.length()));
		}
	}
}
