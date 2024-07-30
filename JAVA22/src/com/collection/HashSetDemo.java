package com.collection;

import java.util.HashSet;
import java.util.Iterator;

/*
 * HashSet:
 * 	- It's a dynamic array
 * 	- Automatically implements Set interface
 * 	- Automatically shrink and grow
 * 	- Default size is 0
 * 	- Default value is []
 * 	- All values has its won hash key
 * 	- All hash key are converted into hash code
 * 	- All values are displayed hash code wise
 * 	- Duplicate values are not allowed
 * 	- add() and remove() method
 * 	- For remove you have only one option which is value itself.
 */
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet h1 = new HashSet();
		
		System.out.println("Default value is :"+h1);
		System.out.println("Defalt size is : "+h1.size());
		
		h1.add(12);
		h1.add(56.45f);
		h1.add("Jay");
		h1.add('J');
		h1.add(new Integer(150));
		
		System.out.println("New value is :"+h1);
		System.out.println("New size is : "+h1.size());
		
		h1.add("Jay");		// Duplicate values
		
		System.out.println("New value is :"+h1);
		System.out.println("New size is : "+h1.size());
		
		h1.remove("Jay");
		
		System.out.println("New value is :"+h1);
		System.out.println("New size is : "+h1.size());
		
		// Iterator Code
		Iterator i1 = h1.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
		
	}
}
