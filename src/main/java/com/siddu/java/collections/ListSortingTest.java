package com.siddu.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();

		list.add(90);
		list.add(10);
		list.add(30);
		list.add(5);
		list.add(6);

		System.out.println("Before sort elements: " + list);

		System.out.println("List elements: " + list);

		Collections.sort(list);

		System.out.println("Sorting in ascending order elements: " + list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("List elements: " + list);

	}

}
