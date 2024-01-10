package com.siddu.java.leet;

public class ReverseAStringRecursion {

	// using the recursion
	public static String recursion(String str) {
		// str = "India";
		if (str.isEmpty()) {
			return str;
		}
		return recursion(str.substring(1)) + str.charAt(0);
	}

	// using the StringBuilder reverse()
	public static String stringBuilder(String str) {
		StringBuilder strBuilder = new StringBuilder(str);
		strBuilder.reverse();
		return strBuilder.toString();

	}

	// use string builder to append char by char
	// using string append creates so many instances on each iteration

	public static String bruteForce(String str) {
		StringBuilder builder = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			builder.append(str.charAt(i));

		}
		return builder.toString();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Apple";
		String reverse1 = recursion(str1);
		System.out.println("Reversed string: " + reverse1);

		String str2 = "Banana";
		String reverse2 = stringBuilder(str2);
		System.out.println("Reversed string: " + reverse2);

		String str3 = "Orange";
		String reverse3 = bruteForce(str3);
		System.out.println("Reversed string: " + reverse3);
	}

}
