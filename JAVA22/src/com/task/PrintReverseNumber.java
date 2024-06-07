package com.task;

public class PrintReverseNumber {
public static void main(String[] args) {
	int no = 12345,no1, rev, a, b, c, d, e;
	
	no1 = no/10;
	e = no%10;
	
	no1 = no1/10;
	d = no1%10;
	
	no1 = no1/10;
	c = no1%10;
	
	no1 = no1/10;
	b = no1%10;
	
	a = no1%10;
	
	rev = e*10000 + d*1000 + c*100 + b*10 + a*1;
	System.out.println("The reverse number is "+rev);
	if (no == rev) {
		System.out.println("No are equal");
	}else {
		System.out.println("No are not equal");
	}
}
}