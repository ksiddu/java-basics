package com.siddu.java.collections;

import java.util.Arrays;

public class BubbleSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 3, 4, 2, 1, 6 };
		int length = array.length;

		System.out.println("before sort oneDArray elements :" + Arrays.toString(array));

		for (int i = 0; i < (length - 1); i++) {

			for (int j = 0; j < (length - i - 1); j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

			}

		}
		// use Arrays.toString() to print one - dimensional array
		System.out.println("after sort oneDArray elements :" + Arrays.toString(array));

		// converting string into array of integers
		String formattedString = Arrays.toString(array);

		String newString = formattedString.substring(1, formattedString.length() - 1);
		System.out.println("newString :" + newString);
		String[] arrayString = newString.split(", ");
		int newIntArray[] = new int[arrayString.length];
		int index = 0;
		for (String s : arrayString) {
			System.out.println("arrayString :" + s);
			newIntArray[index++] = Integer.valueOf(s);
		}

		System.out.println("newIntArray oneDArray elements :" + Arrays.toString(newIntArray));

	}

}
