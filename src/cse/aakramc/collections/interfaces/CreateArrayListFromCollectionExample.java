package cse.aakramc.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

// How to create an ArrayList from another collection using the
// ArrayList ( Collection c) constructor

//How to create an ArrayList using the ArrayList() constructor
//Add new elements to an ArrayList using the add() method.
public class CreateArrayListFromCollectionExample {

	public static void main(String[] args) {
		
		// create arrayList object
		List<Integer> firstFivePrimeNumbers = new ArrayList<>();
		firstFivePrimeNumbers.add(2);
		firstFivePrimeNumbers.add(3);
		firstFivePrimeNumbers.add(5);
		firstFivePrimeNumbers.add(7);
		firstFivePrimeNumbers.add(11);
		
		List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
		
		List<Integer> nextFivePrimeNumbers = new ArrayList<>();
		nextFivePrimeNumbers.add(13);
		nextFivePrimeNumbers.add(17);
		nextFivePrimeNumbers.add(19);
		nextFivePrimeNumbers.add(23);
		nextFivePrimeNumbers.add(29);
		
		firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
		
		System.out.println(firstTenPrimeNumbers);
	}

}
