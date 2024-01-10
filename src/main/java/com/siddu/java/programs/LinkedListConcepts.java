package com.siddu.java.programs;

import java.util.LinkedList;
import java.util.List;

public class LinkedListConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

	}

}
