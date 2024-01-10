package com.siddu.java.self;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// https://stackoverflow.com/questions/46898/how-do-i-efficiently-iterate-over-each-entry-in-a-java-map
public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");

		Set<Integer> set = map.keySet();

		System.out.println("Accessing elements in different ways: keySet");
		// Iterate over map elements: method 1 - keySet
		for (Integer key : set) {

			System.out.println(" key : " + key + "  value : " + map.get(key));

		}

		System.out.println("=================");

		System.out.println("Accessing elements in different ways: entrySet");
		// Iterate over map elements: method 2 - entrySet
		for (Map.Entry<Integer, String> entry : map.entrySet()) {

			System.out.println(" key : " + entry.getKey() + "  value : " + entry.getValue());

		}

		System.out.println("=================");

		System.out.println("Accessing elements in different ways: forEach lambda expression");
		// Iterate over map elements: method 3 - forEach lambda expression
		map.forEach((k, v) -> {
			System.out.println(" key : " + k + "  value : " + v);
		});

		System.out.println("=================");

		System.out.println("Accessing elements in different ways: forEach with stream api");
		// Iterate over map elements: method 4 - forEach with stream api
		map.entrySet().stream().forEach(entry -> {
			System.out.println(" key : " + entry.getValue() + "  value : " + entry.getValue());
		});

	}

}
