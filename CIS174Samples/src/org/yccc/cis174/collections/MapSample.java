package org.yccc.cis174.collections;

import java.util.HashMap;
import java.util.Map;

import org.yccc.cis174.dto.User;

/**
 * A Map is an object that maps keys to values. A map cannot contain duplicate keys: Each key 
 * can map to at most one value. It models the mathematical function abstraction. The Map 
 * interface includes methods for basic operations (such as put, get, remove, containsKey, 
 * containsValue, size, and empty), bulk operations (such as putAll and clear), and 
 * collection views (such as keySet, entrySet, and values).
 * 
 * @author mbourgeois
 *
 */

public class MapSample {

	public static void main(String[] args){
		Map <String, User>m = new HashMap<String, User>();
		m.put("1", new User("Ted", "Campbell"));
		m.put("2", new User("Steve", "McDonald"));
		
		// Retrieve by the key value.
		Map m2 = new HashMap();
		m2.put(1, "Is the loneliest number");
		m2.put(2, "The number it takes to tango");
		m2.put(3, "Three is the largest number still written with as many lines as the number represents.");
		m2.put("steve", "test");
		System.out.println(m2.get(3));
		
		// There can be only one!
		Map productCodes = new HashMap();
		productCodes.put(12345, "Sony Walkman");
		productCodes.put(345, "Samsung Galaxy");
		productCodes.put(345, "Apple iPhone");
		
		
		System.out.println(productCodes.get(345));
		System.out.println(productCodes.size());
		System.out.println(productCodes.values());
		
	}

}
