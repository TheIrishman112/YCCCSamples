package org.yccc.cis174.dto;

public class Grade {
	private Assignment assignment;
	private int pointsAchieved;
	
	public Assignment getAssignment() {
		return assignment;
	}
	public void setAssignment(Assignment assignment) {
		this.assignment = assignment;
	}
	public int getPointsAchieved() {
		return pointsAchieved;
	}
	public void setPointsAchieved(int pointsAchieved) {
		this.pointsAchieved = pointsAchieved;
	}
}
