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
	
	
	
	public static void main(String[] args) throws IOException
	{
		String document = "<node><child>child A</child><child>child B</child><child>child C</child></node>";
		
		
		Recursion r = new Recursion();
		r.directoyRecursion("C:/Users");
		//r.recursiveDataProcessing("Mike Bourgeois mike.bourgeois@gmail.com");
		
		//r.xmlParse(document);
		
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
			
		List<String> tokens = new ArrayList<String>();
		String token = dataToProcess.substring(0, index);
		tokens.add(token);
		System.out.println(tokens);
		
		if(dataToProcess.length() > index)
		{
			recursiveDataProcessing(dataToProcess.substring(index + 1, dataToProcess.length()));
		}
	}
	
	
	private Node xmlParse(String xml)
	{
		int closeNode = xml.indexOf(">");
		String name = xml.substring(1, closeNode);
		
		int closeElement = xml.lastIndexOf(name);
		String value = xml.substring(name.length() + 2, closeElement - 2);
		
		Node n = new Node(name, value);
		System.out.println(n);
		
		return null;		
	}
}
