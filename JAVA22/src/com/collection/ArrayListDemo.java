package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Collection : To collect primitive and non-Primitive values into a single object
 * 				It contains class and interface
 * 
 * Class
 * 1. ArrayList:
 * 	- It's a dynamic array
 * 	- Automatically implements list interface
 * 	- Automatically shrink and grow
 * 	- Default size is 0
 * 	- Default value is []
 * 	- The sequence in which data is added and removed the same sequence it will display
 * 	- Duplicate values are allowed
 * 	- add() and removed() method
 * 2. HashSet:
 *  - It's a dynamic array
 * 	- Automatically implements Set interface
 * 	- Automatically shrink and grow
 * 	- Default size is 0
 * 	- Default value is []
 * 	- All values has its won hash key
 * 	- All hash key are converted into hash code
 * 	- All values are displayed hash code wise
 * 	- Duplicate values are not allowed
 * 	- add() and removed() method
 * 	- For remove you have only one option which is value itself.
 * 3. HashMap
 * 4. Vector
 * 5. Generic
 * 
 * Interface
 * 1. List
 * 2. Set
 * 3. Map
 * 4. Iterator:
 * 	- When you want display the values in list instead of [] then we use iterator
 * 	Steps:
 * 	- First give all values to iterator object
 * 	- Use loop to traverse each object
 * 	- To display values
 * 5. Enumeration
 */
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		
		System.out.println("Default value is :"+a1);
		System.out.println("Defalt size is : "+a1.size());
		
		a1.add(12);
		a1.add(56.45f);
		a1.add("Jay");
		a1.add('J');
		a1.add(new Integer(150));
		
		System.out.println("New value is :"+a1);
		System.out.println("New size is : "+a1.size());
		
		a1.add("Jay");		// Duplicate values
		
		System.out.println("New value is :"+a1);
		System.out.println("New size is : "+a1.size());
		
		a1.remove(0);
		
		System.out.println("New value is :"+a1);
		System.out.println("New size is : "+a1.size());
		
		a1.remove("Jay");
		
		System.out.println("New value is :"+a1);
		System.out.println("New size is : "+a1.size());
		
		// Iterator Code
		Iterator i1 = a1.iterator();
		while (i1.hasNext()) {
			System.out.println(i1.next());
		}
	}
}