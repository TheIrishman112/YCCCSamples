package org.yccc.samples.arrays;

public class ArraySamples 
{
	private void createArray()
	{
		// Create an array  with the values already populated.
		String[] myFriends = new String[]{"Steve", "Bob", "Jaqui", "Praveen"};
		int[] myLotterNumbers = {7, 13, 26, 44, 68, 3};
		
		// Create an array that will be populated later.
		String[] yourFriends = new String[8];
		Long[] phoneNumbers = new Long[16];
		
		//Loop over an array
		for(int i = 0; i < myFriends.length; i++)
		{
			System.out.println(myFriends[i]);
		}
		
		for(int i = 0; i < yourFriends.length; i++)
		{
			yourFriends[i] = "No one";
		}
	}

}
