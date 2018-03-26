package com.mm.corejava.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class ArrayListReverse {
	private static final int REVERSE_THRESHOLD = 0;

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
		
		Collections.reverse(primes);
		
		System.out.println("list of prime numbers : " + primes); 
	}
	
	/*public static void reverse(List<?> list) {
		int size = list.size();
		if (size < REVERSE_THRESHOLD || list instanceof RandomAccess) {
			for (int i = 0, mid = size >> 1, j = size - 1; i < mid; i++, j--)
				swap(list, i, j);
		} else {
			ListIterator fwd = list.listIterator();
			ListIterator rev = list.listIterator(size);
			for (int i = 0, mid = list.size() >> 1; i < mid; i++) {
				Object tmp = fwd.next();
				fwd.set(rev.previous());
				rev.set(tmp);
			}
		}
	}*/


}
