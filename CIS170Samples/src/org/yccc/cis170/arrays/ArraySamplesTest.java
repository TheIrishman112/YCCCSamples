package org.yccc.cis170.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArraySamplesTest {

	@Test
	public void test() {
		ArrayAssignment aa = new ArrayAssignment();
		
		String[] withDupes = new String[]{"dog", "cat", "dog", "giraffe"};
		String[] dupeFree = aa.removeDupes(withDupes);
		
		for(int i = 0; i < dupeFree.length; i++)
		{
			if("dog".equals(dupeFree[i]))
			{
				fail("Still has dupes!");
			}
		}
	}

}
