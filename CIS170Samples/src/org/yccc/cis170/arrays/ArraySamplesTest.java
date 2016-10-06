package org.yccc.cis170.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArraySamplesTest {
	String[] withDupes = new String[]{"dog", "cat", "dog", "giraffe"};
	
	@Test
	public void testRemoveDupes() {
		ArrayAssignment aa = new ArrayAssignment();
	
		String[] dupeFree = aa.removeDupes(withDupes);
		int dogCount = 0;
		for(int i = 0; i < dupeFree.length; i++)
		{
			if("dog".equals(dupeFree[i]))
			{
				dogCount += 1;
			}
		}
		
		if(dogCount > 1)
		{
			fail("Too many dogs!");
		}
	}
	
	@Test
	public void testContains()
	{
		ArrayAssignment aa = new ArrayAssignment();
		assertTrue(aa.containsValue(withDupes, "dog"));
		assertFalse(aa.containsValue(withDupes, "super"));
	}
}
