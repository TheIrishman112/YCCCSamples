package org.yccc.cis174.inheritance;

import java.util.ArrayList;
import java.util.List;

public class InheritanceLesson {
	
	public static void main(String[] args)
	{
		
		Bike b = new Bike();
		System.out.println(b.toString());
		b.start();
		b.stop();
		b.gettingExercise();
		
		
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(b);
		
		
		Plane p = new Plane();
		vehicles.add(p);
		
		for(Vehicle v : vehicles)
		{
			v.start();
			v.stop();
			
			if(v instanceof Bike)
			{
				Bike b2 = (Bike)v;
				b2.gettingExercise();
			}
			else if(v instanceof Plane)
			{
				Plane p2 = (Plane)v;
				
			}
		}
		
		
		
		
	}

}
