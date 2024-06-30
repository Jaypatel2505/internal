package com.oops;
import java.util.Scanner;
/*
 * Scanner
 * - It's Class
 * - Derived from java util package
 * - Main purpose is to take values from the user
 * - Use system.in as a parameter
 * 
 * Data Type		Scanner class function
 * int				nextInt()
 * float			nextFloat()
 * long				nextLong()
 * Boolean			nextBoolean()
 * Double			nextDouble()
 * char				next().charAt(0)
 * 
 * 
 * Class
 * String
 * word				next()		//Stop reading when space key is pressed
 * line				nextLine()	//Stop reading when enter key is pressed
 * 
 * 
 * 
 * For Buffer cleaning Use : nextLine();
 */
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Enter the value of a:");
		a=sc.nextInt();

		System.out.println("Enter the value of b:");
		b=sc.nextInt();
		
		System.out.println("Sum is:"+(a+b));
		
		char ch;
		
		System.out.println("Enter a charcter:");
		ch=sc.next().charAt(0);
		
		System.out.println("Char is:"+ch);
		
//		String name;
//		
//		System.out.println("Enter your Name:");
//		name = sc.next();
//		
//		System.out.println("Name is: "+name);
//		
//		sc.nextLine();	//Buffer Clean
		String name12;
		
		System.out.println("Enter Full name");
		name12 = sc1.nextLine();
		System.out.println("The Full name is: "+name12);
	}

}