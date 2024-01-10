package com.siddu.java.self;

import java.util.Arrays;

public class SelfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Bubble sort
		int[] array = { 10, 20, 5, 4, 3 };

		System.out.println("Initial Array : " + Arrays.toString(array));

		int length = array.length;
		for (int i = 0; i < length - 1; i++) {

			for (int j = 0; j < (length - i - 1); j++) {

				if (array[j] > array[j + 1]) { // swap both elements
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		System.out.println("Sorted Array : " + Arrays.toString(array));

		// Factorial
		int n = 5;
		int fact = 1;

		for (int i = n; i >= 1; i--) {
			fact = fact * i;
		}

		System.out.println("Factorial Result : " + fact);

		// Prime
		int num = 4;
		boolean flag = true;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
			}
		}

		if (flag) {
			System.out.println("prime number");
		} else
			System.out.println("Not a prime number");

		// reverse a number

		int number = 690;
		int rev = 0;

		System.out.println("Original number : " + number);
		while (number != 0) {
			rev = (rev * 10) + (number % 10);
			number = number / 10;
		}

		System.out.println("Reverse number : " + rev);

		// palindrome

		String str = "ILKAL"; // GADAG, ILKAL
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {

			reverse = reverse + str.charAt(i);
		}

		if (str.contentEquals(reverse)) {
			System.out.println("Palindrome");
		}

		else {
			System.out.println("Not a Palindrome");
		}

		// Two pointer approach
		int start = 0;
		int end = str.length() - 1;
		boolean palFlag = true;
		while (start <= end) {

			if (str.charAt(start) != str.charAt(end))
				palFlag = false;

			start++;
			end--;
		}

		if (palFlag) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

		// to remove duplicate characters in a string

		String myString = "Siddu";
		String result = "";
		for (int i = 0; i < myString.length(); i++) {

			if (!result.contains(String.valueOf(myString.charAt(i)))) {
				result = result + myString.charAt(i);
			}
		}

		System.out.println("Final String after duplicate removal : " + result);
	}

}
