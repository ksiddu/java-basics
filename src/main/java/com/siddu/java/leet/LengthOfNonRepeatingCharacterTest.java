package com.siddu.java.leet;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class LengthOfNonRepeatingCharacterTest {

	// https://leetcode.com/problems/longest-substring-without-repeating-characters/solution/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "abcdeefghti";
		int n = S.length();
		int ans = 0;
		Map<Character, Integer> map = new LinkedHashMap<>();

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
		
		System.out.println("maxLength: " + maxLength("abccdeghiijklm"));

	}

	public static int maxLength(String s) {

		HashSet<Character> set = new HashSet<Character>();

		int left = 0;
		int maxLength = 0;

		for (int right = 0; right < s.length(); right++) {

			if (!set.contains(s.charAt(right))) {
				set.add(s.charAt(right));
				maxLength = Math.max(maxLength, right - left + 1);
			}

			else {
				while (s.charAt(left) != s.charAt(right)) {
					set.remove(s.charAt(left));
					left++;
				}
				set.remove(s.charAt(left));
				left++;
				set.add(s.charAt(right));
			}
		}
		return maxLength;

	}

}
