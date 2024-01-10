package com.siddu.java.leet;

public class FizzBuzzTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 16;

		for (int i = 1; i <= n; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print("fizzbuzz");
				System.out.print(",");
				continue;

			} else if (i % 3 == 0) {
				System.out.print("fizz");
			} else if (i % 5 == 0) {
				System.out.print("buzz");
			} else {
				System.out.print(i);
			}
			if(i==n) {
				break;
			}
			System.out.print(",");

		}

	}

}

/*
 * 
 * Write a program that outputs the string representation of numbers from 1 to
 * n, however:
 * 
 * If the number is divisible by 3, output "fizz". If the number is divisible by
 * 5, output "buzz". If the number is divisible by both 3 and 5, output
 * "fizzbuzz". For example, for n = 15, we output: 1, 2, fizz, 4, buzz, fizz, 7,
 * 8, fizz, buzz, 11, fizz, 13, 14, fizzbuzz
 */