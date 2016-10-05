package org.yccc.cis170.arrays;

import org.yccc.cis170.dtos.User;

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
		User user1 = new User("Jill", "Stein", "jstein.com", "Is email green?");
		User user2 = new User("Gary", "Johnson", "gjohnson@gmail.com", null);
		User user3 = new User("Donald", "Trump", "dtrump@gmail.com", "Great Again!");
		User user4 = new User("Hillary", "Clinton", "hclinton@gmail.com", "What emails?");
		
		User[] users = new User[] {user1, user2, user3, user4,
				new User("Bernie", "Sanders", "bsanders@gmail.com", "Other Peoples money")};
		
		return users;	
	}
	
	public void loopOverArray()
	{
		User[] localUsers = loadUsers();
		
		for(int i = 0; i < localUsers.length; i++)
		{
			System.out.println(localUsers[i]);
		}
	}
	
	public static void main(String[] argz)
	{
		ArraySamples as = new ArraySamples();
		as.loopOverArray();
	}

}
