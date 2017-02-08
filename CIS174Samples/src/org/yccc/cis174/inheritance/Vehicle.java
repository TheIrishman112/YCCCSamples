package org.yccc.cis174.inheritance;

public class Vehicle 
{
	private int numberOfPassengers;
	private int speed;
	private int maxTopSpeed;
	private String fuelType;
	
	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}
	
	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public int getMaxTopSpeed() {
		return maxTopSpeed;
	}
	
	public void setMaxTopSpeed(int maxTopSpeed) {
		this.maxTopSpeed = maxTopSpeed;
	}
	
	public String getFuelType() {
		return fuelType;
	}
	
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}	
	
	public void start()
	{
		System.out.println("Vroom");
	}
	
	public void stop()
	{
		System.out.println("Screech");
	}
	
	public String toString()
	{
		return new StringBuilder("Vehicle [ fuelType=").append(getFuelType())
				.append(" maxTopSpeed=").append(getMaxTopSpeed())
				.append(" numberOfPassengers=").append(getNumberOfPassengers())
				.append(" ]").toString();
	}
	
}
