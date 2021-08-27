package cse.aakramc.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetRemoveExample {

	public static void main(String[] args) {
		
		// creating HashSet
		Set<String> progLangs = new HashSet<>();
		progLangs.add("C");
		progLangs.add("C++");
		progLangs.add("Java");
		progLangs.add("Python");
		progLangs.add("C#");
		progLangs.add("Scala");
		
		System.out.println("Programming Languages : " + progLangs);
		
		// using remove() method
		boolean result = progLangs.remove("C#");
		System.out.println("remove method result -> " + result);
		System.out.println("After removing: " + progLangs);
		
		// using removeAll() method
		
		Set<String> webFramework = new HashSet<String>();
		webFramework.add("Java");
		webFramework.add("Laravel");
		webFramework.add("Hibernate");
		webFramework.add("Python");
		
		progLangs.removeAll(webFramework);
		System.out.println(progLangs);
		
		// clear() method
		progLangs.clear();
		System.out.println("clear() method : " + progLangs);
	}
}
