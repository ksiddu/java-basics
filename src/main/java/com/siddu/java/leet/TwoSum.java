package com.siddu.java.leet;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 4, 7, 8, 3 };
		int sum = 7;
		Map<Integer, Integer> numMap = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			int delta = sum - arr[i];
			if (numMap.containsKey(delta)) {
				System.out.println("[ " + numMap.get(delta) + "," + i + "]");
			}
			numMap.put(arr[i], i);
		}

	}

}
