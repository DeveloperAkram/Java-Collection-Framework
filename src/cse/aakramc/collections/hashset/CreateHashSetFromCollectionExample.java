package cse.aakramc.collections.hashset;

import java.util.HashSet;
import java.util.Set;


public class CreateHashSetFromCollectionExample {

	public static void main(String[] args) {
		
		 // first 5 even number
		Set<Integer> fstFiveEvenNum = new HashSet<Integer>();
		fstFiveEvenNum.add(2);
		fstFiveEvenNum.add(4);
		fstFiveEvenNum.add(6);
		fstFiveEvenNum.add(8);
		fstFiveEvenNum.add(10);
		
		// 1. create a HashSet from another collection using the HashSet(Collection c) constructor.
		Set<Integer> tenEvenNum = new HashSet<Integer>(fstFiveEvenNum);
		// System.out.println("Ten even numbers: " + tenEvenNum);
		
		Set<Integer> nextFiveEvenNum = new HashSet<Integer>();
		nextFiveEvenNum.add(12);
		nextFiveEvenNum.add(14);
		nextFiveEvenNum.add(16);
		nextFiveEvenNum.add(18);
		nextFiveEvenNum.add(20);
		
		// 2. Add all the elements from a collection to the HashSet using the addAll() method.
		tenEvenNum.addAll(nextFiveEvenNum);
		System.out.println("Ten even numbers: " + tenEvenNum);
		

	}

}
