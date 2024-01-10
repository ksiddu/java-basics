package com.siddu.java.self;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LogicsTest {

	public void isPrime(int n) {
		System.out.println("***********************************************");
		boolean flag = true;
		// prime numbers : 1, 2, 3, 5, 7, 11 (a number divisible by 1 and itself)
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = false;
			}
		}

		if (flag)
			System.out.println(n + " is a prime number");
		else
			System.out.println(n + " is a not prime number");
		System.out.println("***********************************************");
	}

	public void reverseANumber(int n) {
		System.out.println("***********************************************");
		// n = 123;
		int num = n;
		int reverse = 0;

		while (num != 0) {
			reverse = (reverse * 10) + (num % 10);
			num = num / 10;

		}

		System.out.println("Original number is " + n);
		System.out.println("Reverse number is " + reverse);
		System.out.println("***********************************************");

	}

	public void isPalindrome(String str) {

		System.out.println("***********************************************");
		char[] charArray = str.toCharArray();
		char[] revCharArray = new char[str.length()];
		int length = str.length();
		for (int i = 0, j = (length - 1); i < length && j >= 0; i++, j--) {
			revCharArray[i] = charArray[j];
		}

		String originalString = new String(charArray);
		String reversedString = new String(revCharArray);

		System.out.println("originalString is " + originalString);
		System.out.println("reversedString  is " + reversedString);
		if (originalString.contentEquals(reversedString)) {
			System.out.println(originalString + " is a palindrome");
		} else
			System.out.println(originalString + " is not a palindrome");

		System.out.println("***********************************************");

	}

	// using the collection concepts
	public void duplicateCharactersInAnString(String str) {

		System.out.println("***********************************************");
		System.out.println("Given string is : " + str);

		char[] strArray = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();

		for (char c : strArray) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			}
			map.put(c, map.get(c) + 1);

		}
		Set<Character> set = map.keySet();
		List<Integer> list = new ArrayList<>(map.values());

		for (Character c : set) {

			if (map.get(c) >= 2) {
				System.out.println(c + " is a duplicate character");
			}
		}

		System.out.println("***********************************************");

	}

	// Program: Write a program to find top two maximum numbers in a array.

	public void firstTwoHighest(int[] arr) {

		int numOne = 0;
		int numTwo = 0;

		for (int i : arr) {
			if (numOne < i) {
				numTwo = numOne;
				numOne = i;
			} else if (numTwo < i) {
				numTwo = i;
			}
		}

	}

	public static String removeDuplicateChars(String str) {

		char[] charArray = str.toCharArray();
		String result = "";
		
		for(int i = 0; i < charArray.length; i++) {
			if(!result.contains(String.valueOf(charArray[i]))) {
				result = result + String.valueOf(charArray[i]);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LogicsTest t1 = new LogicsTest();

		// prime number test
		t1.isPrime(5);

		t1.isPrime(4);

		t1.isPrime(7);

		t1.isPrime(10);

		// factorial number test
		// t1.factorial(5);

		// reverse number test
		t1.reverseANumber(123);

		t1.reverseANumber(674);

		// palindrome test
		t1.isPalindrome("GADAG");

		// palindrome test
		t1.isPalindrome("Shopee");

		// duplicate character in an string test
		String str1 = "Airline";
		t1.duplicateCharactersInAnString(str1);

		String str2 = "Parameter";
		t1.duplicateCharactersInAnString(str2);
	}

}
