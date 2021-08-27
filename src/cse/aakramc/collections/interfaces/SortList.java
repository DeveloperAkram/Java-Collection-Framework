package cse.aakramc.collections.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		

		/*
		// create list
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(40);
		list.add(60);
		list.add(50);
		
		Collections.sort(list); // ascending order
		System.out.println(list);
		
		Collections.reverse(list); // descending order
		System.out.println(list);
		*/
		
		//SortList sr = new SortList();
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(10, "Akram", 25, 45000));
		employees.add(new Employee(20, "Abdul", 21, 25000));
		employees.add(new Employee(30, "Kamal", 35, 85000));
		employees.add(new Employee(40, "Younus", 29, 65000));
		
		/*
		Collections.sort(employees, sr.new MySort());
		System.out.println(employees);
		*/
		
		// lambda
		Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o1.getSalary() - o2.getSalary());
			}
			
		});
		
		Collections.sort(employees, (o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
		System.out.println(employees);
	}
	
	class MySort implements Comparator<Employee> {
		
		@Override
		public int compare(Employee o1, Employee o2) {
			return (int) (o1.getSalary() - o2.getSalary());
		}
	}

}
