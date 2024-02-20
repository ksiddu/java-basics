package com.siddu.java.self;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class SelfJanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// reverse a number
		int number = 123;
		int rev = 0;
		int n = number;

		while (number > 0) {
			rev = rev * 10 + number % 10;
			number = number / 10;
		}
		System.out.println("Original number: " + n);
		System.out.println("Reversed number: " + rev);

		// reverse a string
		String str = "Siddu";

		StringBuilder sb = new StringBuilder(str);
		String reversedString = sb.reverse().toString();

		System.out.println("Original string: " + str);
		System.out.println("Reversed string: " + reversedString);

		StringBuilder sb1 = new StringBuilder();
		for (int i = sb.length() - 1; i >= 0; i--) {
			sb1.append(str.charAt(i));
		}

		String reversedString1 = sb1.toString();

		System.out.println("Original string: " + str);
		System.out.println("Reversed string: " + reversedString1);

		String myString = "Singapore";
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		myString = myString.toLowerCase();
		for (Character ch : myString.toCharArray()) {

			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}

		}
		map.forEach((k, v) -> {
			System.out.println(k + ": " + v);
		});

		int[] array = { 10, 5, 3, 2, 90 };
		int length = array.length;
		for (int i = 0; i < length - 1; i++) {

			for (int j = 0; j < (length - i - 1); j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}

		}

		System.out.println("Sorted Array: " + Arrays.toString(array));

		String str2 = "Gavi";
		String reversedString2 = rev(str2);
		System.out.println("Original string str2: " + str2);
		System.out.println("Reversed string reversedString2: " + reversedString2);

		System.out.println("biggestOfThree : " + biggestOfThree(1, 2, 3));

	}

	public static String rev(String str) {

		if (str.isEmpty() || str == null || str.length() == 1) {
			return str;
		}

		else {
			return rev(str.substring(1)) + str.charAt(0);
		}

	}

	public static int biggestOfThree(int n1, int n2, int n3) {

		if (n1 > n2 && n1 > n3) {
			return n1;
		}

		else if (n2 > n1 && n2 > n3) {
			return n2;
		}

		return n3;

	}

}
