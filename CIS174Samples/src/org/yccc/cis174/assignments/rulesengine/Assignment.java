package org.yccc.cis174.assignments.rulesengine;

import java.util.ArrayList;

import org.yccc.cis174.dto.Quote;

/**
 * Create a rules engine that can process business rules on a Quote object.
 * All business rules should implement the Rule interface.
 * Each rule should update the object that it is being processed, based on the specific rule.
 *
 * @author Michael Bourgeois
 */
public class Assignment {
	
	private ArrayList<Quote> testQuotes = new ArrayList<Quote>();
	private static RulesEngine rulesEngine = RulesEngine.getInstance();
	
	public static void main(String[] argz)
	{
		Assignment a = new Assignment();
		a.loadTestQuotes();
		a.processTestQuotes();	
	}
	
	public void processTestQuotes()
	{
		for(Quote quote : testQuotes)
		{
			rulesEngine.processRules(quote);
		}
	}
	
	public void loadTestQuotes()
	{
		
	}
}
