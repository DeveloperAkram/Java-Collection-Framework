package cse.aakramc.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapUserDefinedExample {

	public static void main(String[] args) {
		
		// create HashMap
		
		Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
		
		studentMap.put(1, new Student("Akram", "Chowdhury"));
		studentMap.put(2, new Student("Kalim", "Ahmad"));
		studentMap.put(3, new Student("Rahman", "Ali"));
		studentMap.put(4, new Student("Yakub", "Uddin"));
		
		System.out.println(studentMap);
		
	}
}
