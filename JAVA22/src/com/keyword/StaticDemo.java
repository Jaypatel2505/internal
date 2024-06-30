package com.keyword;
/*
 * Static : Constant at Memory Side
 * 
 * - Variable : Opposite of final
 * - Method : 
 * 	 1. Only Static variable are allowed inside static method.
 * 	 2. We can call static method by "Class Name" only but right now we can call with object.
 */
class SDemo{
	int i_no;
	static int s_no;
	
	public static void show() {
		s_no = 123;
		int r_no = 100;
		
		System.out.println("S no is :"+s_no);
		System.out.println("R no is :"+r_no);
	}
}
public class StaticDemo {
	public static void main(String[] args) {
		SDemo s1 = new SDemo();
		SDemo s2 = new SDemo();
		SDemo s3 = new SDemo();
		
		SDemo.show();
		
		s1.i_no = 1; //4 byte
		s2.i_no = 2; //4 byte
		s3.i_no = 3; //4 byte
		
		System.out.println("S1 of i No. Is : "+s1.i_no);
		System.out.println("S2 of i No. Is : "+s2.i_no);
		System.out.println("S3 of i No. Is : "+s3.i_no);
		
		s1.s_no = 10;
		s2.s_no = 20;	//4 byte
		s3.s_no = 30;
		
		System.out.println("S1 of s is :"+s1.s_no);
		System.out.println("S2 of s is :"+s2.s_no);
		System.out.println("S3 of s is :"+s3.s_no);
	}
}