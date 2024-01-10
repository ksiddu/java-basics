package com.siddu.java.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// https://www.geeksforgeeks.org/how-to-use-iterator-in-java/
		ArrayList<String> list = new ArrayList<String>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		// Iterator to traverse the list
		Iterator iterator = list.iterator();

		System.out.println("List elements : ");

		while (iterator.hasNext())
			System.out.print(iterator.next() + " ");

		System.out.println();

		System.out.println("List elements using lambda & forEach: ");

		list.forEach(item -> {
			System.out.print(item + " ");
		});

		System.out.println();
		System.out.println("List elements using lambda & forEachRemaining : ");

		Iterator iterator2 = list.iterator();

		iterator2.forEachRemaining(item2 -> {
			System.out.print(item2 + " ");
		});

	}

}
