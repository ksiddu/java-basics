package com.siddu.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListLoopThroughTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// https://howtodoinjava.com/java/collections/arraylist/iterate-through-objects/

		List<Integer> list = new ArrayList<>();

		list.add(90);
		list.add(10);
		list.add(30);
		list.add(5);
		list.add(6);

		System.out.println("List elements: " + list);

		// 5 ways to iterate the list

		// 1. using for loop
		System.out.println("***** using for loop *****");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Element: " + list.get(i));
		}

		// 2. using for each loop
		System.out.println("***** using for each loop *****");
		for (Integer num : list) {
			System.out.println("Element: " + num);
		}

		// 3. using the iterator
		System.out.println("***** using iterator *****");
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println("Element: " + it.next());
		}

		// 4. using the java8 lamda expression
		System.out.println("***** using java8 lamda expression *****");
		list.forEach(e -> {
			System.out.println("Element: " + e);
		});

		// 5. using the while loop
		System.out.println("***** using while loop *****");
		int index = 0;
		while (list.size() > index) {
			System.out.println("Element: " + list.get(index++));
		}

		// 6. using the java streams and parallelStream
		System.out.println("***** using  java streams *****");

		list.stream().forEach(e -> System.out.println("Element: " + e));

		list.stream().forEachOrdered(e -> System.out.println("Element: " + e));

		list.parallelStream().forEachOrdered(e -> System.out.println("Element: " + e));

	}

}
