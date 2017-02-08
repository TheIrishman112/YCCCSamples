package org.yccc.cis174.inheritance;

public class Plane extends Vehicle
{
	int altitude;
	public Plane()
	{
		setMaxTopSpeed(500);
		setNumberOfPassengers(300);
	}
	
	public void land()
	{
		altitude = 0;
	}
	
	public void takesOff()
	{
		altitude = 15;
	}
	
	public void cruisingAltitude()
	{
		altitude = 30000;
	}

}
