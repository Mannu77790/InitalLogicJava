package com.mm.corejava.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Grapes");
		System.out.println("Before Sort");
		fruits.forEach(fruit -> {
			System.out.println(fruit);
		});
		Collections.sort(fruits);
		System.out.println("After Sort");
		fruits.forEach(fruit -> {
			System.out.println(fruit);
		});
	}

}
