package com.mm.corejava.arraylist;

//One of the main challenge of sharing ArrayList between multiple thread is how to deal with situation where one thread is trying to access the element which is removed by other. If you are using methods like get(index) or remove(index) method to retrieve or remove element than it's also possible that other thread may also be removing other elements, which means you cannot call get(index) or remove(index) reliably without checking the size of the list first and then you also needs to provide extra synchronization between your call to size() and remove(int index).


import java.util.*;

public class SynchronizedArrayListDemo {
	public static void main(String[] args) {
		// An ArrayList which is not synchronize 
		List<String> listOfSymbols = new ArrayList<String>(); 
		listOfSymbols.add("RELIANCE"); 
		listOfSymbols.add("TATA"); 
		listOfSymbols.add("TECHMAH"); 
		listOfSymbols.add("HDFC"); 
		listOfSymbols.add("ICICI");
		
		System.out.println(listOfSymbols.size());
		
		listOfSymbols = Collections.synchronizedList(listOfSymbols);
		
		synchronized (listOfSymbols) {
			for(String s: listOfSymbols ) {
				System.out.println(s);
			}
		}
	}
}
