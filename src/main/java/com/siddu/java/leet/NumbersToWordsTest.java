package com.siddu.java.leet;

public class NumbersToWordsTest {

	
	public static void convert_to_words(char[] num) {

		int len = num.length;

		if (len == 0) {
			System.out.println("empty string");
			return;
		}

		if (len > 4) {
			System.out.println("length more than 4 digits, not supported");
			return;
		}

		String[] single_digits = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
				"nine" };

		String[] two_digits = new String[] { "", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
				"sixteen", "seventeen", "eighteen", "nineteen" };

		String[] tens_multiple = new String[] { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
				"eighty", "ninety" };

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
