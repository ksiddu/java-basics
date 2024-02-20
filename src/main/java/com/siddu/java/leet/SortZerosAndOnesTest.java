package com.siddu.java.leet;

import java.util.Arrays;

public class SortZerosAndOnesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 0, 1, 2, 0, 1, 2, 0, 1, 2, 0 };

		int zeroCounter = 0;
		int oneCounter = 0;

		for (int i : array) {
			if (i == 0) {
				zeroCounter++;
			} else if (i == 1) {
				oneCounter++;
			}

		}

		int twoCounter = array.length - (zeroCounter + oneCounter);

		for (int i = 0; i < zeroCounter; i++) {

			array[i] = 0;

		}

		int j = zeroCounter;
		int k = 1;
		while (k <= oneCounter) {

			array[j] = 1;
			j++;
			k++;
		}

		for (int l = j; l < array.length; l++) {

			array[l] = 2;

		}

		System.out.println("After sort : " + Arrays.toString(array));

	}
}
