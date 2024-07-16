package com.cmn_cls;
/*
 * Wrapper class : Conversion of primitive data type to non-primitive and vice a versa
 * 
 * Primitive type				Wrapper class
 * int							Interger.parseInt();
 * float						Float.parseFloat();
 * 
 * 
 * 1. Auto boxing : Value given to the object
 * 2. Boxing : Value first given to the variable to object
 * 3. Unboxing : Object to Variable
 * 
 * Object : It's a root class for all java class
 */
class First{
	public void show() {
		System.out.println("This is first class");
	}
}
public class WrapperClassDemo {
	public static void main(String[] args) {
		// Auto Boxing
		String s1 = new String("This is Tops tech...");
		System.out.println("Auto Boxing is: "+s1);
		
		// Boxing
		int i1 = 10;
		Integer i2 = new Integer(i1);
		System.out.println("Boxing is: "+i2);
		
		// UnBoxing
		int i3 = i2;
		System.out.println("Unboxing is: "+i3);
		
		//Convert type and sum of nummbers
		String str1 = "789";
		String str2 = "210";
		
		StringBuffer str3 = new StringBuffer(s1);
		
		System.out.println("sum is: "+(str1+str2));	//concat 2 string
		
		int i4 = Integer.parseInt(str1);
		int i5 = Integer.parseInt(str2);
		System.out.println("Sum is: "+(i4+i5));
		
		First f1 = new First();
		f1.show();
	}
}