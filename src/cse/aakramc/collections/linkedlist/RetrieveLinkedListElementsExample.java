package cse.aakramc.collections.linkedlist;

import java.util.LinkedList;

// get the first element
// get the last element
// get the element at a given index
// get all elements from LinkedList

public class RetrieveLinkedListElementsExample {

	public static void main(String[] args) {
		
		LinkedList<String> fruits = new LinkedList<String>();
		
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Pineapple");
		
		// Getting the first element in the LinkedList using getFirst()
		String firstElemnet = fruits.getFirst();
		System.out.println(" first element => " + firstElemnet);
		
		// Getting the last element 
		String lastElement = fruits.getLast();
		System.out.println(" Last element => " + lastElement);
		
		// Getting the element at a given position in the LinkedList
		String element = fruits.get(2);
		System.out.println("Index checking => " + element);
		
		// all elements 
		for (String fruit: fruits) {
			System.out.println(fruit);
		}
	}

}
