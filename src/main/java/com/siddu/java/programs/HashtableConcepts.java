package com.siddu.java.programs;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. can contain key-value pair as elements
		// 2. synchronized (thread safe)
		// 3. stores the value based on hashcode of the key
		// 4. does not contain any null key or null values

		Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();

		ht1.put(1, "Selenium");
		ht1.put(2, "Java");
		ht1.put(3, "Appium");

		System.out.println("using Hashtable class");
		System.out.println("Size of a Hashtable: " + ht1.size());
		System.out.println("Elements of a Hashtable1: " + ht1);
		System.out.println("HashCode: " + ht1.hashCode());

		// Enumeration enum = ht.elements();

		Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();

		ht2 = (Hashtable<Integer, String>) ht1.clone();

		System.out.println("Elements of a Hashtable2: " + ht2);
		System.out.println("HashCode: " + ht2.hashCode());
		ht1.clear();

		System.out.println("===================================");
		System.out.println("Elements of a Hashtable1: " + ht1);
		System.out.println("Elements of a Hashtable2: " + ht2);

		System.out.println("===================================");

		System.out.println("using enumeration iterator");
		Enumeration e = ht2.elements();

		while (e.hasMoreElements()) {

			System.out.println("Elements of a Hashtable2: " + e.nextElement());
		}

	}

}
