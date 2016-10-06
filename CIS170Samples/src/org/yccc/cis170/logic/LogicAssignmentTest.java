package org.yccc.cis170.logic;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;



public class LogicAssignmentTest 
{
	private static List <String> testWords = new ArrayList<String>();
	static{
		testWords.add("giraffe");
		testWords.add("cat");
		testWords.add("flash");
		testWords.add("garage");
	}
	private String guesses = "Aeso";
	@Test
	public void testMaskLength() {
		
		LogicAssignment la = new LogicAssignment();
		for(String testWord : testWords)
		{
			String mask = la.generateMask(testWord);
			System.out.println(mask);
			assertEquals(testWord.length(), mask.length());
			assertNotEquals(testWord, mask);
		}
	}
	
	@Test
	public void testFullMask()
	{
		LogicAssignment la = new LogicAssignment();
		for(String testWord : testWords)
		{
			String mask = la.generateMask(testWord, guesses);
			System.out.println(mask);
			
			assertTrue(mask.contains("A") || mask.contains("a"));
			assertTrue(mask.contains("*"));
		}
	}
	
	@Test
	public void testNew(){
		
	}

}
