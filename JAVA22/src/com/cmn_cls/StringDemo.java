package com.cmn_cls;
/*
 * Common Class List:
 * - String : String is immutable.
 * - String Buffer : It's Mutable
 * - Wrapper(Demo available in WrapperClassDemo File)
 * - Object
 */
public class StringDemo {
	public static void main(String[] args) {
		String s1 = "This is Tops Tech...";
		
		// Get Length & Values of string
		System.out.println("String values is: "+s1);
		System.out.println("String length is: "+s1.length());
		
		// Convert string
		System.out.println("To Upper Case: "+s1.toUpperCase());
		System.out.println("To Lower Case: "+s1.toLowerCase());
		
		// Find Position of char in string
		System.out.println("Char At: "+s1.charAt(2));
		
		// Print string from 'n' index
		System.out.println("Substing is: "+s1.substring(3));	//Start string from 'n' index
		System.out.println("Substing is: "+s1.substring(3, 9));	//Start string from 'n' and end string to 'n-1' index
		
		// Check String is same or not
		if (s1.equals("this is Tops Tech...")) {		//"equals", "equalIgnoreCase"
			System.out.println("Both String are same");
		} else {
			System.out.println("Both string are not same");
		}
		
		System.out.println("Removed String is: "+s1.replace("This", ""));
		// Get Length & Values of string
		System.out.println("String values is: "+s1);
		System.out.println("String length is: "+s1.length());			
	}
}