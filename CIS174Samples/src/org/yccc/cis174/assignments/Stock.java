package org.yccc.cis174.assignments;

public class Stock 
{
	private Double currentPrice;
	private String symbol;
	private Double yearlyHigh;
	private Double yearlyLow;
	private int volume;
	
	public Stock(Double currentPrice, String symbol, Double yearlyHigh, Double yearlyLow, int volume)
	{
		this.currentPrice = currentPrice;
		this.symbol = symbol;
		this.yearlyHigh = yearlyHigh;
		this.yearlyLow = yearlyLow;
		this.volume = volume;
	}
	
	// no arg constructor.
	public Stock()
	{
		
	}
	
	public Double getCurrentPrice() {
		return currentPrice;
	}
	
	public void setCurrentPrice(Double currentPrice) {
		this.currentPrice = currentPrice;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	public Double getYearlyHigh() {
		return yearlyHigh;
	}
	
	public void setYearlyHigh(Double yearlyHigh) {
		this.yearlyHigh = yearlyHigh;
	}
	
	public Double getYearlyLow() {
		return yearlyLow;
	}
	
	public void setYearlyLow(Double yearlyLow) {
		this.yearlyLow = yearlyLow;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public String calculateRise()
	{
		double diff = yearlyHigh - currentPrice;
		double rise = diff / currentPrice * 100;
		
		return "%" + String.valueOf(rise);
	}
	
	public String calculateFall()
	{
		double diff = yearlyLow - currentPrice;
		double rise = diff / currentPrice * 100;
		
		return "%" + String.valueOf(rise);
	}
	
	public String toString()
	{
		return "Stock Symbol " + this.symbol + " Current Price " + this.currentPrice + " Rise " + calculateRise() + " Fall " + calculateFall();
	}
}
