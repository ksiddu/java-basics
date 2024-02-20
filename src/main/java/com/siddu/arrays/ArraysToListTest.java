package com.siddu.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysToListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// https://www.java67.com/2014/03/how-to-print-array-in-java-example-tutorial.html

		Integer[] array = { 1, 3, 9, 8, 7 };

		System.out.println("Integer array elements : " + Arrays.toString(array));

		List<Integer> list = Arrays.asList(array);

		System.out.println("List array elements : " + list);

		// In Java 8, you can use streams:
		int[] numbers1 = new int[] { 1, 2, 3 };
		List<Integer> list1 = Arrays.stream(numbers1).boxed().collect(Collectors.toList());

		System.out.println("list1 array elements : " + list1);

		Integer[] numbers2 = { 1, 3, 9, 8, 7 };
		List<Integer> list2 = Arrays.stream(numbers2).collect(Collectors.toList());

		System.out.println("list2 array elements : " + list2);

		Integer[] numbers3 = { 1, 3, 9, 8, 7 };
		ArrayList<Integer> list3 = Arrays.stream(numbers2).collect(Collectors.toCollection(ArrayList::new));

		System.out.println("ArrayList list3 array elements : " + list3);

		Integer[] numbers4 = { 1, 3, 9, 8, 7 };
		LinkedList<Integer> list4 = Arrays.stream(numbers2).collect(Collectors.toCollection(LinkedList::new));

		System.out.println("LinkedList list4 array elements : " + list3);

	}

}
