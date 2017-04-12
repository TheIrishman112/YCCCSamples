package org.yccc.cis174.recusion;

public class Node {
	private String name;
	private String value;
	
	public Node(String name, String value){
		this.name = name;
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	public String toString(){
		return new StringBuilder("<").append(name).append(">")
				.append(value).append("</").append(name).append(">").toString();
	}

}
