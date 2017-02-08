package org.yccc.cis174.inheritance;

public class Bike extends Vehicle
{
	boolean hasBasket;
	boolean hasHorn;
	boolean isMtnBike;
	
	public Bike()
	{
		setFuelType("Calories");
		setMaxTopSpeed(30);
		setNumberOfPassengers(1);
	}
	
	public void start()
	{
		System.out.println("Pant");
	}
	
	public void gettingExercise()
	{
		
	}
	
	


}
