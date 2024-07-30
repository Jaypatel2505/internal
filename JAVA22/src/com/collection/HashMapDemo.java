package com.collection;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * HashMap:
 * - It's a dynamic array
 * - Automatically implements Map interface
 * - Automatically shrink and grow
 * - Default size is 0
 * - Default value is {}
 * - It has pair <K,V>.
 * - All pair has its own hash key
 * - All hash key are converted into hash code
 * - All values are displayed hash code wise
 * - Duplicate values are not allowed
 * - put() and remove() method
 * - For remove you have only one option which is value itself.
 * 
 * ArrayList : If we use duplicate data
 * Hashset : Use Mainly for searching
 * HashMap : If value has to be address by key
 */
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap h1 = new HashMap();
		
		System.out.println("Default value is :"+h1);
		System.out.println("Default size is :"+h1.size());
		
		h1.put(1, 123444);
		h1.put("Jay", 982554028);
		h1.put("Jay", "Patel");
		h1.put(23.5f, 'J');
		
		System.out.println("Now value is :"+h1);
		System.out.println("Now size is :"+h1.size());
		
		h1.put("Jay", 982554028);
		System.out.println("Now value is :"+h1);
		System.out.println("Now size is :"+h1.size());
		
		h1.put(2, 123444);
		System.out.println("Now value is :"+h1);
		System.out.println("Now size is :"+h1.size());
		
		h1.remove(23.5f);
		System.out.println("Now value is :"+h1);
		System.out.println("Now size is :"+h1.size());
		
		Set set=h1.entrySet();
		Iterator i1 = set.iterator();
		
		while (i1.hasNext()) {
//			System.out.println(i1.next());
			//To seperate key & Values
			Map.Entry me = (Map.Entry) i1.next();
			
			System.out.println("Key is : "+me.getKey());
			System.out.println("Value is : "+me.getValue());			
		}
	}
}
