package com.mm.corejava.sorting;

import java.util.Arrays;
import java.util.TreeSet;

public class SortStringArray extends Thread{
	static String a = "testify";
	static int b=10;
	
	static {
		b=50;
		System.out.println(b);
		System.out.println(a);
		synchronized (a) {
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		
		new SortStringArray().start();
	}
	
	
	
	public void run() {
	System.out.println("sdf");	
	}
	
	public void run(String a) {
		System.out.println("sdfsdfd");	
		}
}
