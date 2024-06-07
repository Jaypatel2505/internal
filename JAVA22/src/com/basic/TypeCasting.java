package com.basic;
/*
 * Type Casting : Convert premitive one data type to another primmitive data type
 * 
 * List of types
 * - Implicit (Automatic) : Small datatype to bigger data type<int to long>
 * - Explicit : Bigger data type to smaller datatype<long to int>
 */
public class TypeCasting {
public static void main(String[] args) {
	//Implicit conversion
	int i1 = 10;
	long l1 = i1;
	System.out.println("Implicit conversion int to long: "+l1);
	
	//Explicit conversion
	int i2 = (int)l1;
	System.out.println("Explicit conversion long to int: "+i2);
		//int to byte
	int i3 = 256;
	byte b1 = (byte)i3;
	System.out.println("int to byte: "+b1); //it work on looping of min to max values of byte
		//char to int
	char ch = 'A';
	int i4 = (char)ch;
	System.out.println("Char to int: "+i4); //It works on ASCII code values
	
}
}
