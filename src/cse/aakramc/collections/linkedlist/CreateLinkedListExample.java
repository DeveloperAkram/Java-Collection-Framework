package cse.aakramc.collections.linkedlist;

import java.util.LinkedList;

// add()
// add(2, element)
// addFirst()
// addLast()

public class CreateLinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> fruits = new LinkedList<>();
		
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Pineapple");
		
		System.out.println("initial linkedlist -> " + fruits);
		
		// Adding an element at the specified position in the Linkedlist
		fruits.add(2, "Watermelon");  //2
		System.out.println("After adding watermelon -> " + fruits);
		
		// Adding an element at the beginning of the LinkedList
		((LinkedList<String>) fruits).addFirst("JackFruit");
		System.out.println("Adding first element -> " + fruits);
		
		// Adding an element at the end of the LinkedList
		fruits.addLast("Strawberry");
		System.out.println("After adding last element - > " + fruits);

	}

}
