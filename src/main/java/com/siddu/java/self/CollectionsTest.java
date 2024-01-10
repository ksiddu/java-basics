package com.siddu.java.self;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(5);
		list.add(1);
		list.add(4);
		list.add(3);

		System.out.println("Before sorting");

		for (Integer i : list) {

			System.out.println(i);

		}

		System.out.println("=================");

		System.out.println("After ascending sorting");

		Collections.sort(list);

		for (Integer i : list) {

			System.out.println(i);

		}

		System.out.println("=================");

		System.out.println("After descending sorting");

		Collections.sort(list, Collections.reverseOrder());

		for (Integer i : list) {

			System.out.println(i);

		}

		System.out.println("=================");

		LinkedList<String> linkedList = new LinkedList<String>();

		linkedList.add("Siddu");
		linkedList.add("Naveen");
		linkedList.add("Bob");
		linkedList.add("Andy");
		linkedList.add("Tom");

		System.out.println("=================");

		System.out.println("Initial LinkedList : " + linkedList);

		System.out.println("=================");

		linkedList.addFirst("Yuvraj");
		linkedList.addLast("Singh");

		System.out.println("=================");

		System.out.println("New LinkedList after adding start and ending: " + linkedList);

		System.out.println("=================");

		linkedList.removeFirst();
		linkedList.removeLast();

		System.out.println("New LinkedList after removing start and ending: " + linkedList);

		System.out.println("=================");

		System.out.println("=================");

		System.out.println("Accessing elements in different ways: for, for-each, iterator");

		System.out.println("Accessing elements in different ways: for loop");

		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println("Element : " + linkedList.get(i));
		}

		System.out.println("=================");

		System.out.println("Accessing elements in different ways: for-each loop");

		for (String str : linkedList) {
			System.out.println("Element : " + str);
		}

		System.out.println("=================");

		System.out.println("=================");

		System.out.println("Accessing elements in different ways: iterator");

		Iterator<String> ite = linkedList.iterator();

		while (ite.hasNext()) {

			System.out.println("Element : " + ite.next());

		}

		System.out.println("=================");

		System.out.println("***** using java8 lamda expression *****");

		linkedList.forEach(e -> {
			System.out.println("Element: " + e);
		});

		System.out.println("=================");

		System.out.println("***** using java8 lamda expression *****");

		linkedList.forEach(System.out::println);

		System.out.println("=================");

		System.out.println("***** using streams forEach and forEachOrdered");

		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list2.add(90);
		list2.add(10);
		list2.add(30);
		list2.add(20);
		list2.add(40);

		list2.stream().forEach(System.out::println);

		System.out.println("=================");

		System.out.println("***** using streams forEach and forEachOrdered");

		list2.stream().forEachOrdered(System.out::println);

		System.out.println("=================");

		System.out.println("***** using parallel streams forEach");

		list2.parallelStream().forEach(System.out::println);

		System.out.println("=================");

		System.out.println("***** LinkedList Sorting");

		System.out.println("After ascending sorting");

		ArrayList<Integer> list3 = new ArrayList<Integer>();

		list3.add(90);
		list3.add(10);
		list3.add(30);
		list3.add(20);
		list3.add(40);

		Collections.sort(list3);

		list3.forEach(System.out::println);

		System.out.println("=================");

		System.out.println("After descending sorting");

		Collections.sort(list3, Collections.reverseOrder());

		list3.forEach(System.out::println);

		System.out.println("=================");

		HashSet<Integer> set1 = new HashSet<Integer>();

		set1.add(50);
		set1.add(10);
		set1.add(30);
		set1.add(20);
		set1.add(40);

		System.out.println("=================");

		System.out.println("HashSet elements iterate: no order is maintained ");

		set1.forEach(System.out::println);

		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();

		set2.add(50);
		set2.add(10);
		set2.add(30);
		set2.add(20);
		set2.add(40);

		System.out.println("=================");

		System.out.println("LinkedHashSet elements iterate: insertion order is maintained ");

		set2.forEach(System.out::println);

		TreeSet<Integer> set3 = new TreeSet<Integer>();

		set3.add(50);
		set3.add(10);
		set3.add(30);
		set3.add(20);
		set3.add(40);

		System.out.println("=================");

		System.out.println("TreeSet elements iterate: insertion order in ascending");

		set3.forEach(System.out::println);

	}

}
