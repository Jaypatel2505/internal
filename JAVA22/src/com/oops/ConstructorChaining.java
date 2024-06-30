package com.oops;
/*
 * Overriding : Same fun. same parameter same return type but diff. fun. body/fun Defination
 * 
 * Keyword:
 * Super : Call the function of immediate parent
 */
class A{
	public void show() {
		System.out.println("In Class A show function");
	}
	
	public A() {
		System.out.println("In Constructor A");
	}
}

class B extends A{
	public void show() {
		super.show();
		System.out.println("In Class B show function");
	}
	
	public B() {
		System.out.println("In Constructor B");
	}
}

class C extends B{
	public void show() {
		super.show();
		System.out.println("In Class C show function");
	}
	
	public C() {
		System.out.println("In Constructor C");
	}
}

public class ConstructorChaining {
	public static void main(String[] args) {
		C c = new C();
		c.show();
	}
}
