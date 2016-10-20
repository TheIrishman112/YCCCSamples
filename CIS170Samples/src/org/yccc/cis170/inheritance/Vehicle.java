package org.yccc.cis170.inheritance;

public class Vehicle {
	String fuel;
	boolean isPassenger;
	boolean isAutonomous;
	boolean isStreetLegal;
	
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public boolean isPassenger() {
		return isPassenger;
	}
	public void setPassenger(boolean isPassenger) {
		this.isPassenger = isPassenger;
	}
	public boolean isAutonomous() {
		return isAutonomous;
	}
	public void setAutonomous(boolean isAutonomous) {
		this.isAutonomous = isAutonomous;
	}
	public boolean isStreetLegal() {
		return isStreetLegal;
	}
	public void setStreetLegal(boolean isStreetLegal) {
		this.isStreetLegal = isStreetLegal;
	}
}
