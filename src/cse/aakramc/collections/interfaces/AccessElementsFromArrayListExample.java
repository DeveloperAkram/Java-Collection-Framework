package cse.aakramc.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

// isEmpty()
// size()
// get()
// set()

public class AccessElementsFromArrayListExample {

	public static void main(String[] args) {

		List<String> topProgrammingLanguages = new ArrayList<String>();
		
		// check if an ArrayList is empty
		System.out.println("Is the programmingLanguages list emoty? : "
				+ topProgrammingLanguages.isEmpty());
		
		topProgrammingLanguages.add("C");
		topProgrammingLanguages.add("C++");
		topProgrammingLanguages.add("Java");
		topProgrammingLanguages.add("Python");
		topProgrammingLanguages.add(".net"); 
		
		// find the size of an ArrayList
		System.out.println("Here are the top " + topProgrammingLanguages.size()
		 + " Programming languages in the world");
		
		// Retrieve the element at a  given index
		String bestProgrammingLang = topProgrammingLanguages.get(3);
		System.out.println("bestProgrammingLang => " + bestProgrammingLang);
		
		// Modify the element at give index
		topProgrammingLanguages.set(4, "C#");
		System.out.println(topProgrammingLanguages);
		
		
	}

}
