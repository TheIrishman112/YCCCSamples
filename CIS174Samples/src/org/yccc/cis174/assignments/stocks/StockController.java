package org.yccc.cis174.assignments.stocks;

import org.yccc.cis174.assignments.stocks.Stock;

public class StockController {
	
	public static void main(String[] args)
	{
		// Create Object Instance.
		Stock s1 = new Stock();
		// Set Attributes.
		s1.setCurrentPrice(100.00);
		s1.setSymbol("APPL");
		s1.setVolume(100000);
		s1.setYearlyHigh(200.00);
		s1.setYearlyLow(50.00);
		
		// Print Details
		System.out.println(s1);
		
		Stock s2 = new Stock(300.00, "UPS", 550.00, 130.00, 30000000);
		System.out.println(s2);
		s2.calculateFall();
		s2.calculateRise();
		
		
	}
}
