package com.siddu.java.leet;

public class ThirdLargestElementTest {

	// https://www.geeksforgeeks.org/third-largest-element-array-distinct-elements/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 14, 2, 16, 10, 20 };
		int length = arr.length;

		// find first largest element
		int first = arr[0];
		for (int i = 1; i < length; i++) {

			if (arr[i] > first) {
				first = arr[i];
			}
		}

		int second = Integer.MIN_VALUE;
		for (int i = 0; i < length; i++) {

			if (arr[i] > second && arr[i] < first) {
				second = arr[i];
			}
		}

		int third = Integer.MIN_VALUE;
		for (int i = 0; i < length; i++) {

			if (arr[i] > third && arr[i] < second) {
				third = arr[i];
			}
		}

		System.out.println("third largest element: " + third);

	}

}
/*

Input: arr[] = {1, 14, 2, 16, 10, 20}
Output: The third Largest element is 14

*/
