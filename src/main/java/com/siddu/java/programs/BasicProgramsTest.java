package com.siddu.java.programs;

import java.util.*;

public class BasicProgramsTest {

	// Program: Write a program to reverse a number
	public int reverseANumber(int number) {
		int rev = 0;
		int n = number;
		while (n != 0) {
			rev = (rev * 10) + (n % 10);
			n = (n / 10);
		}

		return rev;

	}

	// Program: Write a program to convert decimal number to binary format
	public void printBinaryFormat(int number) {
		int binary[] = new int[25];
		int index = 0;
		while (number > 0) {
			binary[index++] = number % 2;
			number = number / 2;
		}

		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
	}

	// Program: Write a program to find out duplicate characters in a string.
	public void findDuplicateChars(String str) {
		Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
		char[] chrs = str.toCharArray();
		for (Character ch : chrs) {
			if (dupMap.containsKey(ch)) {
				dupMap.put(ch, dupMap.get(ch) + 1);
			} else {
				dupMap.put(ch, 1);
			}
		}
		Set<Character> keys = dupMap.keySet();
		System.out.println("Duplicate chars in a string " + str + " are :");
		for (Character ch : keys) {
			if (dupMap.get(ch) > 1) {
				System.out.println(ch + "--->" + dupMap.get(ch));
			}
		}
	}

	// Program: Write a program to find top two maximum numbers in a array.
	public void printTwoMaxNumbers(int[] nums) {
		int numOne = 0;
		int numTwo = 0;

		for (int i : nums) {
			if (numOne < i) {
				numTwo = numOne;
				numOne = i;
			} else if (numTwo < i) {
				numTwo = i;
			}
		}
		System.out.println("Given array :");
		for (int i : nums)
			System.out.println(i);
		System.out.println("First max number :" + numOne);
		System.out.println("Second max number :" + numTwo);
	}

	// Program: Write a program to find common elements between two arrays.
	public void printCommonElements(int arr1[], int arr2[]) {

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j])
					System.out.println(arr1[i]);
			}
		}
	}

	// Program: How to swap two numbers without using temporary variable
	public void swapNumbers(int x, int y) {

		System.out.println("Before Swap :");
		System.out.println("x value :" + x);
		System.out.println("y value :" + y);
		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("After Swap :");
		System.out.println("x value :" + x);
		System.out.println("y value :" + y);

	}

	// Program: Write a program to print fibonacci series
	public void fibonacci(int count) {
		int fib[] = new int[count];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i < count; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}

		System.out.println("Fibonacci series is :");
		for (int i : fib)
			System.out.println(i);

	}

	// Program: Write a program to find sum of each digit in the given number
	// using recursion

	public int getSum(int num) {
		int sum = 0;
		if (num == 0) {
			return sum;
		} else {
			sum += num % 10;
			num = num / 10;
			getSum(num);
		}
		return sum;
	}

	// Program: Write a program to check the given number is a prime number or
	// not

	public void checkPrime(int num) {
		boolean flag = true;
		for (int i = 2; i <= (num / 2); i++) {
			if (num % i == 0) {

				flag = false;
			}
		}
		if (flag) {
			System.out.println(num + " is a prime number");
		} else
			System.out.println(num + " is not a prime number");
	}

	// Program: Write a program to remove duplicate characters in a string using
	// set

	public String removeDuplicateCharacters1(String str) {
		String result = "";

		char charArray[] = str.toCharArray();
		Set<Character> set = new LinkedHashSet<Character>();
		for (char c : charArray) {
			set.add(c);

		}

		for (char c : set) {
			result = result + c;
		}
		return result;

	}

	// Program: Write a program to remove duplicate characters in an array
	// without using set
	public String removeDuplicateCharacters2(String str) {
		String result = "";

		char charArray[] = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (!result.contains(String.valueOf(charArray[i]))) {
				result = result + charArray[i];
			}
		}

		return result;

	}

	// Program: Write a program to find out sum of two digits in an array equal
	// to k

	public void printPair(int arr[]) {
		// arr = {3, 4, 1, 2, 5};
		int len = arr.length;

		for (int i = 0; i < len; i++) {

			if ((arr[i] + arr[i + 1]) == 7) {
				System.out.println("{ " + arr[i] + " ," + arr[i + 1] + " ,}");
			}
		}
	}

	public String reverseAString1(String str) {
		String rev = "";
		int len = str.length();
		for (int i = (len - 1); i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		return rev;
	}

	// without using str functions
	public String reverseAString2(String str) {
		String rev = "";
		char[] chArray = str.toCharArray();

		int len = str.length();
		for (int i = (len - 1); i >= 0; i--) {
			rev = rev + chArray[i];
		}
		return rev;
	}

	// using recursive function
	public String reverseAString3(String str) {
		// String rev;
		if (str.isEmpty()) {
			return "";
		}
		return reverseAString3(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicProgramsTest obj = new BasicProgramsTest();

		// reverse a number
		int reversedNumer = obj.reverseANumber(123);
		System.out.println("Reversed Number: " + reversedNumer);

		// decimal to binary
		System.out.println("printBinaryFormat");
		obj.printBinaryFormat(8);

		// duplicate chars in a string
		obj.findDuplicateChars("ILKAL");

		// first two max. numbers in an array
		int[] array = { 22, 1, 45, 5, 6 };
		obj.printTwoMaxNumbers(array);

		String rev1 = obj.reverseAString2("apple");
		System.out.println("Reversed String: " + rev1);
		
		String rev2 = obj.reverseAString3("Banana");
		System.out.println("Reversed String: " + rev2);
	}

}
