package com.siddu.java.programs;

public class FactorialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 6;
		int fact = 1;
		for(int i = n; i>=1 ; i--) {
			fact = fact*i;
		}
		System.out.println("Fact: "+ fact);

	}

}
