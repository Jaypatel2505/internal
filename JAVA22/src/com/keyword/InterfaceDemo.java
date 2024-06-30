package com.keyword;
/*
 * Interface:
 * - Same as class but we can't create object of interface.
 * - All data member are final by default.
 * - All member function are abstract by default.
 * - Interface contains only data member and member function
 * - Main purpose is to solve the problem of multiple inheritance
 * - Use "implements" keyword to inherit interface
 * - It's pure data hiding
 */
class Result{
	String grade = "A+";
}

class InterDemo extends Result implements IDemo{
	@Override
	public void show() {
		System.out.println("I no is"+i_no);
		System.out.println("Grade is"+grade);
		System.out.println("I 2 is"+i2);
	}
}
public class InterfaceDemo{
	public static void main(String[] args) {
		InterDemo id = new InterDemo();
		id.show();
	}
}