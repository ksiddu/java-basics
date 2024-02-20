package com.siddu.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortingUsingComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// list element sort using Collections utility class in java.util package
		List<Integer> list = new ArrayList<>();

		list.add(100);
		list.add(5);
		list.add(90);
		list.add(45);
		list.add(64);

		List<String> list2 = new ArrayList<>();

		list2.add("Z");
		list2.add("C");
		list2.add("B");
		list2.add("H");
		list2.add("I");

		System.out.println("================================");
		System.out.println("Integer ArrayList elements before sort: " + list);
		System.out.println("================================");

		Collections.sort(list, new Comparator<Integer>() {

			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});

		System.out.println("================================");
		System.out.println("Integer ArrayList elements after asc sort: " + list);
		System.out.println("================================");

		Collections.sort(list, new Comparator<Integer>() {

			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});

		System.out.println("================================");
		System.out.println("ArrayList elements after desc sort: " + list);
		System.out.println("================================");

		System.out.println("================================");
		System.out.println("String ArrayList elements before sort: " + list2);
		System.out.println("================================");

		Collections.sort(list2, new Comparator<String>() {

			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});

		System.out.println("================================");
		System.out.println("String ArrayList elements after asc sort: " + list2);
		System.out.println("================================");

		Collections.sort(list2, new Comparator<String>() {

			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});

		System.out.println("================================");
		System.out.println("String ArrayList elements after desc sort: " + list2);
		System.out.println("================================");

	}

}
