package com.siddu.arrays;

import java.util.Arrays;

public class Array1DCopyMethodOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// An iterative or brute force approach
		int[] array = { 1, 2, 3, 4, 5 };

		int length = array.length;

		int[] destArray = new int[length];

		// loop constructs
		for (int i = 0; i < length; i++) {
			destArray[i] = array[i];
		}

		System.out.println(Arrays.toString(destArray));

	}

}
