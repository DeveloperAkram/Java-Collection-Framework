package cse.aakramc.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSearchIteratationExample {

	public static void main(String[] args) {
		
		LinkedList<String> progLang = new LinkedList<String>();
		
		progLang.add("C");
		progLang.add("C++");
		progLang.add("Core Java");
		progLang.add("Java EE");
		progLang.add("Spring Framework");
		progLang.add("Spring Framework");
		progLang.add("Hibernate Framework");
		
		
		boolean result = progLang.contains("C");
		System.out.println("Contains() method -> " + result);
		
		// find the index  of the first occurrence of an element in the LinkedList
		int index = progLang.indexOf("Core Java");
		System.out.println("indexOf() method -> " + index);
		
		// find the index of the last occurrence of element in the LinkedList
		int lastIndex = progLang.lastIndexOf("Spring Framework");
		System.out.println("lastIndex() method -> " + lastIndex);
		
		
		// iterator
		System.out.println("\nIterator method : ");
		Iterator<String> it = progLang.iterator();
		while (it.hasNext()) {
			String prog = (String) it.next();
			System.out.println(prog);
		}
		
		System.out.println("\nForEach lambda method : ");
		// forEach
		progLang.forEach((element) -> {
			System.out.println(element);
		});
		
		System.out.println("\nForEach advanced method : ");
		// for each advance loop
		for(String e : progLang) {
			System.out.println(e);
		}
		
		
	}

}
