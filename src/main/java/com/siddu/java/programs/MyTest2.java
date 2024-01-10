package com.siddu.java.programs;

import java.util.HashMap;
import java.util.Map;

public class MyTest2 {

	public static int solution(String S) {
		// write your code in Java SE 8
		int ONE_HOUR_IN_SECONDS = 3600;
		int ONE_MIN_IN_SECONDS = 60;
		int costPerMin = 150;
		int costPerSecond = 3;
		String array1[] = S.split("\n");
		Map<String, Integer> hm = new HashMap<>();
		Map<String, Integer> hm2 = new HashMap<>();
		for (String s : array1) {
			String array2[] = s.split(",");

			String duration = array2[0];
			String number = array2[1];
			String time[] = duration.split(":");
			int hr = Integer.parseInt(time[0]);
			int min = Integer.parseInt(time[1]);
			int sec = Integer.parseInt(time[2]);

			if (!hm.containsKey(number)) {

				int totalSeconds = hr * ONE_HOUR_IN_SECONDS + min * ONE_MIN_IN_SECONDS + sec;
				hm.put(number, totalSeconds);
			} else {

				int totalSeconds = hr * ONE_HOUR_IN_SECONDS + min * ONE_MIN_IN_SECONDS + sec;
				hm.put(number, hm.get(number) + totalSeconds);
			}

		}

		int smaller = 0;
		String user = null;
		for (String k : hm.keySet()) {
			int cost;
			int inMinutes;
			int inSeconds;
			String phoneNumber = k;
			int valueInSeconds = hm.get(k);
			smaller = valueInSeconds;
			user = phoneNumber;

			inMinutes = valueInSeconds / 60;
			inSeconds = valueInSeconds % 60;
			if (inMinutes >= 5) {
				if (inSeconds > 0) {
					cost = (inMinutes + 1) * costPerMin;
				} else {
					cost = inMinutes * costPerMin;
				}
			} else {
				cost = valueInSeconds * costPerSecond;
			}

			hm2.put(phoneNumber, cost);
			if (valueInSeconds < smaller) {
				smaller = valueInSeconds;
				user = phoneNumber;

			}

		}

		return hm2.get(user);
	}

	public static void main(String[] args) {

		String INPUT = "00:00:01,400-234-090\n" + "00:00:01,701-080-080\n" + "01:05:00,600-234-090";
		System.out.println(MyTest2.solution(INPUT));

	}
}
