package com.mm.synchronize;

public class SynchronizeTest {
	public synchronized void method1() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Method 1");
	}
	public synchronized void method2() {
		System.out.println("Method 2");
	}
	public static void main(String[] args) {
		SynchronizeTest synchronizeTest = new SynchronizeTest();
		synchronizeTest.method1();
		synchronizeTest.method2();
	}

}
