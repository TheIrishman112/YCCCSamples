package org.yccc.cis174.insurance.dto;

public class Address {
	private String street;
	private String number;
	private String city;
	private String state;
	private String zip;
	private boolean isPrimaryAddress;
	private boolean isBillingAddress;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public boolean isPrimaryAddress() {
		return isPrimaryAddress;
	}
	public void setPrimaryAddress(boolean isPrimaryAddress) {
		this.isPrimaryAddress = isPrimaryAddress;
	}
	public boolean isBillingAddress() {
		return isBillingAddress;
	}
	public void setBillingAddress(boolean isBillingAddress) {
		this.isBillingAddress = isBillingAddress;
	}
	
}
