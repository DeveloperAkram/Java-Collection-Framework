package cse.aakramc.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSetExample {

	public static void main(String[] args) {
		
		// create a HashSet using the HashSet() constructor
		// add new elements to it using the add() method
		
		// unordered collections
		Set<String> progLangs = new HashSet<>();
		progLangs.add("C");
		progLangs.add("C++");
		progLangs.add("Java");
		progLangs.add("Python");
		progLangs.add("C#");
		progLangs.add("Scala");
		
		System.out.println("Programming Languages : " + progLangs);
		
		// let's add duplicate element : override element
		
		progLangs.add("Java");
		System.out.println("Programming Languages : " + progLangs);

	}

}
