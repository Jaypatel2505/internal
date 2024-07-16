package com.cmn_cls;
/*
 * String Buffer : Mutable
 */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("This is Tops Tech...");
		
		// Original Length & Values of string
		System.out.println("String values is: "+s1);
		System.out.println("String length is: "+s1.length());
		
		//Insert string into existing string
		//String s2 = "New";
		//s1.insert(0, s2.valueOf(s2));
		s1.insert(0, "Hi... ");
		System.out.println("String values is: "+s1);
		System.out.println("String length is: "+s1.length());
		
		// Append String
		s1.append("JAY");
		System.out.println("String values is: "+s1);
		System.out.println("String length is: "+s1.length());
		
		// Delete String
		s1.delete(0, 6);
		System.out.println("String values is: "+s1);
		System.out.println("String length is: "+s1.length());
		
		//Replace String
		s1.replace(20, 23, "");
		System.out.println("String values is: "+s1);
		System.out.println("String length is: "+s1.length());
		
		//Reverse String
		s1.reverse();
		System.out.println("String values is: "+s1);
		System.out.println("String length is: "+s1.length());
	}
}