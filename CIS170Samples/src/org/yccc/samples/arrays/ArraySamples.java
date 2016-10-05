package org.yccc.samples.arrays;

import org.yccc.samples.dtos.User;

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
	
	public User[] loadUsers()
	{
		User user1 = new User("Mike", "Bourgeois", "mike.bourgeois@gmail.com", null);
		User user2 = new User("Frank", "Figgle", "frank.figgle@gmail.com", null);
		
		User[] users = new User[] {user1, user2};
		
		return users;	
	}

}
