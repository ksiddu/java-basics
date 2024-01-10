package com.siddu.java.programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. cannot contain duplicate elements
		// 2. HashSet does not maintain insertion order
		// 3. cannot access using index(for loop)
		// 4. dynamic array, size increases automatically
		// 5. non-synchronized (not thread safe)
		// 6. can contain one null element
		// 7. LinkedHashSet maintains insertion order
		// 8. TreeSet maintains element ordering in increasing

		Set<Integer> set1 = new HashSet<Integer>();

		set1.add(10);
		set1.add(20);
		set1.add(30);

		System.out.println("using HashSet class");
		System.out.println("Size of a set: " + set1.size());
		System.out.println("Elements of a set: " + set1);

		set1.add(40);
		set1.add(50);

		System.out.println("Size of a set: " + set1.size());
		System.out.println("Elements of a set: " + set1);

		// accessing the elements using for each loop
		System.out.println("accessing the elements using for each loop");
		for (Integer value : set1) {
			System.out.println("Element is: " + value);
		}

		// accessing the elements using iterator
		System.out.println("accessing the elements using iterator");
		Iterator it = set1.iterator();

		while (it.hasNext()) {
			System.out.println("Element is: " + it.next());
		}

		System.out.println("using LinkedHashSet class");
		Set<Integer> set2 = new LinkedHashSet<Integer>();

		set2.add(10);
		set2.add(20);
		set2.add(30);

		System.out.println("Size of a set: " + set2.size());
		System.out.println("Elements of a set: " + set2);

		set2.add(40);
		set2.add(50);

		System.out.println("Size of a set: " + set2.size());
		System.out.println("Elements of a set: " + set2);

		System.out.println("using TreeSet class");
		Set<Integer> set3 = new TreeSet<Integer>();

		set3.add(50);
		set3.add(60);
		set3.add(10);

		System.out.println("Size of a set: " + set3.size());
		System.out.println("Elements of a set: " + set3);

		set3.add(5);
		set3.add(2);

		System.out.println("Size of a set: " + set3.size());
		System.out.println("Elements of a set: " + set3);
	}

}
