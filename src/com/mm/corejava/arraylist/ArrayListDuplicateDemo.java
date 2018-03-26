package com.mm.corejava.arraylist;

import java.util.*;

public class ArrayListDuplicateDemo {
	public static void main(String[] args) {
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(2); 
		primes.add(3); 
		primes.add(5); 
		primes.add(7); 
		//duplicate 
		primes.add(7); 
		primes.add(11); // let's print arraylist with duplicate 
		System.out.println("list of prime numbers : " + primes); 
		
		// Now let's remove duplicate element without affecting order 
		// LinkedHashSet will guaranteed the order and since it's set
		// it will not allow us to insert duplicates.
		// repeated elements will automatically filtered.

		Set<Integer> integers = new LinkedHashSet<Integer>(primes);
		
		System.out.println(integers);
		// now let's clear the ArrayList so that we can copy all elements from LinkedHashSet 
		
		System.out.println("list of prime numbers : " + primes); 
		primes.clear();
		System.out.println("list of prime numbers : " + primes); 
		
		// copying elements but without any duplicates 
		primes.addAll(integers); 
		System.out.println("list of primes without duplicates : " + primes);


	}
	

}
