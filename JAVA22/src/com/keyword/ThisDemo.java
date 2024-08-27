package com.keyword;
/*
 * This : Current Class Context
 * 1. When parameter variable name and class name are same.
 * 2. Use with class variable only
 */
class TDemo{
	int roll_no;
	String name;
	
	public void setData(int roll_no, String name) {
		this.roll_no = roll_no;
		this.name = name;
	}
	public void show() {
		System.out.println("Roll no. is "+roll_no);
		System.out.println("Name is "+name);
	}
}
public class ThisDemo {
	public static void main(String[] args) {
		TDemo td = new TDemo();
		td.setData(123, "JAY");
		td.show();
	}
}