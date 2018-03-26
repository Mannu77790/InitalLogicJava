package com.mm.corejava.sorting;
import com.mm.model.*;
import java.util.*;
public class SortObjectComparable {
	public static void main(String[] args) {
		Fruits fruits2 = null;
		List<Fruits> fruits  =  new ArrayList<Fruits>();
		fruits2 = new Fruits();
		fruits2.setName("Mango");
		fruits2.setDescription("Good");
		fruits2.setQuantity(12);
		fruits.add(fruits2);
		
		fruits2 = new Fruits();
		fruits2.setName("Apple");
		fruits2.setDescription("Very Good");
		fruits2.setQuantity(6);
		fruits.add(fruits2);
		
		fruits2 = new Fruits();
		fruits2.setName("Grapes");
		fruits2.setDescription("Excellent");
		fruits2.setQuantity(9);
		fruits.add(fruits2);
		
		System.out.println("Before Sort");
		fruits.forEach(fruit -> {
			System.out.println(fruit);
		});
		
		Collections.sort(fruits);
		
		System.out.println("After Sort By Quantity");
		fruits.forEach(fruit -> {
			System.out.println(fruit);
		}); 
	}
	

}
