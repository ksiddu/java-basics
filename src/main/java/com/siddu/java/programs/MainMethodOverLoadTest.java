package com.siddu.java.programs;

public class MainMethodOverLoadTest {

	// we can overload the main method
	// JVM will call this method to start
	// some code
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hi Geek (from main)");
		MainMethodOverLoadTest.main("Geek");

	}

	// Overloaded main methods
	public static void main(String arg1) {
		System.out.println("Hi, " + arg1);
		MainMethodOverLoadTest.main("Dear Geek", "My Geek");
	}

	public static void main(String arg1, String arg2) {
		System.out.println("Hi, " + arg1 + ", " + arg2);
	}

}
