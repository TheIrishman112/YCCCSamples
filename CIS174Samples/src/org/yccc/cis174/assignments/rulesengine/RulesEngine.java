package org.yccc.cis174.assignments.rulesengine;

import java.util.ArrayList;
import java.util.List;

import org.yccc.cis174.dto.Quote;

public class RulesEngine {
	private static RulesEngine rulesEngine;
	private static List<Rule> rules = new ArrayList<Rule>();
	static {
		rules.add(new DUIRule());
		rules.add(new GoodStudentDiscount());
		rules.add(new HighValueCollector());
	}
	
	// Prevents instantiation, forces people through getInstance.
	private RulesEngine(){}
	
	/** 
	 * Singleton pattern helps assure that you have only a single instance of an object in memory.
	 * @return
	 */
	public static RulesEngine getInstance()
	{
		if(rulesEngine == null)
		{
			rulesEngine = new RulesEngine();
		}
		return rulesEngine;
	}
	
	public void processRules(Quote quote)
	{
		for(Rule rule: rules)
		{
			System.out.println("Executing " + rule.getClass().getSimpleName());
		
			rule.config(quote);
			rule.execute();
			rule.getMessage();
		}
	}
}
