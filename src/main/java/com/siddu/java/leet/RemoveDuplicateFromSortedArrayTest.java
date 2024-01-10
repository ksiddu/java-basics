package com.siddu.java.leet;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArrayTest {

	public static int getLength(int[] array) {

		int j = 0;
		int i = 1;

		while (i < array.length) {
			if (array[i] != array[j]) {
				j++;
				array[j] = array[i];
			}
			i++;
		}
		return j + 1;

	}
	
	public static int[] getNewArray(int[] array) {
		return Arrays.copyOfRange(array, 0, getLength(array));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 2, 3, 3, 4, 5 };
		//int[] array = { 1, 1, 2};

		System.out.println("Array Before delete: " + Arrays.toString(array));
		int returnLength = getLength(array);
		System.out.println("length after delete: " + returnLength);
		System.out.println("Array after delete: " + Arrays.toString(array));
		System.out.println("Array after delete new array: " + Arrays.toString(getNewArray(array)));

	}

}
