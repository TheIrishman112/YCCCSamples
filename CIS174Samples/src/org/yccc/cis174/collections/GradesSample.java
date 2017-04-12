package org.yccc.cis174.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.yccc.cis174.dto.Assignment;
import org.yccc.cis174.dto.User;

public class GradesSample {
	
	private List<User> students = new ArrayList<User>();
	private List<Assignment> assignments = new ArrayList<Assignment>();
	private Map <User, Collection<Assignment>>gradeBook = new HashMap<User, Collection<Assignment>>();
	
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
	
	private void loadGradeBook()
	{
		for(User user : students){
			// create a map where the User is the key, and the value is a copy of all the assignments we have defined.
			gradeBook.put(user, new ArrayList<Assignment>(assignments));
		}
	}
	
	private void printGradeBook()
	{
		for(User user : students){
			List<Assignment> grades = (List<Assignment>) gradeBook.get(user);
			System.out.println( user + " " + grades);
		}
	}
	
	
	
	public static void main(String[] args){
		GradesSample gs = new GradesSample();
		gs.loadAssignments();
		gs.loadStudents();
		gs.loadGradeBook();
		gs.printGradeBook();	
	}	

}
