package com.mm.inheritance;

public class RefrenceObject {
	public static void main(String[] args) {
		A a = new A();
		a.method1();
		
		A a1 = new B();
		a1.method1();
		
		
		
		///B b = new B(); b.method1(); b.method2();
		//B b1 = new A(); 
		
		//B c = new C(); c.method1(); c.method2();
		//A a2 = new C(); a2.method1();
	}

}

class A {
	public void method1() {
		System.out.println("A Method 1 Calling...");
	}
}

class B extends A {
	public void method1() {
		System.out.println("B Method 1 Calling...");
	}
	public void method2() {
		System.out.println("B Method 2 Calling...");
	}
}

/*class C extends B {
	public void method1() {
		System.out.println("C Method 1 Calling...");
	}
	public void method2() {
		System.out.println("C Method 2 Calling...");
	}
	public void method3() {
		System.out.println("C Method 3 Calling...");
	}
}*/
