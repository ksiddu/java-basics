package com.siddu.java.self;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1D Array initialization

		int[] intArray1 = { 10, 20, 30, 40, 50 };

		int[] intArray2 = new int[5];
		intArray2[0] = 60;
		intArray2[1] = 70;
		intArray2[2] = 80;
		intArray2[3] = 90;
		intArray2[4] = 100;

		int[] intArray3 = { 500, 100, 300, 250, 200 };

		System.out.println("Array Elements are : " + Arrays.toString(intArray1));
		System.out.println("Array Elements are : " + Arrays.toString(intArray2));

		System.out.println("Accessing elements in different ways: for loop with index");
		for (int i = 0; i < intArray1.length; i++) {
			System.out.println(intArray1[i]);
		}

		System.out.println("Accessing elements in different ways: for each loop");
		for (int j : intArray2) {
			System.out.println(j);
		}

		// 2D Array initialization

		int[][] twoDArray = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

		System.out.println("No. of 1D Array: " + twoDArray.length);
		System.out.println("No. of 1D Array Elements: " + twoDArray[0].length);

		System.out.println("Array Elements are : " + Arrays.deepToString(twoDArray));

		Arrays.sort(intArray3);
		System.out.println("Sorted Array Elements are : " + Arrays.toString(intArray3));
	}

}
