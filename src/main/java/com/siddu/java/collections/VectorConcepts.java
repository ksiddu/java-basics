package com.siddu.java.collections;

import java.util.List;
import java.util.Vector;

public class VectorConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new Vector<String>();

		list.add("Richard");
		list.add("Kevin");
		list.add("Mark");
		list.add("Wilson");

		System.out.println("Vector Elements: " + list);

		for (String s : list) {
			System.out.println("Element: " + s);
		}

	}

}
