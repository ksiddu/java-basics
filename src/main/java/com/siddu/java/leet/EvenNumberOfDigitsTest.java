package com.siddu.java.leet;

import java.util.Arrays;

public class EvenNumberOfDigitsTest {

	public static boolean isEvenNumberOfDigits(String strNumber) {
		if (strNumber.length() % 2 == 0) {
			return true;
		}
		return false;
	}

	public static int findNumbers(int[] nums) {
		int count = 0;
		for (int number : nums) {
			if (isEvenNumberOfDigits(String.valueOf(number))) {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = { 12, 345, 2, 6, 7896 };
		// int[] array = { 1, 1, 2};
		int[] array2 = { 555, 901, 482, 1771 };

		System.out.println("Number Of Even Digits " + findNumbers(array1));
		System.out.println("Number Of Even Digits " + findNumbers(array2));

	}

}
