package com.mm.corejava.arraylist;

import java.util.HashMap;import java.util.concurrent.Future;

import com.mm.model.Fruits;

public class Test {
	public static void main(String[] args) {
		HashMap<Fruits, String> hashMap = new HashMap<>();
		hashMap.put(new Fruits("Hello"), "Friends");
		System.out.println(hashMap.get(new Fruits("Hello")));
	}

}
