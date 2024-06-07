package com.task;

public class SwapValue {
public static void main(String[] args) {
	int c = 1;
	int d = 2;

	System.out.println("Original Value of C is : "+c);
	System.out.println("Original Value of D is : "+d+"\n");
	
	int e = c;
	c = d;
	d = e;

	//without temp variable declaration
//	c=c+d;
//	d=c-d;
//	c=c-d;

//	c=c*d;
//	d=c/d;
//	c=c/d;
	
	System.out.println("Swap Value of C is : "+c);
	System.out.println("Swap Value of D is : "+d);
	
}
}
