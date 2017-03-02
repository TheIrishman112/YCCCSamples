package org.yccc.cis174.dto;

public class Operator extends User{

	private int riskRating;
	private int age;
	
	public Operator(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getRiskRating() {
		return riskRating;
	}

	public void setRiskRating(int riskRating) {
		this.riskRating = riskRating;
	}
}
