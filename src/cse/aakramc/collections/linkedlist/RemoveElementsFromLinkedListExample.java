package cse.aakramc.collections.linkedlist;

import java.util.LinkedList;

// remove first element
// remove last element
// remove first occurrence of a given element
// clear LinkeList completely

public class RemoveElementsFromLinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> fruits = new LinkedList<String>();
		
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Pineapple");
		
		System.out.println("Intial LinkedList => " + fruits);
		
		// Remove the first element in LinkedList
		String firstElement = fruits.removeFirst();
		System.out.println("After removing first element => " + fruits + " -> first element is: " + firstElement);
		
		// Removing the last element in LinkedList
		String lastElement = fruits.removeLast();
		System.out.println("After removing last one => " + fruits + " -> last element is: " + lastElement);
		
		// remove object
		fruits.remove("Mango"); 
		System.out.println(fruits);
		
		// clear 
		fruits.clear();
		System.out.println("Clear all => " + fruits);

	}

}
