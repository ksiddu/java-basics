package com.siddu.java.programs;

public class BubbleSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// https://www.geeksforgeeks.org/bubble-sort/

		int[] array = { 5, 2, 7, 1, 9 };
		int length = array.length;

		for (int i = 0; i < (length - 1); i++) {

			for (int j = 0; j < (length - i - 1); j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}

		}

		System.out.println("Sorted array");
		for (int k = 0; k < length; k++) {
			System.out.println(array[k]);
		}

	}

}
