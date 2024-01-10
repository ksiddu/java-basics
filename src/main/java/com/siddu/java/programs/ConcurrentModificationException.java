package com.siddu.java.programs;

import java.util.ArrayList;

public class ConcurrentModificationException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// We cannot add or remove elements to the collection while using iterator over
		// it.
		ArrayList<String> books = new ArrayList<String>();
		books.add("C");
		books.add("Java");
		books.add("Cobol");

		for (String obj : books) {
			System.out.println(obj);
			// We are adding element while iterating list
			books.add("C++");
			//books.remove(2);
		}
		System.out.println(books);
	}

}
