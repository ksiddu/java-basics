package com.siddu.java.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Characteristics:
		// 1. can contain max. one null element
		// 2. cannot contains the duplicate elements
		// 3. not maintains the insertion order
		// 4. cannot random access using the index of the elements
		// 5. TBD
		// 6. non-synchronized (not thread safe)
		// 7. HashSet, LinkedHashSet, SortedSet(TreeSet)
		// 8. LinkedHashSet: maintains the insertion order

		Set<String> set1 = new HashSet<>();

		set1.add("Siddu");
		set1.add("Ram");
		set1.add("Rakesh");
		set1.add("Rahul");
		set1.add("Siddu");
		set1.add("Vinayak");
		set1.add(null);

		System.out.println("Elements of a HashSet: " + set1);

		System.out.println("Size of a HashSet: " + set1.size());

		Iterator<String> ite = set1.iterator();

		while (ite.hasNext()) {
			System.out.println("HashSet Element: " + ite.next());
		}

		// 1. LinkedHashSet maintains insertion order

		Set<String> set2 = new LinkedHashSet<>();

		set2.add("Albert");
		set2.add("Bob");
		set2.add("Carolin");
		set2.add("Vinod");
		set2.add("Albert");
		set2.add("Zack");
		set2.add(null);
		set2.add(null);
		set2.add(null);

		for (String s : set2) {
			System.out.println("LinkedHashSet Element: " + s);
		}

		System.out.println("LinkedHashSet Size: " + set2.size());

		// TreeSet features
		// 1. order the elements in the increasing order
		// 2. cannot contain any null elements

		Set<String> set3 = new TreeSet<String>();
		set3.add("Ravi");
		set3.add("Vijay");
		set3.add("Ravi");
		set3.add("Ajay");

		System.out.println("Elements of a TreeSet: " + set3);

		Set<Integer> set4 = new TreeSet<Integer>();
		set4.add(100);
		set4.add(87);
		set4.add(1);
		set4.add(87);
		set4.add(2);
		set4.add(5);
		// set4.add(null);

		System.out.println("Elements of a TreeSet: " + set4);

	}

}
