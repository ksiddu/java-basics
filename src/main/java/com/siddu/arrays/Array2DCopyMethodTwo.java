package com.siddu.arrays;

import java.util.Arrays;

public class Array2DCopyMethodTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] source = { { 1, 2, 3, 4 }, { 5, 6 }, { 0, 2, 42, -4, 5 } };

		int[][] destination = new int[source.length][];

		System.out.println(destination.length);

		for (int i = 0; i < destination.length; ++i) {

			destination[i] = new int[source[i].length];

			System.arraycopy(source[i], 0, destination[i], 0, destination[i].length);

		}

		System.out.println(Arrays.deepToString(destination));

	}

}
