package cse.aakramc.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

// remove()
// removeAll()
// clear()

public class RemoveElementsArrayList {

	public static void main(String[] args) {
		
		List<String> fruits =  new ArrayList<String>();
		
		// adding new elements to the ArrayList
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Pineapple");
		fruits.add("Grapes");
		
		System.out.println(fruits);
		
		// remove() index
		fruits.remove(4);
		System.out.println("After removing element at index 4 => " + fruits);
		
		// remove() object
		fruits.remove("Mango");
		System.out.println("After removeing mango element => " + fruits);
		
		// removing all the elements that existing in a given collection
		List<String> subFruits = new ArrayList<String>();
		subFruits.add("Apple");
		subFruits.add("Banana");
		
		fruits.removeAll(subFruits);
		System.out.println(fruits);
		
		fruits.clear();
		System.out.println(fruits);
	}

}
