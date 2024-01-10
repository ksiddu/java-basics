package com.siddu.java.collections;

import java.util.Arrays;
import java.util.List;

public class ArraysToListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// https://www.java67.com/2014/03/how-to-print-array-in-java-example-tutorial.html

		Integer[] array = { 1, 3, 9, 8, 7 };

		System.out.println("Integer array elements : " + Arrays.toString(array));

		List<Integer> list = Arrays.asList(array);

		System.out.println("List array elements : " + list);

	}

}
