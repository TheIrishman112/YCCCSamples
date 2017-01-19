package org.yccc.cis174.agency;

import java.util.ArrayList;
import java.util.List;

public class Quote {
	private List<Address> addresses = new ArrayList<Address>();
	private List<Operator> operators = new ArrayList<Operator>();
	private List<Vehicle> vehicles = new ArrayList<Vehicle>();
	private double price;
	
	
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<Operator> getOperators() {
		return operators;
	}
	public void setOperators(List<Operator> operators) {
		this.operators = operators;
	}
	public List<Vehicle> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

}
