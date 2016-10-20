package org.yccc.cis170.inheritance;

public class InheritanceLesson {
	
	public static void main(String[] args)
	{
		Car c = new Car();
		
		if(c instanceof Vehicle){
			System.out.println("It's a vehicle");
		}
		
		
	}

}
