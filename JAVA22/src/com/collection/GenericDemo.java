package com.collection;

import java.util.ArrayList;

/*
 * Generic : To generalize the Collection into a specific type
 * 
 * ArrayList<Integer>
 * It will only take integer type of data
 */
public class GenericDemo {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		a1.add(34);
		a1.add(new Integer(67));
//		a1.add(34.6f);		// Due to float value we not able to add.
		System.out.println("Now value is :"+a1);
		System.out.println("Now Size is :"+a1.size());		
	}
}
