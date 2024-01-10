package com.siddu.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// basic methods to work on all list classes
		// 1. add(object)
		// 2. addAll(collection/list)
		// 3. remove(index)
		// 4. remove(object)
		// 5. removeAll(collection/list)
		// 6. contains(object)
		// 7. containsAll(collection/list)
		// 8. retain(object)
		// 9. retainAll(collection/list)
		// 10. size()
		// 11. clear()
		// 12. isEmpty()

		// characteristics:
		// 1. ordered collection of elements. i.e., maintains insertion order
		// 2. contains duplicate elements
		// 3. random access using the index of the elements
		// 4. used dynamic array to store the elements
		// 5. manipulation is slow since shifting is required [whenever we delete or insert an element]
		// 6. non-synchronized (not thread safe)

		List<Integer> list1 = new ArrayList<>();

		// to add the elements

		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);

		List<Integer> list2 = new ArrayList<>();

		list2.add(30);
		list2.add(40);

		// to list out the elements
		System.out.println("List print: " + list1);

		// Iterating ways: for, for-each, iterator
		
		// for loop
		System.out.println("==================================");
		System.out.println("for loop traversing / iterating");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println("Element at index: " + i + "-->" + list1.get(i));
		}
		System.out.println("==================================");

		// for each
		System.out.println("==================================");
		System.out.println("for each loop traversing / iterating");
		for (int i : list1) {
			System.out.println("Element: " + i);
		}
		System.out.println("==================================");

		// iterator
		System.out.println("==================================");
		System.out.println("iterator traversing / iterating");
		Iterator<Integer> ite = list1.iterator();
		while (ite.hasNext()) {
			System.out.println("Element: " + ite.next());
		}

		System.out.println("==================================");

		// to remove the element with index
		list1.remove(0);

		// to list out the elements
		System.out.println("List print after remove with index: " + list1);

		// to remove the element with object/ element
		list1.remove(new Integer(20));
		// list1.remove(Integer.valueOf(20));
		System.out.println("List print after remove with element: " + list1);

		// to removeAll the element with another list
		list1.removeAll(list2);
		System.out.println("List print after removeAll: " + list1);

		boolean flag = list1.contains(new Integer(50));

		// contains
		System.out.println("contains result: " + flag);

		// list element sort using Collections utility class in java.util package
		List<Integer> list3 = new ArrayList<>();

		list3.add(100);
		list3.add(5);
		list3.add(90);
		list3.add(45);
		list3.add(64);
		System.out.println("================================");
		System.out.println("ArrayList elements before sort: " + list3);
		System.out.println("================================");

		Collections.sort(list3);
		System.out.println("================================");
		System.out.println("ArrayList elements after sort: " + list3);
		System.out.println("================================");
		
		Collections.sort(list3, Collections.reverseOrder());
		
		System.out.println("================================");
		System.out.println("ArrayList elements after descending sort: " + list3);
		System.out.println("================================");

	}

}
