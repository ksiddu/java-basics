package com.siddu.java.programs;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class MyTest3 {

	public static int solution3(String S) {
		String[] lines = S.split("\r?\n");
		Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> amountMap = new HashMap<>();
		for (String line : lines) {
			String[] hp = line.split(",");
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
			LocalTime dateTime = LocalTime.parse(hp[0], formatter);

			int amount = 0;
			if (dateTime.compareTo(LocalTime.of(00, 05, 00)) < 0) {
				int secs = (dateTime.getHour() * 60 * 60) + (dateTime.getMinute() * 60) + dateTime.getSecond();
				amount = secs * 3;
			} else {
				int mins = dateTime.getMinute();
				if (dateTime.getSecond() > 0) {
					mins = mins + 1;
				}
				mins += (dateTime.getHour() * 60);
				amount = mins * 150;
			}
			amountMap.put(hp[1], amount);
			int ll = (dateTime.getHour() * 60 * 60) + (dateTime.getMinute() * 60) + (dateTime.getSecond());
			if (map.containsKey(hp[1])) {
				ll += (dateTime.getSecond());
				ll += (dateTime.getMinute() * 60);
				ll += (dateTime.getHour() * 60 * 60);

			}
			map.put(hp[1], ll);
		}
		Integer largestTime = 0;
		String largestDurationUser = "";
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > largestTime) {
				largestDurationUser = entry.getKey();
				largestTime = entry.getValue();
			}
		}
		amountMap.remove(largestDurationUser);
		return amountMap.values().stream().mapToInt(i -> i).sum();
	}
}
