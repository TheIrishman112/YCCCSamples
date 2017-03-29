package org.yccc.cis174.dto;

public class Assignment {
	private int id;
	private String name;
	private String description;
	private int pointsPossible;
	
	public Assignment(int id, String name, String description, int pointsPossible)
	{
		this.id = id;
		this.name = name;
		this.description = description;
		this.pointsPossible = pointsPossible;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPointsPossible() {
		return pointsPossible;
	}
	public void setPointsPossible(int pointsPossible) {
		this.pointsPossible = pointsPossible;
	}

}
