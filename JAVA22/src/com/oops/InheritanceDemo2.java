package com.oops;
/*
 * Hierarchical Inheritance : Single parent multiple child
 */
class Parent{
	String p_name;
	long ph_no;
	
	public void setParent() {
		p_name = "Jay Patel";
		ph_no = 9999999999l;
	}
}
class Child1 extends Parent{
	String name = "Vijay";
	
	public void show() {
		System.out.println("For any Complains of "+name+" "+p_name+" Call "+ph_no);
	}
}

class Child2 extends Parent{
	String name = "Raj";
	
	public void show() {
		System.out.println("For any Complains of "+name+" "+p_name+" Call "+ph_no);
	}
}
public class InheritanceDemo2 {
	public static void main(String[] args) {
		Child1 ch1 = new Child1();
		Child2 ch2 = new Child2();
		
		// First Child Data Get And Print
		ch1.setParent();
		ch1.show();
		
		// Second Child Data Get And Print
		ch2.setParent();
		ch2.show();
	}
}