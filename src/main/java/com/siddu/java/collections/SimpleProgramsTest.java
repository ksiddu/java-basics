package com.siddu.java.collections;

public class SimpleProgramsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 5;
		int fact = 1;

		// factorial logic
		for (int i = 1; i <= number; i++) {
			fact = fact * i;

		}

		System.out.println("Factorial :" + fact);

		// prime number logic
		int n = 10;
		boolean flag = true;

		for (int i = 2; i <= n / 2; i++) {
			if (n % 2 == 0) {
				flag = false;
			}

		}

		if (flag) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a  prime number");
		}
	}

}
