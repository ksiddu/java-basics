package com.siddu.java.leet;

import java.util.HashMap;
import java.util.Map;

public class LengthOfNonRepeatingCharacterTest {

	// https://leetcode.com/problems/longest-substring-without-repeating-characters/solution/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "abcdeefghti";
		int n = S.length();
		int ans = 0;
		Map<Character, Integer> map = new HashMap<>();

		for (int j = 0, i = 0; j < n; j++) {
			if (map.containsKey(S.charAt(j))) {
				i = Math.max(map.get(S.charAt(j)), i);
			}
			ans = Math.max(ans, j - i + 1);
			map.put(S.charAt(j), j + 1);
			System.out.println("i: " + i);
			System.out.println("j: " + j);
		}

		System.out.println("ans: " + ans);
		System.out.println("map: " + map);
		

	}

}
