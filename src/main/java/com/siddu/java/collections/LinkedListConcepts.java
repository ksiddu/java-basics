package com.siddu.java.collections;

import java.util.LinkedList;

public class LinkedListConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Characteristics:
		// 1. uses doubly linked list internally to store the elements
		// 2. contains duplicate elements
		// 3. maintains the insertion order
		// 4. random access using the index of the elements
		// 5. manipulation is fast since no shifting is required
		// 6. non-synchronized (not thread safe)

		LinkedList<String> list = new LinkedList<String>();

		list.add("Siddu");
		list.add("Naveen");
		list.add("Bob");
		list.add("Andy");
		list.add("Tom");

		System.out.println("Elements of a ll: " + list);

		// add first element
		list.addFirst("Yuvraj");
		System.out.println("Elements of a ll: " + list);

		// add last element
		list.addLast("Singh");
		System.out.println("Elements of a ll: " + list);

		// remove first element
		list.removeFirst();
		System.out.println("Elements of a ll: " + list);

		// remove last element
		list.removeLast();
		System.out.println("Elements of a ll: " + list);

		// get specific element
		System.out.println("Elements at specific index: " + list.get(2));

		// get first element

		System.out.println("Elements at specific index: " + list.getFirst());

		// get last element
		System.out.println("Elements at specific index: " + list.getLast());

		// get random element
		System.out.println("Elements at specific index: " + list.get(3));

	}

}
