package cse.aakramc.collections.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CreateHashMapExample {

	public static void main(String[] args) {
		
		// example to map numbers to string
		Map<String, Integer> numberMapping = new HashMap<String, Integer>();
		
		// add key-value to map
		numberMapping.put("One", 1);
		numberMapping.put("Two", 2);
		numberMapping.put("Three", 3);
		numberMapping.put("Four", 4);
		numberMapping.put("Five", 5);
		numberMapping.put("Six", 6);
		
		numberMapping.put(null, 7);
		numberMapping.put(null, 8);
		
		System.out.println(numberMapping);
		
		
		// check if a HashMap is empty
		System.out.println(numberMapping.isEmpty());
		
		// find the size of a HashMap
		System.out.println(numberMapping.size());
		
		
		// check if a key exists in the HashMap
		
		if(numberMapping.containsKey("Four")) {
			System.out.println("Exists");
		} else {
			System.out.println("Not exists");
		}
		
		// check if a value exists in a HashMap
		
		if(numberMapping.containsValue(4)) {
			System.out.println("Exists");
		} else {
			System.out.println("Not exists");
		}
		
		
		// get value by key
		
		Integer v1 = numberMapping.get("One");
		System.out.println(v1);
		
		// how to remove keys from HashMap
		
		numberMapping.remove("One");
		System.out.println(numberMapping);
		
		// get only keys from HashMap
		
		Set<String> keys = numberMapping.keySet();
		System.out.println(keys);
		
		// get only values from HashMap
		Collection<Integer> values = numberMapping.values();
		System.out.println(values);
		
		// different ways to iterate over HashMap
		
		// for each method
		for(Map.Entry<String, Integer> entry: numberMapping.entrySet()) {
			System.out.println("key -> " + entry.getKey() + " value -> " + entry.getValue());
		}
		
		
		// using iterator
		Set<Map.Entry<String, Integer>> entries = numberMapping.entrySet();
		
		Iterator<Map.Entry<String, Integer>> it = entries.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> entry = it.next();
			System.out.println("key -> " + entry.getKey() + " value -> " + entry.getValue()); 
		}
	}

}
