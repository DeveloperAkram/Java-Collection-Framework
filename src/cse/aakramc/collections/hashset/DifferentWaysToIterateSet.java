package cse.aakramc.collections.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DifferentWaysToIterateSet {

	public static void main(String[] args) {

		// creating HashSet
		Set<String> progLangs = new HashSet<>();
		progLangs.add("C");
		progLangs.add("C++");
		progLangs.add("Java");
		progLangs.add("Python");
		progLangs.add("C#");
		progLangs.add("Scala");

		
		// Enhanced for loop
		for(String lang: progLangs) {
			System.out.println(lang);
		}
		
		// Basic loop with iterator
		for (Iterator<String> iterator = progLangs.iterator(); iterator.hasNext();) {
			String lang = (String) iterator.next();
			System.out.println(lang);
			
		}
		
		// while loop with iterator
		Iterator<String> it = progLangs.iterator();
		while (it.hasNext()) {
			String lang = (String) it.next();
			System.out.println(lang);
			
		}
		
		// JDK 8 forEach method() with lambda
		progLangs.forEach(lang->System.out.println(lang));
		
		
		// JDK 8 streaming + forEach() + lambda expression
		// except Java 
		progLangs.stream().filter(lang -> !"Java".equals(lang)).forEach(lang -> System.out.println(lang));

	}

}
