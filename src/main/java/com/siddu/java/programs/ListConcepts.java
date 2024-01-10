package com.siddu.java.programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// dynamic array - ArrayList
		// 1. can contain duplicate elements
		// 2. maintains insertion order
		// 3. can access using index(for loop), for each, iterator, listIterator
		// 4. dynamic array, size increases automatically
		// 5. non-synchronized (not thread safe)

		List<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(30);

		System.out.println("Size of a list: " + list.size());
		System.out.println("Elements of a list: " + list);

		list.add(40);
		list.add(50);

		System.out.println("Size of a list: " + list.size());
		System.out.println("Elements of a list: " + list);

		// accessing the elements using for loop
		System.out.println("accessing the elements using for loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Element at index[" + i + "]" + " is " + list.get(i));
		}

		// accessing the elements using for each loop
		System.out.println("accessing the elements using for each loop");
		for (Integer value : list) {
			System.out.println("Element is: " + value);
		}

		// accessing the elements using iterator
		System.out.println("accessing the elements using iterator");
		Iterator it = list.iterator();

		while (it.hasNext()) {
			System.out.println("Element is: " + it.next());
		}

		// accessing the elements using lambda expression
		System.out.println("accessing the elements using forEachRemaining");

		Iterator it2 = list.iterator();
		it2.forEachRemaining((ele) -> System.out.println(ele));

		// accessing the elements using lambda expression
		System.out.println("accessing the elements using forEachRemaining with complex statements");

		int count = 0;
		Iterator it3 = list.iterator();
		it3.forEachRemaining((ele) -> {
			System.out.println("Index is:");
			System.out.println(ele);
		
		});

	}

}
