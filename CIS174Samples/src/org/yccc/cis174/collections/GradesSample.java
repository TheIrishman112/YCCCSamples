package org.yccc.cis174.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.yccc.cis174.dto.Assignment;
import org.yccc.cis174.dto.User;

public class GradesSample {
	
	private List<User> students = new ArrayList<User>();
	private List<Assignment> assignments = new ArrayList<Assignment>();
	
	private void loadStudents()
	{
		students.add(new User("Mike", "Bourgeois", "mike.bourgeois@gmail.com"));
		students.add(new User("Theodore", "Huckstable", "thuck@gmail.com"));
		students.add(new User("Steven", "Hawking", "shawking@gmail.com"));
	}
	
	private void loadAssignments()
	{
		assignments.add(new Assignment(1, "Objects", "Create an Object to represent a Book", 25));
		assignments.add(new Assignment(2, "Collections", "Create an Collection of Books", 25));
		assignments.add(new Assignment(3, "Sorting", "Sort your books by Author", 25));
		assignments.add(new Assignment(4, "Classroom Management System", "Manage a classroom", 100));
	}
	
	private void loadGrades()
	{
		Map m = new HashMap();
		for(User user : students){
		}
	}
	
	
	
	

}
