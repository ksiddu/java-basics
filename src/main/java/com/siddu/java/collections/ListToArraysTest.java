package com.siddu.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list1 = new ArrayList<Integer>();

		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);

		// 1st method: using toArray(T[] a]

		Integer[] array1 = list1.toArray(Integer[]::new);
		System.out.println("array1 : " + Arrays.toString(array1));

		// 2nd method: using toArray(T[] a]

		List<Integer> list2 = new ArrayList<Integer>();

		list2.add(60);
		list2.add(70);
		list2.add(80);
		list2.add(90);
		list2.add(100);

		Integer[] array2 = list2.stream().toArray(Integer[]::new);
		System.out.println("array2 : " + Arrays.toString(array2));
	}

}
