package org.yccc.cis174.assignments.rulesengine;

import java.util.ArrayList;
import java.util.List;

import org.yccc.cis174.dto.Quote;

public class RulesEngine {
	private RulesEngine rulesEngine;
	private static List<Rule> rules = new ArrayList<Rule>();
	static {
		rules.add(new DUIRule());
	}
	
	/** 
	 * Singleton pattern helps assure that you have only a single instance of an object in memory.
	 * @return
	 */
	public RulesEngine getInstance()
	{
		if(rulesEngine == null)
		{
			rulesEngine = new RulesEngine();
		}
		return rulesEngine;
	}
	
	private void processRules(Quote quote)
	{
		for(Rule rule: rules)
		{
			rule.config(quote);
			rule.execute();
			rule.getMessage();
		}
	}
}
