package com.siddu.java.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. can contain key-value pair as elements
		// 2. HashMap class does not maintain insertion order
		// 3. cannot be accessed using index(for loop)
		// 4. dynamic array, size increases automatically
		// 5. non-synchronized (not thread safe)
		// 6. LinkedHashMap class maintains insertion order
		// 7. TreeMap maintains element ordering in increasing

		Map<String, Integer> map1 = new HashMap<String, Integer>();

		map1.put("Siddu", 10);
		map1.put("Ravi", 20);
		map1.put("Raj", 30);

		System.out.println("using HashMap class");
		System.out.println("Size of a map1: " + map1.size());
		System.out.println("Elements of a map1: " + map1);

		map1.put("Rakesh", 100);
		map1.put("Rana", 90);

		System.out.println("Size of a map1: " + map1.size());
		System.out.println("Elements of a map1: " + map1);

		Map<String, Integer> map2 = new LinkedHashMap<String, Integer>();

		map2.put("Siddu", 10);
		map2.put("Ravi", 20);
		map2.put("Raj", 30);

		System.out.println("using LinkedHashMap class");
		System.out.println("Size of a map2: " + map2.size());
		System.out.println("Elements of a map2: " + map2);

		map2.put("Rakesh", 100);
		map2.put("Rana", 90);

		System.out.println("Size of a map2: " + map2.size());
		System.out.println("Elements of a map2: " + map2);

		Map<String, Integer> map3 = new TreeMap<String, Integer>();

		map3.put("Siddu", 10);
		map3.put("Ravi", 20);
		map3.put("Raj", 30);

		System.out.println("using TreeMap class");
		System.out.println("Size of a map3: " + map3.size());
		System.out.println("Elements of a map3: " + map3);

		map3.put("Rakesh", 100);
		map3.put("Rana", 90);

		System.out.println("Size of a map3: " + map3.size());
		System.out.println("Elements of a map3: " + map3);

		Map<Integer, String> map4 = new HashMap<Integer, String>();

		map4.put(1, "Selenium");
		map4.put(2, "Appium");
		map4.put(3, "RestAssured");

		System.out.println("using HashMap class");
		System.out.println("Size of a map: " + map4.size());
		System.out.println("Elements of a map: " + map4);

		map4.put(4, "Python");
		map4.put(5, "JavaScript");

		System.out.println("Size of a map: " + map4.size());
		System.out.println("Elements of a map: " + map4);

		//entrySet()
		System.out.println("using Map.Entry class & for each loop");
		for (Map.Entry<Integer, String> e : map4.entrySet()) {
			System.out.println("Map Key: " + e.getKey());
			System.out.println("Map Value: " + e.getValue());

		}
		
		//keySet()
		Set<Integer> set = map4.keySet();
		System.out.println("keyset Value: " + set);
		
		//values()
		String[] values = map4.values().toArray(new String[map4.size()]);
		System.out.println("values Value: ");
		for(String str: values)
		System.out.println(str);
		
		//values() to List
		List<String> mapValuesList = new ArrayList<>(map4.values());
		System.out.println("mapValuesList : "+ mapValuesList);
		
		System.out.println("using forEach lambda expression");
		map4.forEach((k,v)->{
			System.out.println("KEY : "+ k);
			System.out.println("VALUE : "+ v);
		});
	}

}
