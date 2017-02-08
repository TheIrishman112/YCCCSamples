package org.yccc.cis170.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.yccc.cis170.dtos.User;

public class CollectionsSample {
	
	private List<User> users = new ArrayList<User>();
	
	// custom comparator to sort by first name
	private static Comparator<User> SORT_FIRSTNAME = new Comparator<User>(){

		@Override
		public int compare(User arg0, User arg1) {
			return arg0.getFirstName().compareTo(arg1.getFirstName());
		}	
	};
	
	private static Comparator<User> SORTBY_LASTNAME = new Comparator<User>(){

		@Override
		public int compare(User o1, User o2) {
			return 0;
		}
		
	};
	
	private void loadUsers()
	{
		users.add(new User("Paul", "Ryan", "paul@ryan.com", "leaveMeAlone"));
		users.add(new User("Donald", "Trump", "trump@trump.com", "GreatAgain"));
		users.add(new User("Hillary", "Clinton", "hillary@clinton.com", "deleteMe"));
	}
	
	private void loopOverList()
	{
		for(User user : users)
		{
			user.getEmail();
			System.out.println(user);
		}
	}
	
	private void sortList()
	{
		System.out.println("Sort by first name");
		Collections.sort(users, SORT_FIRSTNAME);
		loopOverList();
	}
	
	
	public static void main(String[] args)
	{
		CollectionsSample cs = new CollectionsSample();
		cs.loadUsers();
		cs.loopOverList();	
		cs.sortList();
	}

}
