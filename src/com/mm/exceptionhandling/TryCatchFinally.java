package com.mm.exceptionhandling;

public class TryCatchFinally {
	public static void main(String[] args) {
		try {
			System.out.println("Try..");
			System.exit(0);
			
		} catch (Exception e) {
			System.out.println("Catch..");
			e.printStackTrace();
		} finally {
			System.out.println("Finally..");
		}
	}

}
