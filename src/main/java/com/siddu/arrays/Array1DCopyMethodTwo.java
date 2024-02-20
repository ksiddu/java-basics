package com.siddu.arrays;

import java.util.Arrays;

public class Array1DCopyMethodTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 2, 3, 4, 5 };

		int length = array.length;

		int[] destArray = new int[length];

		// System.arraycopy method
		System.arraycopy(array, 0, destArray, 0, length);

		System.out.println(Arrays.toString(destArray));

	}

}
