package com.basic;

public class DataType {
public static void main(String[] args) {
	int i1 = 2147483647;
	long l1 = 2686368128282991l;
	char ch = 'A';
	boolean b1 = false;
	byte bq = 127;
	
	float f1 = 12312.32323f;
	double d1 = 12121212.122121212121212121;
	
	System.out.println("Integer values is: "+i1);
	System.out.println("Long values is: "+l1);
	System.out.println("Charcter values is: "+ch);
	System.out.println("Boolean values is: "+b1);
	System.out.println("Byte values is: "+bq);
	System.out.println("Float values is: "+f1);
	System.out.println("Double values is: "+d1);
	System.out.println("\n");
	System.out.println("Data type Size");
	System.out.println("Integer values is: "+Integer.BYTES);
	System.out.println("Long values is: "+Long.BYTES);
	System.out.println("Charcter values is: "+Character.BYTES);
	System.out.println("Byte values is: "+Byte.BYTES);
	System.out.println("Float values is: "+Float.BYTES);
	System.out.println("double values is: "+Double.BYTES);
//	System.out.println("Boolean values is: "+Boolean.BYTES); 
}
}
