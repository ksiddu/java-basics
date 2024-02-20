package com.siddu.java.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Characteristics:
		// 1. can contain max. one null key element
		// 2. cannot contains the duplicate key element
		// 3. not maintains the insertion order
		// 4. cannot random access using the index of the elements
		// 5. If two null key, then latest will be taken as overwritten
		// 6. non-synchronized (not thread safe)
		// 7. HashMap, LinkedHashMap, SortedMap(TreeMap)
		// 8. LinkedHashMap: maintains the insertion order

		Map<String, Integer> map = new HashMap<>();
		map.put("Siddu", 1);
		map.put("Ravi", 2);
		map.put("Raju", 3);
		map.put("Tom", 4);
		map.put("Andy", 5);
		map.put("null", 5);
		map.put("null", 7); // if t

		// 1. through Map.Entry with map.entrySet()
		System.out.println("Map Elements: " + map);

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Map Key: " + entry.getKey());
			System.out.println("Map Value: " + entry.getValue());
		}

		// 1. LinkedHashMap maintains insertion order

		Map<Integer, String> map2 = new LinkedHashMap<>();
		map2.put(1, "Siddu");
		map2.put(3, "Raju");
		map2.put(4, "Tom");
		map2.put(2, "Ravi");
		map2.put(null, "null");
		map2.put(5, "Ram");

		// 1. through Map.Entry with map.entrySet()
		System.out.println("LinkedHashMap Elements: " + map2);

		for (Map.Entry<Integer, String> entry : map2.entrySet()) {
			System.out.println("Map Key: " + entry.getKey());
			System.out.println("Map Value: " + entry.getValue());
		}

		// TreeMap features
		// 1. order the elements in the increasing order
		// 2. cannot contain any null key elements

		Map<Integer, String> map3 = new TreeMap<>();
		map3.put(1, "Siddu");
		map3.put(3, "Raju");
		map3.put(4, "Tom");
		map3.put(2, "Ravi");
		map3.put(5, "Ram");
		// map3.put(null, "null");

		// 1. through Map.Entry with map.entrySet()
		System.out.println("TreeMap Elements: " + map3);

		for (Map.Entry<Integer, String> entry : map3.entrySet()) {
			System.out.println("Map Key: " + entry.getKey());
			System.out.println("Map Value: " + entry.getValue());
		}

	}

}
