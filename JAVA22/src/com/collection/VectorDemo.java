package com.collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/*
 * Vector:
 * 1. It is a dynamic array.
 * 2. Automatically implements List Interface
 * 3. Automatically shrink and grow
 * 4. Default size  is 0
 * 5. Default value is []
 * 6. Default Capacity is 10
 * 7. The sequence in which data is added and removed the same sequence it will display
 * 8. Duplicate values are allowed
 * 9. add() and remove() method
 * 
 * Vector							Arraylist
 * Double the capacity by 100%		Increase 50% of capacity
 * Performance is low				Performance is high
 * Synchronized						ASynchronized
 * 
 * Enumeration : 
 * - Only use with Vector.
 * - When you want display the values in list instead of [] we use Enumeration
 * 
 * Steps:
 * 1. First give all values to Enumeration object
 * 2. Use loop to traverse each object
 * 3. To display value
 */
public class VectorDemo {
	public static void main(String[] args) {
		Vector v1 = new Vector(3,1);
		
		System.out.println("Default values is :"+v1);
		System.out.println("Default size is :"+v1.size());
		System.out.println("Default capacity is :"+v1.capacity());
		
		v1.add(12);
		v1.add(34.5f);
		v1.add(34.5f);
		v1.add("Jay");
		v1.add("Jay");
		v1.add(12);
		v1.add(34.5f);
		v1.add("Jay");
		
		System.out.println("Default values is :"+v1);
		System.out.println("Default size is :"+v1.size());
		System.out.println("Default capacity is :"+v1.capacity());
		
		v1.remove(2);
		System.out.println("Default values is :"+v1);
		System.out.println("Default size is :"+v1.size());
		System.out.println("Default capacity is :"+v1.capacity());
		
		// Iterator Code
		Iterator i1 = v1.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
		// Enumeration code
		Enumeration e1 = v1.elements();
		while (e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
	}
}
