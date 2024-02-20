package com.siddu.arrays;

import java.util.Arrays;

public class Array1DCopyMethodThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 2, 3, 4, 5 };

		int length = array.length;

		// Arrays.copyOfRange method
		int[] destArray = Arrays.copyOfRange(array, 0, length);

		System.out.println(Arrays.toString(destArray));

	}

}
